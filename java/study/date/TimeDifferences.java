import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 시분초 밀리세컨드 차이 예제
 *
 * @author  Yunjin
 * @since   JDK1.8
 */
public class TimeDifferences {

    public static void main(String[] args) throws ParseException {

        //시분초 밀리세컨드 차이
        SimpleDateFormat a = new SimpleDateFormat("hh:mm:ss.SSS");
        Date start = a.parse("11:16:23.705");

        SimpleDateFormat b = new SimpleDateFormat("hh:mm:ss.SSS");
        Date end = b.parse("11:17:55.757");

        System.out.println((start.getTime()-end.getTime())/1000.000);


    }

}
