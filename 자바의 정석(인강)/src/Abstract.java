/**
 * Abstract 클래스 예제
 *
 * @author  Yunjin
 * @since   JDK1.8
 */
abstract public class Abstract {

    /**
     * 추상 메서드를 갖고 있는 클래스 (추상 클래스 abstract 제어자 필수)
     * 추상 클래스 용도 : 자손마다 다르게 구현될 것으로 예상되는 경우  추상 클래스 만듬
     * 추상 메서드 : 미완성 메서드. 몸통 블럭{} 없음
     * */
    abstract void play();
    //abstract void AutoPlay();
    //abstract void play(){}; // error
    public void musicPlay(){} // not error
    public static void geniePlay(){} // not error

    public static void main(String[] args) {
        // 추상 클래스는 상속을 통해 완성해야 객체 생성 가능
        // 미완성 객체이므로 인스턴스 생성 불가
        //Abstract a = new Abstract(); // error
    }


}

class Yolo extends Abstract {

    /** Abstract 클래스에 선언된 추상메서드 모두 Override 해야함. 안하면 오류남.
     * 상속받은 메소드 Override 안할 경우 abstract class Yolo extends Abstract 자손도 abstract 제어자 써야함함     * */
    @Override
    void play() {
        System.out.println("My life Yolo want.. 한번뿐인 인생 하고싶은 거 다 하자가 아닌" +
                "명확한 목표 아래 방향성을 가지고 미친듯이 노력해서 부를 이루고 노등을 하지 않아도 돈이 들어오는 수입라인을 만들어서 " +
                "노후의 삶에서는 배우고 싶고 도전해보고 싶은 것들 다 해보고면서 살고싶다.");
    }
    void stop() {
        System.out.println("잠시 쉬기");
    }

}

class Me {
    public static void main(String[] args) {
        Yolo yolo = new Yolo();
        yolo.play();
        yolo.stop();

        Abstract a = new Yolo();
        a.play();
        //a.stop(); //error,  Abstract 객체에는 없는 함수.

    }
}
