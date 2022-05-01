package test;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import lombok.extern.slf4j.Slf4j;

/**
 * GSON을 사용하여 JSON 내에서 값을 수정하는 방법의 예
 * JsonElement null 처리
 *
 * @author Yunjin
 * @see JsonElement,JsonObject,JsonParser
 * @since JDK1.8
 */
@Slf4j
public class GsonJsonElementValueUpdateTest {
    public static void main(String[] args) {
        String guidCode = "";
        String sb = "{\"status\":\"fail\",\"message\":\"서버 오류가 발생되었습니다.\",\"guid\":\"\"}";
        //String sb = "{\"status\":\"fail\",\"message\":\"서버 오류가 발생되었습니다.\",\"guid\":\"ASDFEW349349\"}";

        JsonParser jsonParser = new JsonParser();
        JsonObject jsonObjectData = (JsonObject) jsonParser.parse(sb.toString());

        log.debug("jsonObjectData : " + jsonObjectData);
        log.debug("status : " + jsonObjectData.get("status"));
        log.debug("guid : " + jsonObjectData.get("guid"));

        JsonElement guid = jsonObjectData.get("guid");
        System.out.println("ISNULL : " + guid.isJsonNull());

        if (guid.isJsonNull()) { //JsonElement null 처리
            jsonObjectData.addProperty("guid", "empty"); //해당 Key의 value 값이 null 일 때 처리
        }

        log.debug("jsonObjectData : " + jsonObjectData);

        guidCode = jsonObjectData.get("guid").getAsString();
        log.debug("guidCode : " + guidCode);

    }
}
