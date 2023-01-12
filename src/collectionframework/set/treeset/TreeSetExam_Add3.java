package collectionframework.set.treeset;


import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;
/**
 * TreeSet(Comparator comp) Comparator 구현 및 compare(Object o1, Object o2) 오버라이딩
 *
 * <p><blockquote><pre>
 *      - Set는 순서를 유지하지 않고 중복을 허용하지 않는 특징이 있습니다.
 *      - 중복 제거를 위해 add() 메서드 내부적으로 비교 후 저장을 합니다.
 *      - 비교할 때 비교 기준이 있어야 하는데, 그 비교 기준을 제공하는 Comparator이 있습니다.
 *      - Comparator 기준이 없으면 저장하는 객체의 Comparable를 사용합니다.
 *      - TreeSet 생성자 자체에 정렬기준을 제공하는 생성자를 이용합니다.
 * </p></blockquote></pre>
 * <ul>
 * <li> TreeSet(Comparator comp) : 주어진 정렬 기준으로 정렬하는 TreeSet 생성합니다. </li>
 * <li> Comparator 인터페이스를 구현할 클래스를 만듭니다. </li>
 * <li> 해당 클래스에 compare(Object o1, Object o2) 오버라이딩 합니다. </li>
 * <li> compare(Object o1, Object o2) </li>
 * </ul>
 * @author Yunjin
 * @see Set
 * @see TreeSet
 * @see Comparable
 */
public class TreeSetExam_Add3 {
    public static void main(String[] args) {
        Set set = new TreeSet(new PersonComp());

        set.add("abc");
        set.add("yunjin");
        set.add("abc");
        set.add("abc");
        set.add("yunjin");
        set.add("yunjin");
        set.add(new Integer(1));
        set.add(new Integer(1));
        set.add(new Integer(2));
        set.add(new Integer(1));
        set.add(new Person2("David",10));
        set.add(new Person2("David",10));
        set.add(new Person2("Yunjin",10));
        return;
    }
}

class Person2{
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

}


class PersonComp implements Comparator<Object> {

    @Override
    public int compare(Object obj1, Object obj2) {
        System.out.println("compare() 메서드 실행");
        System.out.println("obj1 : " + obj1);
        System.out.println("obj2 : " + obj2);
        System.out.println("getName1 : " + obj1.getClass().getName());
        System.out.println("getName2 : " + obj2.getClass().getName());

        if (!obj1.getClass().getName().equals(obj2.getClass().getName())) {
            return -1;
        } else {
            if (obj1 instanceof String) {
                return (obj1.toString()).equals(obj2.toString()) ? 0 : -1;
            } else if (obj1 instanceof Person2) {
                return ((Person2) obj1).name.equals(((Person2) obj2).name) && ((Person2) obj1).age == ((Person2) obj2).age ? 0 : -1;
            } else {
                return -1;
            }
        }

    }
}