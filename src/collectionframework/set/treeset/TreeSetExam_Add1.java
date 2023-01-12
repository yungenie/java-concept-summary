package collectionframework.set.treeset;

import java.util.Set;
import java.util.TreeSet;
/**
 * TreeSet add(Object o) 기본 예제 - ㅇ인자에 Wrapper 클래스로 넘겨주기
 *
 *  <p><blockquote><pre>
 *  - TreeSet : 범위검색, 정렬에 유리한 클래스
 *  - HashSet : 정렬 필요 (List 생성 후 sort() 해야함)
 *  </pre></blockquote></p>
 *  <ul>
 *  <li> console result : [25, 32, 34, 39, 41, 44]
 *  <li> 결과? TreeSet 사용해서 정렬
 *  <li> 이유? Integer 클래스가 가지고 있는 정렬기준(comparable)을 이용해서 문제가 없었던 것이다.<p>
 *            - TreeSet add() 사용할 때 비교기준이 있어야 한다. <p>
 *            - add(Object o) o 객체 자체에 비교 기준을 갖고 있습니다.
 * @author Yunjin
 * @see Set
 * @see TreeSet
 */
public class TreeSetExam_Add1 {
    public static void main(String[] args) {
        Set set = new TreeSet();

        for (int i = 0; set.size() < 6 ; i++) {
            int num = (int)(Math.random()*45) + 1;
            set.add(num); // set.add(new Integer(num))
        }

        System.out.println(set);
        
    }
}
