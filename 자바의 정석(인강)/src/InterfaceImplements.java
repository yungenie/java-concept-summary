/**
 * Interface 구현 예제
 *
 * @author  Yunjin
 * @since   JDK1.8
 */

public class InterfaceImplements implements Space{ //public 이면 오류남. // 에러 안남..

    /**
     * 인터페이스 구현
     * - 인터페이스에 정의된 추상 메서드를 모두 구현 하는 것
     * - 인터페이스의 구현은 클래스를 통해 해야함
     * */
    @Override
    public void sky(String x, int y) {

    }

    @Override
    public void star(int i) {
        String sing = "반짝 반짝 작은 별 ~";
        System.out.println(sing + "별 %d 개");
    }
}

abstract class Earth implements Space {

    /**
     * 인터페이스 구현
     * - 일부만 구현하는 경우 클래스 앞에 abstract 키워드 붙여야함
     *
     * */
    @Override
    public void sky(String x, int y) {
        System.out.println("%s 행성");
        System.out.println("밤하늘의 퍼얼~ 루이비통 루이비통");
    }

    /**
     * 추상 메서드 생략가능.
     * - 생략할 때 소스에 보이진 않지만 추상 메서드이기 때문에 클래스 앞에 abstract 키워드를 붙이는 것
     * */
    public abstract void star(int i);

}

interface Space {
    public abstract void sky(String x, int y); // public abstract 생략가능
    public abstract void star(int i); //public abstract 생략가능

}