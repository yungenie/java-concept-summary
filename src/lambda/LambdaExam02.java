package lambda;

import java.util.*;

/**
 *  Lambda - Collections.sort() 비교기준 (List 정렬)
 *  <p>
 *  <blockquote><pre>
 *  - List Collections.sort() 정렬시 비교기준 람다식 적용하기
 *  </pre></blockquote>
 *  </p>
 *
 * @author Yunjin
 * @see Arrays
 * @see List
 * @see Collections
 * @see Comparator
 * @since 1.8
 */
public class LambdaExam02 {
    public static void main(String[] args) {

        List<String> list = Arrays.asList("abc", "aaa", "bbb", "ddd");

        // 비교기준 - Comparator 익명 객체 사용
        Collections.sort(list, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.compareTo(o2);
            }
        });

        // 비교기준 - 람다식 사용
        Collections.sort(list, (s1, s2) -> s2.compareTo(s1)); // 내림차순
        // result : {"ddd", "bbb", "abc", "aaa"}

        Collections.sort(list, (s1, s2) -> s1.compareTo(s2)); // 오름차순
        // result : {"aaa", "abc", "bbb", "ddd"}


    }
}
/*
        abc", "aaa", "bbb", "ddd"

        abc  aaa
        abc  bbb
        abc  ddd
        aaa  bbb
        aaa  ddd
        bbb  ddd

        o2.compareTo(o1)
        o1 = aaa  97
        o2 = abc 98
        1
                -> 98-97

        o1 = bbb
        o2 = aaa
        -1
                -> 97-98

        o1 = bbb
        o2 = aaa
        -1
                -> 97-98
        o1 = bbb
        o2 = abc
        -1
                -> 97-98
        o1 = ddd
        o2 = abc
        -3
                -> 97-100
        o1 = ddd
        o2 = bbb
        -2
                -> 98-100

         */