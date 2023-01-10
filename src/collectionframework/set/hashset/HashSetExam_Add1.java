package collectionframework.set.hashset;

import java.util.HashSet;

public class HashSetExam_Add1 {
    public static void main(String[] args) {
        HashSet set = new HashSet();

        set.add("abc");
        set.add("abc");
        set.add(new Person("David",10));
        set.add(new Person("David",10));

        System.out.println(set);
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

/*
* console result :
[abc, David:10, David:10]

* 결과?
* - HashSet는 중복을 허용하지 않다고 했는데, 중복 제거가 안됬다.
*
* 이유?
* - equals()와 hashCode()를 오버라이딩해야 HashSet이 바르게 동작한다.
*
* toString()는 어디서 오버라이딩 하는 것인가?
* - Object 클래스
* - 눈에 보이진 않지만 Object의 상속을 받은 것임
* - public class HashSetExam_Add extends Object { } extends Object 생략된 것
* - Object 클래스의 모든 메소드는 모든 클래스가 사용이 가능합니다.
* - 따라서 Object 클래스에 toString()을 오버라이딩 할 수 있습니다.
*
* toString() 메서드란
* - 모든 클래스의 객체는 그 이름을 출력에 사용하게 되면 자동적으로 toString() 메서드를 호출하게 된다.
* - toString()을 직접 적어도 되지만 생략 할 수 있다.
* */