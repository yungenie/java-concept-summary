/**
 * 내부 클래스 (Inner Class) 예제
 *
 * @author  Yunjin
 * @since   JDK1.8
 */

public class InnerClass { // 외부 클래스

    /**
     * 내부 클래스 : 클래스 안의 클래스
     * - 내부 클래스에서 외부 클래스의 멤버들을 쉽게 접근 가능
     * - 코드의 복잡성을 줄일 수 있음 (캡슐화)
     *
     * 핵심 : 해당 예제 핵심은 내부 클래스에서 외부 클래스의 private 변수 접근 가능능     * */

    int a = 1; // 클래스 변수
    private int aa = 1; //클래스 변수
    static int aaa = 10; // static 공통 변수

    class InstanceInner { // 내부 클래스 (인스턴스 클래스)
        int b = 3; // 클래스 변수
        int bb = aa; // 외부 클래스의 private 변수 접근 가능
        void innerMethod() {
            // 객체 생성없이 외부 클래스의 멤버에 접근 가능
            System.out.println(a);
            System.out.println(aa);

            //
            System.out.println(aaa);
            System.out.println(b);
        }

    }

    static class StaticInner { // static 클래스 (statis 내부 클래스)
        int c = 5;
        //static int d = 10;
    }

    void setMethod() {

        /** 지역 변수 메소드 종류와 함께 소멸
         * - 내부 클래스의 객체가 지역변수보다 더 오래 메모리에 남을 수 있음
         *
         * 상수 : 상수는 따로 관리
         * - Constant pool에서 관리해서 메소드 소멸해도 따로 관리해서 다른 클래스에서 접근 가능
         */
        // JDK 1.8부터 final 생략 가능
        // 지역 메소드의 지역 변수는 상수로 간주.
        String name = "yunjin";

        // error, 변수인데 값이 안바뀌면 상수로 취급
        //name = "yyunjin";

        final int age = 0;

        class LocalInner { // 지역 클래스 (지역 내부 클래스)
            int i = 777;
            // error, 변수인데 값이 안바뀌면 상수로 취급
            //i = 7;

            void setLocalMethod() {
                System.out.println(a);
                System.out.println(aa);
                System.out.println(aaa);
                // error
                //System.out.println(b);

                // JDK 1.7이하는 외부 클래스의 지역변수는 final 상수만 접근 가능
                // JDK 1.8부터 final 접근 가능
                System.out.println(name);
                String str = name;
            }

        }
    }

}

class InnerClassMain {
    public static void main(String[] args) {
        /**
         * 내부클래스 직접 접근 불가
         * 외부클래스 생성 후 생성 가능
         * */
        // error
        //InstanceInner instanceInner = new InstanceInner();

        InnerClass innerClass = new InnerClass();
        InnerClass.InstanceInner inner = innerClass.new InstanceInner();
        inner.innerMethod();
    }
}