package lambda;

import java.util.function.Function;
import java.util.function.Supplier;

/**
 *  람다식 작성하기 - 생성자 메서드 참조 예제 (객체 생성)
 *  <p>
 *  <blockquote><pre>
 *  - 생성자 메서드의 new(연산자) 참조.
 *  - 사용법? {@code 클래스명::연산자}
 *  - java.util.function 패키지 함수형 인터페이스에서 {@code Supplier<R>} 함수 사용.
 *  - java.util.function 패키지 함수형 인터페이스에서 {@code Function<T,R>} 함수 사용.
 *      -> 함수형 인터페이스에 정보가 있기 때문에 메서드 T(입력값 인자) 생략 가능.
 *  - T : Type, R : Return
 *  </pre></blockquote>
 *  </p>
 *
 *  ※ 메서드 참조 -> 람다식으로 변형하는 것도 공부해두기. (입력, 출력 확인)
 * @author Yunjin
 * @since 1.8
 */
public class GeneratorMethodReferenceExam01 {
    public static void main(String[] args) {
        // 생성자 메서드 참조
        Supplier<MyClass> s = () -> new MyClass();
        Supplier<MyClass> ss = MyClass::new;

        MyClass mc = ss.get();
        System.out.println(mc);
        System.out.println(ss.get());

        // 생성자 메서드 참조 - 인자 생략
        Function<Integer, MyClass2> f = (i) -> new MyClass2(i);
        Function<Integer, MyClass2> ff = MyClass2::new;

        MyClass2 mc2 = ff.apply(100);
        System.out.println(mc2.iv);
        System.out.println(f.apply(100).iv);
    }
}

class MyClass {}

class MyClass2 {
    int iv;

    public MyClass2(int iv) {
        this.iv = iv;
    }
}