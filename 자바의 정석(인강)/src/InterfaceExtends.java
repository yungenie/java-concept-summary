/**
 * Interface 상속 예제
 *
 * @author  Yunjin
 * @since   JDK1.8
 */


class Test implements InterfaceExtends{

    @Override
    public void move(int x, int y) {
        System.out.println(x + y);
    }

    public static void main(String[] args) {
        Test test = new Test();
        test.attack();
    }
}


public interface InterfaceExtends extends Movable, Attackable{
    /*
     * Interface 상속
     * - 인터페이스 상속은 인터페이스만 가능
     * - 인터페이스의 조상은 인터페이스만 가능 (Object가 최고 조상 아님)
     * - 다중 상속이 가능 (추상메서드 충돌해도 문제 없음, 클래스는 다중 상속 안됨)
     * - 두 개의 인터페이스에 동일한 이름을 가지는 default 메서드가 존재할 경우, 충돌 해결 방법
     * */

    default void attack() {
        Movable.getId();
        // 상속받은 default 메소드들 충돌시 직접 조상 인터페이스 명시
        Movable.super.attack();
    }

    @Override
    void move(int x, int y);
}

interface Movable {
    void move (int x, int y);

    default void attack() {
        System.out.println("Move attack");
    }

    static String getId() {
        return "A123123";
    }
}

interface Attackable {
    void move (int x, int y);


    default void attack(){
        System.out.println("Double attrack");
    }
}