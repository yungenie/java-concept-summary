package collectionframework.map.hashmap;

import java.util.*;

/**
 * HashMap iterator 출력, Collection.min()/max() 예제
 *  <p>
 *  <blockquote><pre>
 *  - Collection 자손이 아니기 때문에 Iterator 메서드 없음.
 *  - Map에서 데이터를 불러오려면 KeySet(), entrySet(), values() 호출해야한다.
 *  - Keyset() : return Set type
 *  - entrySet() : return Set type
 *  - values() : Collections type
 *  - Map.Entry : Key-Value 쌍으로 객체로 저장됨
 *  → Map 인터페이스 내부 인터페이스인 Entry 인터페이스
 *  </pre></blockquote>
 *  </p>
 *
 * @author  Yunjin
 * @see Collection
 * @see java.util.Map
 * @see HashMap
 * @since 1.8
 */
public class HashMapExam_MinMax {
    public static void main(String[] args) {
        HashMap map = new HashMap();
        map.put("김자바", 100);
        map.put("이자바", 100);
        map.put("강자바", 80);
        map.put("안자바", 90);

        Set set = map.entrySet();
        Iterator it = set.iterator();

        while(it.hasNext()) {
             Map.Entry e = (Map.Entry)it.next();
            System.out.println("이름 : "+ e.getKey() + ", 점수 : " + e.getValue());
        }

        set = map.keySet();
        System.out.println("참가자 명단 : " + set);

        Collection values = map.values();
        it = values.iterator();

        int total = 0;

        while(it.hasNext()) {
            int i = (int)it.next();
            total += i;
        }

        Integer integer = new Integer(1);

        System.out.println("총점 : " + total);
        System.out.println("평균 : " + (float)total/set.size());
        System.out.println("최고점수 : " + Collections.max(values));
        System.out.println("최저점수 : " + Collections.min(values));
        // Comparable 구현한 객체만 들어 올 수 있다.


    }
}
