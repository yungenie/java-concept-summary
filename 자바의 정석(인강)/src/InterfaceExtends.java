/**
 * Interface 상속 예제
 *
 * @author  Yunjin
 * @since   JDK1.8
 */
public interface InterfaceExtends extends Movable, Attackable{
    /*
    * Interface 상속
    * - 인터페이스의 조상은 인터페이스만 가능 (Object가 최고 조상 아님)
    * - 다중 상속이 가능 (추상메서드 충돌해도 문제 없음, 클래스는 다중 상속 안됨)
    * -
    * */

    default void attack() {
        Movable.getId();
        Movable.super.attack();
    }

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
    default void attack(){
        System.out.println("Double attrack");
    }
}