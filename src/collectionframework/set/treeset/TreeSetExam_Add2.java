package collectionframework.set.treeset;


import java.util.Set;
import java.util.TreeSet;

/**
 * TreeSet add(Object o) Comparable 구현 및 compareTo() 오버라이딩
 *
 * <p><blockquote><pre>
 *      - Set는 순서를 유지하지 않고 중복을 허용하지 않는 특징이 있습니다.
 *      - 중복 제거를 위해 add() 메서드 내부적으로 비교 후 저장을 합니다.
 *      - 비교할 때 비교 기준이 있어야 하는데, 그 비교 기준을 제공하는 Comparator이 있습니다.
 *      - Comparator 기준이 없으면 저장하는 객체의 Comparable를 사용합니다.
 * </p></blockquote></pre>
 * <ul>
 * <li> add(Object o) 저장할 o 객체의 클래스에 Comparable 인터페이스를 구현하여 compareTo() 오버라이딩합니다.</li>
 * <li> int compareTo(Object o) </li>
 * </ul>
 * @author Yunjin
 * @see Set
 * @see TreeSet
 * @see Comparable
 */
public class TreeSetExam_Add2 {
    public static void main(String[] args) {
        Set set = new TreeSet();

        set.add("abc");
        set.add("yunjin");
        set.add("abc");
        set.add("asdfasdf");
        set.add("asdfasdf");
        set.add(new Person("David",10));
        set.add("yunjin");
        set.add(new Person("David",10));
        set.add(new Person("David",10));
        set.add("yunjin");
        set.add(new Person("YUnjin",10));

        System.out.println(set);
    }
}

class Person implements Comparable{
    String name;
    int age;

    Person(String name, int age) {
        System.out.println("Person3() 메서드 실행");
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() { //Object toString() 오버라이딩
        return name +":"+ age;
    }

    @Override
    public int compareTo(Object obj) {
        System.out.println("compareTo() 메서드 실행");
        System.out.println(obj);
        if(!(obj instanceof Person)) return -1;

        Person p = (Person) obj;

        // 결과 확인
        System.out.println(this.name.equals(p.name) && this.age == p.age ? 0 : -1);

        return this.name.equals(p.name) && this.age == p.age ? 0 : -1;
    }
}
