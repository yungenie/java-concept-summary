package lambda;

import java.util.function.Function;

/**
 *  Lambda - 배열과 메서드 참조 예제 (i의 크기를 가진 배열 생성 후 반환)
 *
 *  <p>
 *  <blockquote><pre>
 *  - int[](배열)의 연산자(new) 참조.
 *  - 사용법? {@code 클래스명::연산자}
 *  - java.util.function 패키지 함수형 인터페이스에서 {@code Function<T,R>} 함수 사용.
 *      -> 함수형 인터페이스에 정보가 있기 때문에 메서드 T(입력값) 생략 가능.
 *  - T : Type, R : Return
 *  </pre></blockquote>
 *  </p>
 *  ※ 메서드 참조 -> 람다식으로 변형하는 것도 공부해두기. (입력, 출력 확인)
 * @author Yunjin
 * @see Function
 * @since 1.8
 */
public class ArrayMethodReferenceExam01 {
    public static void main(String[] args) {
        Function<Integer, int[]> f2 = (i) -> new int[i];
        Function<Integer, int[]> ff2 = int[]::new;

        int[] arr = f2.apply(100);
        System.out.println(arr.length);
        System.out.println(f2.apply(100).length);

    }
}
