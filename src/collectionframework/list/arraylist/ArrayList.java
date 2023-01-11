package collectionframework.list.arraylist;

import java.util.Collection;
import java.util.List;
/**
 * ArrayList 삭제(remove), 검색(subList) 기본 예제
 *  <p>
 *  <blockquote><pre>
 *  삭제(remove) : remove(index), remove(object)
 *  검색(subList) : subList(index from, index to) List 반환
 *  </pre></blockquote>
 *  </p>
 *
 * @author  Yunjin
 * @see Collection
 * @see ArrayList
 * @since 1.8
 */
public class ArrayList {
    public static void main(String[] args) {

        java.util.ArrayList list = new java.util.ArrayList();
        list.add("자바의 정석");
        list.add("1강");
        list.add("2강");
        list.add("3강");
        list.add(4);
        System.out.println("list = " + list);
        list.remove(3); //인덱스가 3인 객체를 삭제
        list.remove(new Integer(4)); // 4 값을 가지고 있는 객체를 삭제
        System.out.println("list = " + list);

        java.util.ArrayList list2 = new java.util.ArrayList<>(list.subList(0,3)); // 보통 읽기 전용으로 사용할때, from~to index list반환
        System.out.println("list2 = " + list2);

        List listt = list.subList(0,2);
        System.out.println("listt = " + listt);


    }
}
