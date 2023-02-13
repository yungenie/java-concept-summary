package lambda;

/**
 *  람다식 작성하기 예제
 *  <p>
 *  <blockquote><pre>
 *  - 람다식(익명 객체)을 다루기 위한 참조변수의 타입은 함수형 인터페이스로 한다.
 *  </pre></blockquote>
 *  </p>
 *
 * @author Yunjin
 * @since 1.8
 */
public class LambdaExam01 {
    public static void main(String[] args) {

        // 람다식 작성하기
        Object obj = new Object() {
            int max(int a, int b) {
                return a > b ? a : b;
            }
        };

        //int value = obj.max(3, 5); //error

        // 익명 객체 만들기
        MyFunction myFunc =  new MyFunction() {
            @Override
            public int max(int a, int b) { // 오버라이딩 - 접근 제어자는 좁게 못바꾼다.
                return 0;
            }
        };

        int myFuncResult = myFunc.max(5, 17);


        // 익명 객체 람다식 사용하기
        MyFunction myFuncLamdba =  (a,b) -> a > b? a: b;
        int myFuncLamdbaResult = myFuncLamdba.max(3, 5);

    }

}

@FunctionalInterface
interface MyFunction { // 함수형 인터페이스 - 단 하나의 추상 메서드만 가져야함.
    public abstract int max(int a, int b); // public 생략가능
}

