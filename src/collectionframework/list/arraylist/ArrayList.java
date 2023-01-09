package collectionframework.list.arraylist;

import java.util.List;
/**
 * ArrayList 예제 테스트
 *
 * @author  Yunjin
 * @since   JDK1.8
 */
public class ArrayList {
    public static void main(String[] args) {

        /**
         *  remove(index), remove(object)
         *  subList(index from, index to) List 반환
         * */
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
