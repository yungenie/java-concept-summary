/**
 * 다형성(Polymorphism) 예제
 *
 * @author  Yunjin
 * @since   JDK1.8
 */
public class Polymorphism {
    public static void main(String[] args) {

        /**
         * 요약 : 조상과 자손의 상속관계
         * - 조상 자손 간의 형변환 가능 (조상 자손 관계의 참조변수는 서로 형변환 가능)
         * - 상속관계가 아닌 클래스 간의 형변환 불가
         * - 형변환할 때 실제 인스턴스(객체)가 무엇인지 중요함
         * - *조상 → 자손 형변환 실행시 에러남 (그러므로, 실제 객체가 중요)
         *
         * 내용 :
         * 1. 조상 타입의 참조변수로 자손/조상 타입의 자손객체를 가르킬 수 있다 (단, 자손의 멤버만 접근 불가)
         * 2. 자손 타입의 참조변수로 조상 타입의 조상객체를 가르킬 수 없다. (소스에러, 허용안됨)
         * 3. 자손 타입의 참조변수로 자손 타입의 조상객체를 가르킬 수 없다. (소스에러안남, 실행시 오류남)
         *
         *
         * 정상 : Parent p = new Child(); //(Parent)new Child() 형변환 생략 가능
         * 불가 : Child c = (Child)new Parent() // 작성 오류안남, 컴파일 실행시 오류
         * 불가 : Child c = new Parent() // error, (Parent)new Parent(); 형변환 생략됨됨
        * * */


        // 1.조상 타입의 참조 변수로 자손/조상 타입의 자손 객체를 다룰 수 있음
        //// not error, 자손객체는 조상객체를 상속받았기 때문에 조상객체는 자신이 물려준 멤버만 접근 가능
        Car c = new FireEngine(); //(Car)new FireEngine(); 형변환 생략됨
        c.color = "yello";
        c.door = 2;
        c.drive();
        c.stop();

        //// error, 위 인스턴스화 자손객체를 조상 타입으로 형변환 되었기 때문에 자손 고유의 멤버 접근 불가.(자신이 물려준 멤버만 접근 가능)
        c.water();

        // 2.자손타입의 참조변수로 조상 타입의 조상객체를 가르킬 수 없다
        //// error, 자손타입의 참조변수가 조상객체를 가르키고 있어 자손 객체의 멤버를 접근 못함
        FireEngine f = new Car(); //(Car)new FireEngine(); 형변환 생략됨

        // 3. 자손 타입의 참조변수로 자손 타입의 조상객체를 가르킬 수 있다. (자손 및 조상 멤버 모두 접근 가능)
        //// error, 형변환 타입만 맞으면 컴파일은 속아서 오류안남 (단, 컴파일러가 실행시 오류 뱉음)
        //// 조상객체가 자손타입으로 형변환가능하여 자손 타입의 참조변수는 조상 멤버, 자신의 멤버까지 접근 가능
        FireEngine fc = (FireEngine) new Car(); // 형변환 실행 에러 java.lang.ClassCastException
        fc.color = "red"; //컴파일 ok
        fc.door = 1;    // 컴파일 ok
        fc.drive();     // 컴파일 ok
        fc.stop();      // 컴파일 ok
        fc.water();     // 컴파일 ok

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