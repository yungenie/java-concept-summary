package lambda;

import java.util.function.Function;

/**
 *  Lambda - static 메서드 참조 (문자열을 숫자형으로 변환)
 *  <p>
 *  <blockquote><pre>
 *  - Integer(Wrapper Class)의 parseInt(staic 메서드) 참조.
 *  - 사용법? {@code 클래스명::메서드명}
 *  - java.util.function 패키지 함수형 인터페이스에서 {@code Function<T,R>} 함수 사용.
 *      -> 함수형 인터페이스에 정보가 있기 때문에 메서드 T(입력값) 생략 가능.
 *  - T : Type, R : Return
 *  </pre></blockquote>
 *  </p>
 *  ※ 메서드 참조 -> 람다식으로 변형하는 것도 공부해두기. (입력, 출력 확인)
 * @author Yunjin
 * @see Function
 * @see Integer
 * @since 1.8
 */
public class MethodReferenceExam01 {
    public static void main(String[] args) {

        Function<String, Integer> f = (String s) -> Integer.parseInt(s);
        Function<String, Integer> f1 = Integer::parseInt;

        System.out.println(f1.apply("100")+200);
    }
}
