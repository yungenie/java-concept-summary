package collectionframework.set.hashset;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetExam_Set {
    public static void main(String[] args) {
        HashSet setA   = new HashSet();
        HashSet setB   = new HashSet();
        HashSet setHab = new HashSet();
        HashSet setKyo = new HashSet();
        HashSet setCha = new HashSet();

        setA.add("1");
        setA.add("2");
        setA.add("3");
        setA.add("4");
        setA.add("5");
        System.out.println("A = " + setA);

        setB.add("4");
        setB.add("5");
        setB.add("6");
        setB.add("7");
        setB.add("8");
        System.out.println("B = " + setB);

        /** 집합 메서드 미사용 */

        // HashSet 합집합
        Iterator it = setA.iterator();
        while(it.hasNext())
            setHab.add(it.next());

        it = setB.iterator();
        while(it.hasNext())
            setHab.add(it.next());

        // HashSet 교집합
        it = setB.iterator();
        while(it.hasNext()) {
            Object tmp = it.next();
            if(setA.contains(tmp))
                setKyo.add(tmp);
        }

        // HashSet 차집합
        it = setA.iterator();
        while(it.hasNext()) {
            Object tmp = it.next();
            if(!setB.contains(tmp))
                setCha.add(tmp);
        }

        // 확인
        System.out.println("A U B = " + setHab);  // 한글 ㄷ을 누르고 한자키
        System.out.println("A ∩ B = " + setKyo);  // 한글 ㄷ을 누르고 한자키
        System.out.println("A - B = " + setCha);


        /** 집합 메서드 사용 */
        //addAll() 합집합 메서드 이용
        //setA.addAll(setB);
        //System.out.println("A U B = " + setA);

        //retainAll() 교집합 메서드 이용
        //setA.retainAll(setB);
        //System.out.println("A ∩ B = " + setA);

        //removeAll() 차집합 메서드 이용
        //setA.removeAll(setB);
        //System.out.println("A - B = " + setA);






    }
}
