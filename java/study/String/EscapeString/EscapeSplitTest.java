package test.string;

/**
 * Escape String
 * Escape String 처리 클래스 예제
 *
 * @author  Yunjin
 * @see     String
 * @since   JDK1.8
 */
public class EscapeSplitTest {

    public static void main(String[] args) {

        String str = "커피 || 커피>주문 ||커피>주문>아이스아메리카노 || 디카페인아이스아메리카노";
        String[] result = str.split("||");
        for (int i = 0; i < result.length; i++) {
            System.out.println("result[i] =" + result[i]);
        }

        // 정규식 표현으로 escape 문자열 자르기 (split 함수 사용)
        // 정해진 규칙을 escape 하려면 \ 를 앞에 붙이거나, \Q ... \E 로 감싸야 한다.
        str = str.replace(" ", "");
        String regExp = "\\Q||\\E";
        String[] result2 = str.split(regExp);
        for (int i = 0; i < result2.length; i++) {
            System.out.println("result2[i] =" + result2[i]);
        }
    }
}
