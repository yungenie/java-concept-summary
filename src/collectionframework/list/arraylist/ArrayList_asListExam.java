package collectionframework.list.arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayList_asListExam {
    public static void main(String[] args) {

        // List 읽기 전용
        List asList = Arrays.asList(new Integer[]{1,2,3,4,5});
        //asList.add(6);
        /* add() 에러남. asList는 읽기 전용임. return 타입이 List임
        Exception in thread "main" java.lang.UnsupportedOperationException
        at java.util.AbstractList.add(AbstractList.java:148)
        at java.util.AbstractList.add(AbstractList.java:108)
        at collectionframework.list.arraylist.ArrayList_asListExam.main(ArrayList_asListExam.java:12)
        */
        System.out.println("asList = " + asList);

        // ArrayList 변경 가능
        List arrList = new ArrayList(Arrays.asList(1,2,3,4,5));
        arrList.add("1");
        System.out.println("arrList = " + arrList);




    }
}
