package collectionframework.set.hashset;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * Object배열에 담긴 요소 HashSet 저장 후 Iterator 이용해 출력하는 예제
 *
 * @author yunjin
 * @see Collection
 * @see HashSet
 * @see Set
 * @see Iterator
 * @see Object
 */
public class HashSetExam_ObjectArr {
    public static void main(String[] args) {
        Object[] objArr = {"1", new Integer(1), "2","2","3","3","4","4","4"};
        Set set = new HashSet();

        // HashSet 저장 add()
        for(int i=0; i < objArr.length; i++) {
            // HashSet에 objArr의 요소들을 저장한다.
            set.add(objArr[i]);
        }

        // 단순 출력
        System.out.println(set);

        // Iterator 출력
        Iterator it = set.iterator();

        //읽어 올 요소가 남아 있는 지 확인 후 다음 요소 읽어 출력합니다.
        while(it.hasNext()) {
            // it.next() : 다음 요소를 읽는 함수
            System.out.println(it.next());
        }
    }
}

/*
* result :
[1, 1, 2, 3, 4]
1
1
2
3
4
// 저장순서를 유지하지 않기 때문에 정확히 문자열 1, Integer 객체 1의 순서를 알 수 없다.
*
* */