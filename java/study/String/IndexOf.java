/**
 * String indexOf 예제
 *
 * @author  Yunjin
 * @since   JDK1.8
 */
public class IndexOf {
    public static void main(String[] args) {

        /* indexOf()
        : 특정 문자나 문자열이 앞에서부터 처음 발견되는 인덱스를 반환하며 만약 찾지 못했을 경우 "-1"을 반환합니다.*/
        String str = "run.txt";
        System.out.println(str.indexOf("."));

        String str2 = "runrun";
        System.out.println(str2.indexOf("."));
    }
}
