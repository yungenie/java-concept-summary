package collectionframework.set.treeset;

import java.util.Set;
import java.util.TreeSet;

/**
 * TreeSet from 이상, to 미만 범위검색 기본 예제
 *
 *  <p><blockquote><pre>
 *  - subSet(Object fromElement, Object toElement) : 범위에 해당하는 요소를 뽑을 때
 *  - headSet(Object toElement) : 해당 범위보다 작은 요소를 뽑을 때 (to 미만)
 *  - tailSet(Object fromElement) : 해당 범위보다 큰 요소를 뽑을 때 (from 이상)
 *  - ★★★★★ 범위검색에 해당하는 위 메서드는 TreeSet에만 존재함.
 *    그러므로 {@code Set set = new TreeSet()} 으로 객체선언 하면 오류남
 *  </pre></blockquote></p>
 *
 * <ul>
 *     <li> console result : <p>
 *          [Car, DZZZZ, Dzzzz, abc, alien, bat, car, dZZZZ, dance, disc, dzzzz, elephant, elevator, fan, flower] <p>
 *          range search : from b to d <p>
 *          result1 : [bat, car] <p>
 *          result2 : [bat, car, dZZZZ, dance, disc] <p>
 *          result4 : [Car] <p>
 *          result5 : [Car, DZZZZ] <p>
 *          50보다 작은 값 :[10, 35, 45] <p>
 *          50보다 큰 값 :[50, 65, 80, 95, 100] <p>
 *          40과 80사이의 값 :[45, 50, 65] <p>
 *     </li>
 *     <li> result1 - Car,car 중에 왜 소문자 car가 출력? 애초에 소문자 중 b ~ d 사이 검색하기 때문</li>
 *     <li> result2 - dZZZZ,dzzzz 중에 왜 dZZZZ가 출력? dzzz 미만으로 d는 소문자에 속하고 Z는 z보다 앞에 정렬되기 때문</li>
 * </ul>
 *
 * @author Yunjin
 * @see TreeSet
 */
public class TreeSetExam_ScopeSearch {
    public static void main(String[] args) {

        // 1. subSet() 범위검색 예제
        //Set set = new TreeSet();
        TreeSet set = new TreeSet();

        String from = "b";
        String to   = "d";

        set.add("abc");
        set.add("alien");
        set.add("bat");
        set.add("car");
        set.add("Car");
        set.add("disc");
        set.add("dance");
        set.add("dZZZZ");
        set.add("dzzzz");
        set.add("DZZZZ");
        set.add("Dzzzz");
        set.add("elephant");
        set.add("elevator");
        set.add("fan");
        set.add("flower");

        System.out.println(set);
        System.out.println("range search : from " + from  +" to "+ to);
        System.out.println("result1 : " + set.subSet(from, to));
        System.out.println("result2 : " + set.subSet(from, to + "zzz"));
        System.out.println("result4 : " + set.subSet("B", "D"));
        System.out.println("result5 : " + set.subSet("B", "Dzzz"));

        set.clear();

        // 2. headSet(), tailSet() 비교검색 예제
        int[] score = {80, 95, 50, 35, 45, 65, 10, 100};

        for (int i = 0; i < score.length; i++) {
            set.add(new Integer(score[i]));
        }

        System.out.println("50보다 작은 값 :" + set.headSet(new Integer(50)));
        System.out.println("50보다 큰 값 :"  + set.tailSet(new Integer(50)));
        System.out.println("40과 80사이의 값 :"  + set.subSet(40,80));
    }
}
/*



 */