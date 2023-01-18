package oop.inheritance;

/**
 * 다형성(Polymorphism) 참조변수의 형변환 기본 예제
 *
 *  <p><blockquote><pre>
 *  - 조상과 자손의 상속관계
 *  - 조상과 자손 간의 서로 형변환 가능
 *  - 형변환시 실제 인스턴스(객체)가 무엇인지 중요함
 *  </pre></blockquote></p>
 *  <ul>
 *  <li> 조상 → 자손 형변환 시 런타임 에러남
 *  <li> 자손 → 조상 형변환 시 컴파일 에러남
 * @author Yunjin
 * @see Car
 * @see FireEngine
 */
public class PolymorphismExam_Basic {
    public static void main(String[] args) {

        Car c =  new FireEngine(); //(Car)new FireEngine(); 형변환 생략가능
        c.color = "pink";
        c.door = 2;
        c.drive();
        c.stop();
        //c.water();
        /* 컴파일 오류남.
            아예 접근 할 수 없음. (Cannot resolve method 'water' in 'Car')
            자손객체를 조상 타입으로 형변환되었기 때문에 자손 고유의 멤버 접근 불가
            자신이 물려준 멤버만 접근 가능.
            즉, 자기 자신의 멤버만 접근 가능
         */

        FireEngine f = (FireEngine) new Car(); // (FireEngine) new Car(); 형변환 생략불가
        f.color = "red";
        f.door = 4;
        f.drive();
        f.stop();
        f.water();
        /*컴파일 오류 안나지만 런타임 에러남.
            인스턴스화에서 에러남. (Exception in thread "main" java.lang.ClassCastException)
            컴파일러가 실제 실행 했을 대 어떻게 되는 지 확인을 못해서 형변환 타입만 맞으면 컴파일 오류가 안나는 것임
        */

    }
}
class Car {
    String color;
    int door;

    void drive() { 	// 운전하는 기능
        System.out.println("drive, Brrrr~");
    }

    void stop() {  	// 멈추는 기능
        System.out.println("stop!!!");
    }
}
class FireEngine extends Car {	// 소방차
    void water() {	// 물을 뿌리는 기능
        System.out.println("water!!!");
    }
}