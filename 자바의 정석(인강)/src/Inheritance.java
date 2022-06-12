/**
 * Inheritance 예제
 * - 상속관계 is a, has a
 *
 * @author  Yunjin
 * @since   JDK1.8
 */

class Point {
    int x;
    int y;
}

/*
    상속관계 (is-a : ~은 ~이다.)
    - 기존의 클래스를 재사용하여 새로운 클래스를 작성하는 방식이다.
 */
class Circle1 extends Point {
    int r;
}

/*
    포함관계 (has-a : ~는 ~을 가지고 있다.)
    - B클래스(=Circle2)에서 A클래스(=Point)의 기능을 이용하고 싶을 때,
      B의 멤버변수로 A를 넣어 주는 방식이다.
 */
class Circle2 {
    Point p;
    int r;
}
public class Inheritance {
    public static void main(String[] args) {
        /*
            클래스간의 관계 결정
            - 'is-a' 와 'has-a'를 가지고 문장을 만들어본다.
              : 원은 점이다. (Circle is a point)
              : 원은 점을 가지고 있다.  (Circle has a point)
              -> 위의 경우에는 has-a 관계가 더 자연스러운 경우이기때문에
                 포함관계로 설계한 Circle2를 사용하는 것이 더 적절하다.
         */

        Point point = new Point();
        point.x = 10;

        Circle1 circle1 = new Circle1();
        circle1.r = 100;
        circle1.x = 1000;

        Circle2 circle2 = new Circle2();
        circle2.p.x = 10000;




    }
}
