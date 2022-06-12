/**
 * This 예제
 * - 참조변수 this, 생성자 this()
 *
 * @author  Yunjin
 * @since   JDK1.8
 */
class A {
    int val1;
    int val2;

    public void init(int val1, int val2) {
        val1 = val1;
        val2 = val2;
    }
}

class B {
    int val1;
    int val2;

    void init(int val1, int val2) {
        this.val1 = val1;
        this.val2 = val2;
    }
}

class C {
    int val1;
    int val2;
    int val3;
    int val4;
    int val5;

    /*
        파라미터가 증가하여 생성자가 많아질수록 중복 코드는 늘어나게 된다.
        this() 메서드를 사용한다면 이러한 중복을 제거할 수 있다.
        C() {
            this.val1 = 1;
            this.val2 = 2;
            this.val3 = 3;
            this.val4 = 4;
            this.val5 = 5;
        }
        C(int val5) {
            this.val1 = 1;
            this.val2 = 2;
            this.val3 = 3;
            this.val4 = 4;
            this.val5 = val5;
        }
        C(int val4, int val5) {
            this.val1 = 1;
            this.val2 = 2;
            this.val3 = 3;
            this.val4 = val4;
            this.val5 = val5;
        }
    */

    C() {
        this.val1 = 1;
        this.val2 = 2;
        this.val3 = 3;
        this.val4 = 4;
        this.val5 = 5;
    }

    C(int val5) {
        this(); // 기본 생성자
        this.val5 = val5;
    }

    C(int val4, int val5) {
        this(val5);
        this.val4 = val4;
    }

}
public class This {
    public static void main(String[] args) {
        A a = new A();
        a.init(1, 2);
        System.out.println(a.val1 + "," + a.val2); // 0,0

        B b = new B();
        b.init(1, 2);
        System.out.println(b.val1 + "," + b.val2); // 1,2

        C c1 = new C(10);
        System.out.println(c1.val1 + "," + c1.val2 + "," + c1.val3 + "," + c1.val4 + "," + c1.val5); // 1,2,3,4,10

        C c2 = new C(9, 10);
        System.out.println(c2.val1 + "," + c2.val2 + "," + c2.val3 + "," + c2.val4 + "," + c2.val5); // 1,2,3,9,10
    }

}
