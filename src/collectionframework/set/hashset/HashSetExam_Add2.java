package collectionframework.set.hashset;

import java.util.HashSet;
import java.util.Objects;

public class HashSetExam_Add2 {
    public static void main(String[] args) {
        HashSet set = new HashSet();

        set.add("abc");
        set.add("abc");
        set.add(new Person2("David",10));
        //set.add(new Person2("David",10));

        System.out.println(set); //toString 생략해도 된다.
    }
}
class Person2 {
    String name;
    int age;

    Person2(String name, int age) {
        System.out.println("Person2()메서드 실행");
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() { //Object toString() 오버라이딩
        return name +":"+ age;
    }

    @Override
    public int hashCode() {
        System.out.println("hashCode()메서드 실행");
        //int hash(Object....values); 가변인자
        return Objects.hash(name, age);
    }

    @Override
    public boolean equals(Object obj) {
        System.out.println("equals()메서드 실행");
        System.out.println(obj);
        if(!(obj instanceof Person2)) return false;

        Person2 p = (Person2) obj;

        // 나 자신(this)의 이름과 나이 p와 비교
        return this.name.equals(p.name) && this.age == p.age;
    }
}

/*
* result :
[David:10, abc]

*
* 데이터가 같은 게 들어오면 equals() 메서드를 호출하나..?
* */