package collectionframework.set.hashset;


import java.util.*;

/**
 * HashSet에 저장된 Interger객체(요소) 순서대로 정렬하는 예제
 *
 * Set는 순서를 유지하지 않기 때문에 순서 유지가 되는 List를 사용
 * Collections.sort(List<T> list)
 * sort메서드는 List만 허용된다.
 *
 * @author yunjin
 * @see Collection
 * @see HashSet
 * @see Set
 * @see java.lang.Math
 * @see List
 * @see LinkedList
 * @see Object
 * @Date 20230109
 */
public class HashSetExam_Sort {
    public static void main(String[] args) {
        Set set = new HashSet();

        // set의 크기(저장공간)가 6보다 작으며, 1~45 사이의 난수를 저장 합니다.
        for (int i = 0; set.size() < 6; i++) {
            // Math.random() : 0.0이상 1.0 미만 사이의 값을 반환하는 함수
            int num = (int)(Math.random()*45) + 1;
            set.add(new Integer(num));
        }
        // 단순 출력
        System.out.println(set);

        // 정렬 후 출력
        List list = new LinkedList(set);
        Collections.sort(list);
        System.out.println(list);

    }
}
