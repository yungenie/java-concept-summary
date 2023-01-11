package collectionframework.set.hashset;

import java.util.HashSet;
import java.util.Objects;

/**
 * HashSet add() 활용 예제2 - equals(), hashCode() 오버라이딩 적용하여 중복 제거된 경우
 *
 *  <p><blockquote><pre>
 *  - add() 메서드 실행 시, equals(), hashCode() 호출해서 중복 유무를 확인합니다.
 *  - 해당 예제는 equals(), hashCode() 오버라이딩 적용한 예제 입니다.
 *  </pre></blockquote></p>
 *  <ul>
 *  <li> console result : [David:10, abc]
 *  <li> 결과? HashSet를 사용해서 중복된 데이터가 걸려졌습니다.
 *  <li> 이유? HashSet add()메소드를 실행할 때 equals(), hashCode()를 호출합니다.<p>
 *            - 중복의 유무를 확인하는 equals(), hashCode() 메서드 오버라이딩을 통해 중복된 데이터 저장하지 않도록 구현했습니다.
 *  <li> Objects.hash(Object....values)?<p>
 *      - 매개 값(가변인자)으로 주어진 값들을 이용해서 해시 코드를 생성하는 역할인 메서드 입니다.

 * @author Yunjin
 * @see HashSet
 * @see Object
 * @since 1.8
 */
public class HashSetExam_Add2 {
    public static void main(String[] args) {
        HashSet set = new HashSet();

        set.add("abc");
        set.add("abc");
        set.add(new Person2("David",10));
        set.add(new Person2("David",10));

        System.out.println(set); //toString 생략해도 된다.
    }
}
class Person2 {
    String name;
    int age;

    Person2(String name, int age) {
        System.out.println("Person2() 메서드 실행");
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() { //Object toString() 오버라이딩
        return name +":"+ age;
    }

    @Override
    public int hashCode() {
        System.out.println("hashCode() 메서드 실행");
        return Objects.hash(name, age); //어떤 의미인지 모르기 때문에 파악 필요.
    }

    @Override
    public boolean equals(Object obj) {
        System.out.println("equals() 메서드 실행");
        System.out.println(obj);
        if(!(obj instanceof Person2)) return false;

        Person2 p = (Person2) obj;

        // 결과 확인
        System.out.println(this.name.equals(p.name) && this.age == p.age);

        // 나 자신(this)의 이름과 나이 p와 비교
        return this.name.equals(p.name) && this.age == p.age;
    }
}