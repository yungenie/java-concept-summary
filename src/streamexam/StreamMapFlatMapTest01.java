package streamexam;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StreamMapFlatMapTest01 {
    public static void main(String[] args) {

        /* Stream map 테스트 */
        List<Person> people = Arrays.asList(
            new Person("personA", 24),
            new Person("personB", 26),
            new Person("personC", 28),
            new Person("personD", 30)
        );

        List<String> peopleList = people.stream()
            .map(person -> person.getName())
            //.map(Person::getName) // 람다 표현식으로 변경가능
            .toList();
            //.collect(Collectors.toList());

        System.out.println("==========Stream map 객체 출력 ===========");
        System.out.println(peopleList); // [personA, personB, personC, personD]

        // split 테스트
        String str = "yunjin";
        String[] split = str.split("");
        System.out.println("==========split 출력===========");
        System.out.println(Arrays.stream(split).toList());

        /* Stream flatMap 테스트 */
        List<String> animals = new ArrayList<>();
        animals.add("cat");
        animals.add("dog");

        System.out.println(animals); // [cat, dog] // List 인터페이스 구현한 클래스는 toString() 재정의

        List<String[]> animalsList = animals.stream()
            .map(animal -> animal.split("")) // animal.split() 반환타입은 String[]
            .toList();

        System.out.println("==========Stream map ArrayList to List<String[]> 출력===========");
        animalsList.forEach(arr -> System.out.println(Arrays.toString(arr))); // [[c, a, t] [d, o, g]]

        String[] arrs = {"cat","dog"};
        System.out.println("==========String[] 테스트===========");
        System.out.println(arrs); // [Ljava.lang.String;@3f99bd52 배열의 요소를 출력하지 않고 배열 객체의 클래스명과 해시코드를 포함한 문자열을 반환
        System.out.println(Arrays.toString(arrs)); // 배열의 모든 요소를 문자열로 반환

        List<String[]> arrsList = Arrays.stream(arrs)
            .map(val -> val.split(""))
            .toList();
        System.out.println("==========Stream map String[] to List<String[]> 출력===========");
        animalsList.forEach(arr -> System.out.println(Arrays.toString(arr))); // [[c, a, t] [d, o, g]]

        /* flatmap 테스트 */
        List<String> arrsList2 = Arrays.stream(arrs)
            .map(animal -> animal.split(""))
            .flatMap(Arrays::stream)
            //.flatMap(array -> Arrays.stream(array))
            .toList();

        System.out.println("==========Stream flatmap List<String[]> 출력 ===========");
        System.out.println(arrsList2); // [c, a, t, d, o, g]

    }

}


class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
