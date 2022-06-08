/**
 * Interface 구현 예제
 *
 * @author  Yunjin
 * @since   JDK1.8
 */

class InterfaceImplements implements Space{ //public 이면 오류남.

    /**
     * 인터페이스 구현
     * - 인터페이스에 정의된 추상 메서드를 모두 구현 하는 것
     *
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
}

interface Space {
    public abstract void sky(String x, int y);
    void star(int i);

}