package lambda;

import java.util.*;

/**
 *  Lambda - forEach()문 출력
 *  <p>
 *  <blockquote><pre>
 *  - fori문 출력
 *  - foreach문 출력
 *  - foreach문 출력 (컴파일)
 *  - forEach문 출력
 *  </pre></blockquote>
 *  </p>
 *
 * @author Yunjin
 * @see ArrayList
 * @see Iterator
 * @see HashMap
 * @since 1.8
 */
public class ForEachExam01 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();

        int i;
        for (i = 0; i < 10; i++) {
            list.add(i); // add(i) → add(Integer.valueOf(i)) 오토박싱
        }

        // fori문
        for (i = 0; i < list.size(); i++) {
            System.out.println("i = " + i);
        }

        // foreach문
        for (Integer item: list) {
            System.out.println(item);
        }

        // foreach문 (컴파일)
        Iterator<Integer> var4 = list.iterator();
        while(var4.hasNext()) {
            System.out.println(var4.next());
        }

        // forEach문 (Consumer)
        list.forEach(ix -> System.out.println("ix = " + ix));

        // forEach문 컴파일
        list.forEach((ixx) -> {
            System.out.println("i = " + ixx);
        });

        // forEach문 메서드 레퍼런스
        list.forEach(System.out::println);

        Map<String, String> map = new HashMap<>();
        map.put("name", "yunjin");
        map.put("age", "1995");
        map.put("hobby", "listen to music");
        map.put("live", "seoul");

        Iterator<Map.Entry<String, String>> iterator = map.entrySet().iterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        map.forEach((k,v) -> System.out.println("{" + k + "," + v + "}\n"));
    }
}
