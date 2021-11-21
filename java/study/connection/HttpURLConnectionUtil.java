package lai.module.starter.endpoint.util;

import com.google.gson.Gson;
import lombok.Cleanup;

import java.io.*;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.ProtocolException;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;

/**
 *  The {@code HttpURLConnectionUtil} class represents RestAPI Connection.
 *  <p>
 *  <blockquote><pre>
 *      HttpURLConnection POST Method
 *  </pre></blockquote>
 *
 *  @author  yunjin
 *  @author  young guen
 *  @see     com.google.gson.Gson
 *  @see     java.net.URL
 *  @see     java.net.HttpURLConnection
 *  @see     java.io.BufferedWriter
 *  @see     java.io.OutputStreamWriter
 *  @see     java.io.BufferedReader
 *  @see     java.io.InputStreamReader
 *  @see     java.lang.StringBuffer
 *  @since   JDK1.8
 *
 * */
public class HttpURLConnectionUtil {

    private static final String HOST_URL = "http://localhost:8080/";
    private final Gson gson = new Gson();

    private static class InnerInstanceClass {
        private static final HttpURLConnectionUtil instance = new HttpURLConnectionUtil();
    }

    public static HttpURLConnectionUtil getInstance() {
        return InnerInstanceClass.instance;
    }

    public Map httpConnect(String key, String strRequestVO){

        //Http Connection Object Declare
        URL url = null;
        HttpURLConnection conn = null;

        //Http Connection Req&Res Object Declare
//        BufferedWriter bw = null;
//        BufferedReader br = null;

        //Http Result Return
        Map resultMap = new HashMap();

        try {
            // Http Connection
            url = new URL(HOST_URL + key);
            conn = (HttpURLConnection) url.openConnection();

            if (conn != null) {
                // Request Setting
                conn.setRequestMethod("POST");
                conn.setRequestProperty("Content-Type","application/json; utf-8");
                conn.setRequestProperty("Accept","application/json; utf-8");
                conn.setDoOutput(true);
                conn.setDoInput(true);
                conn.setConnectTimeout(50000);

                // Http Send-Off
                @Cleanup BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(conn.getOutputStream()));
                bw.write(strRequestVO);
//                bw.flush();
//                bw.close();

                // Http Response
                String response = null;
                int resCode = conn.getResponseCode();
                if (resCode == HttpURLConnection.HTTP_OK) {
                    @Cleanup BufferedReader br = new BufferedReader(new InputStreamReader(conn.getInputStream(),"UTF-8"));
                    StringBuffer sb = new StringBuffer();
                    String responseLine = null;
                    while ((responseLine = br.readLine()) != null) {
                        sb.append(responseLine);
                    }
                    response = sb.toString();

                } else {
                    response = "";
                }
                resultMap.put("resCode", resCode);
                resultMap.put("resResult", response);

                return resultMap;
            }
        } catch (MalformedURLException e) {
            resultMap.put("resCode", 99996);
            resultMap.put("resResult", "MalformedURLException");
            e.printStackTrace();
        } catch (ProtocolException e) {
            resultMap.put("resCode", 99997);
            resultMap.put("resResult", "ProtocolException");
            e.printStackTrace();
        } catch (IOException e) {
            resultMap.put("resCode", 99998);
            resultMap.put("resResult", "IOException");
            e.printStackTrace();
        } catch (Exception e) {
            resultMap.put("resCode", 99999);
            resultMap.put("resResult", "unknown Exception");
            e.printStackTrace();
        }finally {
            try {
                if (conn != null) {
//                    br.close();
                    conn.disconnect();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        return resultMap;
    }

}
