package collectionframework.list.arraylist;

import java.util.Collections;
import java.util.ArrayList;

/**
 *  ArrayList 추가(add),범위(subList),정렬(Collections.sort),변경(set),검색(indexOf),삭제(remove) 기본 예제
 *  <p>
 *  <blockquote><pre>
 *  - ArrayList : 순서 유지 O, 중복 허용 O, 배열기반
 *  - add(Object o) : 객체만 저장가능
 *    → 매개변수 o는 autoboxing에 의해 기본형이 참조형으로 자동변환
 *  </pre></blockquote>
 *  </p>
 * @author Yunjin
 * @see Collections
 * @see ArrayList
 * @since JDK1.8

 */
public class ArrayListExam {

    public static void main(String[] args) {

        // 1. ArrayList 추가
        ArrayList list1 = new ArrayList(10);
        list1.add(new Integer(1));
        list1.add(1); // 컴파일러가 자동으로 오토박싱해주기 때문에 기본형으로 쓸 수 있는 것 이다.
        list1.add(10);
        list1.add(5);
        list1.add(9);
        list1.add(3);
        System.out.println("ArrayList 추가 : " + list1);

        // 2. ArrayList 지정된 범위 반환 subList
        list1.subList(1, 4); // ArrayList 일부를 뽑을 수 있다. 읽기전용 이기 때문에 새로운 ArrayList에 담아야 한다.
        ArrayList subList = new ArrayList(list1.subList(1, 4));
        System.out.println("subList 생성 : " + subList);

        // 3. ArrayList 정렬
        /* Collection : 인터페이스, Collections : util.class임
           List 인터페이스는 Collection 인터페이스를 상속받았다.
           ArrayList 클래스는 List 인터페이스를 구현한 클래스이다. */
        Collections.sort(list1);
        Collections.sort(subList);
        System.out.println("ArrayList 정렬 : " + list1);
        System.out.println("subList 정렬 : " + subList);

        // 4. ArrayList 중간추가 (지정된 index 추가, 문자열 추가가)
        list1.add(4, "5");
        System.out.println("ArrayList 중간추가 : " + list1);

        // 5. ArrayList 변경
        list1.set(1, "A");
        System.out.println("ArrayList 변경 : " + list1);

        // 6. ArrayList 검색
        // indexOf() 지정된 객체의 위치(인덱스)를 알려준다. 인덱스 위치로 찾는 게 아님.
        System.out.println("ArrayList indexOf(기본형) : " + list1.indexOf(5));
        System.out.println("ArrayList indexOf(객체) : " + list1.indexOf(new Integer(5)));
        System.out.println("ArrayList indexOf(문자열) : " + list1.indexOf("5"));

        // 7. ArrayList 삭제
        // remove 메소드는 2가지로 나눠짐. remove(int index), remove(Object o)
        // remove 오토박싱 안되니깐 정확하게 써줘야 한다.
        // ArrayList 중간삭제는 삭제과정 중 저장된 데이터의 이동이 많다. (배열내 원소 복사 발생, 성능느림)
        // 마지막부터 삭제는 배열 원소의 복사 안해도 됨. (빠름)
        list1.remove(5);
        list1.remove(new Integer(5));
        list1.remove("5");

        // 8. ArrayList 교집합 retainAll
        System.out.println("list1 : " + list1);
        System.out.println("subList : " + subList);
        System.out.println(list1.retainAll(subList));
        System.out.println("list1 : " + list1);
        System.out.println("subList : " + subList);

        // 9. ArrayList 차집합
        // 방법1
/*        for (int i = subList.size() -1 ; i >= 0 ; i--) {
            if (list1.contains(subList.get(i))) {
                subList.remove(i);
            }
        }*/

        // 방법2
        for (int i = 0 ; i < subList.size() ; i++) {
            if (list1.contains(subList.get(i))) {
                subList.remove(i);
            }
        }
        System.out.println("subList 차집합: " + subList);
    }
}
