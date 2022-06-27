import java.util.ArrayList;

/**
 * generics 예제
 *
 * @author  Yunjin
 * @since   JDK1.8
 */
public class Generics {
    public static void main(String[] args) {

        /**
         * 제네릭스 용도: 컴파일러에게 타입정보를 전달하여 타입을 체크하여 형변환 에러를 줄이기 위함
         * 즉, 런타임에러를 컴파일에러에서 체크할 수 있도록 끌고옴
         * */

        // error, ClassCastException
        ArrayList arrayList = new ArrayList();
        arrayList.add(11);
        arrayList.add(22);
        arrayList.add("3");

        Integer i = (Integer) arrayList.get(2); // 컴파일 ok, 런타임 error남.
        // 컴파일러의 한계. get()메소드는 리턴타입이 object여서 object를 Integer로 허용함

        //String i = (String) arrayList.get(2);
        Integer integer = Integer.valueOf(arrayList.get(2).toString()); // 형변환 해줘야함.

        ArrayList<Object> objectArrayList = new ArrayList<Object>();
        objectArrayList.add(11);
        objectArrayList.add(22);
        objectArrayList.add("3");

        //String str = (String) objectArrayList.get(2);

    }
}
