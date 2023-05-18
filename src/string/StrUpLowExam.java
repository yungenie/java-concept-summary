package string;

/**
 * 문자열 대소문자 변경
 */
public class StrUpLowExam {
    public static void main(String[] args) {
        // 문자열 대문자 변경
        String s = "YUnjiN";
        s = s.toUpperCase();
        System.out.println("s = " + s);

        // 문자열 소문자 변경
        s = s.toLowerCase();
        System.out.println("s = " + s);

        /*
        s.toUpper/LowerCase() 리턴타입이 String으로, String변수에 담아야 변경 적용이된다.
         */

    }
}
