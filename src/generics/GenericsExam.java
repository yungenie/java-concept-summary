package generics;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * Generics Iterator<T> 기본예제
 *  <p>
 *  <blockquote><pre>
 *  - Iterator next() 메서드의 반환타입은 object
 *  - Iterator 제네릭스를 사용하면 next() 메서드 형변환 안해도 된다.
 *  - Iterator 제네릭스 타입변수에 이미 지정했기 때문임.
 *  </pre></blockquote>
 *  </p>
 *
 * @author  Yunjin
 * @since 1.8
 */
public class GenericsExam {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        list.add("토요일");
        list.add("일요일");

        Iterator it = list.iterator();
        while (it.hasNext()){
            // 제네릭스를 사용하지 않으면 형변환 필요
            String s = (String) it.next();
        }


        Iterator<String> its = list.iterator();
        while (its.hasNext()){
            String s = its.next();
            System.out.println(s);
        }

    }
}
