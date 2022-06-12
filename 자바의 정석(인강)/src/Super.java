/**
 * Super() 예제
 *
 * @author  Yunjin
 * @since   JDK1.8
 */
class Parent {
    Parent() {
        System.out.println("Parent 생성");
    }

    void init() {
        System.out.println("Parent의 init()");
    }
}

class Child extends Parent {
    Child() {
        super(); // 생략했을 때 컴파일러가 자동 추가
        System.out.println("Child 생성");
    }

    void init() {
        // 부모 메서드를 호출하는 경우
        super.init();
        System.out.println("Child의 init()");
    }
}
public class Super {
    public static void main(String[] args) {
        Child c = new Child();
        c.init();
    }
}
