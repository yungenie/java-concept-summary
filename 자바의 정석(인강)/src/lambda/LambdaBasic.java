/**
 * 람다식 작성 및 함수형 인터페이스
 *
 * @author yunjin
 * @since JDK1.8
 * @see FunctionalInterface
 *
 * */
@FunctionalInterface
interface MyFunction {
    public abstract void run(); // == void run();
}


public class LambdaBasic {
    static void execute(MyFunction f) {
        f.run();
    }

    static MyFunction getMyFunction() {
        MyFunction f = () -> System.out.println("getMyFunction.run()");
        return f;
    }

    public static void main(String[] args) {
        // Lambda, 람다식으로 인터페이스 구현
        MyFunction f1 = () -> System.out.println("f1.run() 호출");
        f1.run();
        execute(f1);
        execute(() -> System.out.println("f1.run() execute() 파라미터에 람다식 구현"));

        // Anonymous Class, 익명클래스로 인터페이스 구현
        MyFunction f2 = new MyFunction() {
            @Override
            public void run() {
                System.out.println("f2.run() 호출");
            }
        };
        f2.run();
        execute(new MyFunction() {
            @Override
            public void run() {
                System.out.println("f2.run() execute() 파라미터에 익명클래스 구현");
            }
        });

        // function, 람다식으로 인터페이스 구현한 함수 호출
        MyFunction f3 = getMyFunction();
        f3.run();
        execute(f3);

        /** 실행결과
        f1.run() 호출
        f1.run() 호출
        f1.run() execute() 파라미터에 람다식 구현
        f2.run() 호출
        f2.run() execute() 파라미터에 익명클래스 구현
        getMyFunction.run()
        getMyFunction.run()
        */

    }
}
