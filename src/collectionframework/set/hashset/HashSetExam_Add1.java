package collectionframework.set.hashset;

import java.util.HashSet;

/**
 * HashSet add() 활용 예제1 - equals(), hashCode() 오버라이딩 하지 않아 중복 제거가 안된 경우
 *
 *  <p><blockquote><pre>
 *  - add() 메서드 실행 시, equals(), hashCode() 호출해서 중복 유무를 확인합니다.
 *  - 해당 예제는 equals(), hashCode() 오버라이딩 적용하지 않은 예제 입니다.
 *  </pre></blockquote></p>
 *  <p>
 *  <ul>
 *  <li> console result : [abc, David:10, David:10]
 *  <li> 결과? HashSet는 중복을 허용하지 않다고 했지만 중복 제거가 되지 않았습니다.
 *  <li> 이유? equals()와 hashCode()를 오버라이딩해야 HashSet이 바르게 동작하기 때문입니다.
 *  <li> toString()의 오버라이딩 출처? Object 클래스.
 *      <p>
 *      <blockquote><pre>
 *      - 눈에 보이진 않지만 Object의 상속을 받은 것 입니다.
 *      - {@code public class HashSetExam_Add extends Object {} }
 *        //extends Object 생략가능
 *      - Object 클래스의 모든 메소드는 모든 클래스가 사용이 가능합니다.
 *      - 따라서 Object 클래스에 toString()을 오버라이딩 할 수 있습니다.
 *      </pre></blockquote>
 *      </p>
 *  <li> toString() 메서드란?
 *      <p>
 *      <blockquote><pre>
 *      - 모든 클래스의 객체는 그 이름을 출력에 사용하게 되면
 *        자동적으로 toString() 메서드를 호출하게 됩니다.
 *      - toString()을 직접 적어도 되지만 생략 할 수 있습니다.
 *      </pre></blockquote>
 *      </p>
 *  <li> 정리
 *      <p>
 *      <blockquote><pre>
 *      - Object 클래스의 메소드는 모든 클래스가 사용 가능합니다.
 *      - 생략되어서 눈에는 보이지 않지만 모든 클래스는 Object를 상속받은 것 입니다.
 *      - toString()는 모든 클래스 객체 이름을 출력할 때 자동으로 메서드를 호출합니다.
 *      - 직접 적어도 되지만 생략 할 수 있습니다.
 *      </pre></blockquote>
 *      </p>
 *  </ul>
 *  </p>
 * @author yunjin
 * @see HashSet
 * @see Object
 */
public class HashSetExam_Add1 {
    public static void main(String[] args) {
        HashSet set = new HashSet();

        set.add("abc");
        set.add("abc");
        set.add(new Person("David",10));
        set.add(new Person("David",10));

        System.out.println(set); //toString 생략해도 된다.
    }
}
class Person {
    String name;
    int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() { //Object toString() 오버라이딩
        return name +":"+ age;
    }
}