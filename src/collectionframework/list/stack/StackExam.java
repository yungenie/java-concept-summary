package collectionframework.list.stack;

import java.util.Stack;

/**
 * Stack 기본 예제 (push/pop)
 *
 * @author Yunjin
 * @since JDK1.8
 */
public class StackExam {

    public static void main(String[] args) {

        /*
         * Stack 저장(push), 추출(pop)
         * */
        Stack st = new Stack();
        st.push("0");
        st.push(0);
        st.push("1");
        st.push('2');
        System.out.println("Stack = " + st);

        while (!st.empty()) {
            System.out.println("st.pop() = " + st.pop());
        }

        /**
         * empty() vs isEmpty() 차이점
         *
         * empty()함수는 Stack.java 클래스에 존재함.
         * isEmpty() 함수는 Vector.java 클래스에 존재함.
         *
         * 본질적인 차이는 없다. 스택이 비었는 지 판단할 때 두 가지 방법이 존재하는 클래스만 다를 뿐이다.
         * 즉, 함수가 구현하고 있는 클래스만 차이가 날 뿐 기능은 똑같다.
         * */

    }
}
