/**
 * Instanceof 연산자 예제
 *
 * @author  Yunjin
 * @since   JDK1.8
 */

public class InstanceOf {
    public static void main(String[] args) {
        Car car = new Car();
        Car fireEngine = new FireEngine();
        FireEngine f = new FireEngine();
        Car ambulance = new Ambulance();

        System.out.println(f instanceof Car); // true
        System.out.println(car instanceof FireEngine); // false

        // InstanceOf 연산자로 형변환 되는 지 확인
        doWork(car); // car instanceof FireEngine/Ambulance => false
        doWork(fireEngine);
        doWork(ambulance);
        //doWork(fc);
    }

    public static void doWork(Car car) {
        /*
            자손객체의 타입을 체크하기 위해 instanceof 연산자를 사용함 (인스턴스의 타입을 체크함)
            단, 상속관계에서 각 인스턴스의 고유한 기능을 사용하기 위해선 형변환 필요함
         */

        if (car instanceof FireEngine) {
            FireEngine fireEngine = (FireEngine) car;
            fireEngine.water();
        } else if (car instanceof Ambulance) {
            Ambulance ambulance = (Ambulance) car;
            ambulance.siren();
        }
    }

}
class Car {
    void drive() {
        System.out.println("drive");
    }

    void stop() {
        System.out.println("stop");
    }
}


class FireEngine extends Car {
    void water() {
        System.out.println("water");
    }
}

class Ambulance extends Car {
    void siren() {
        System.out.println("siren");
    }
}

