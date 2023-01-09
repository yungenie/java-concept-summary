package collectionframework.list.stack;

import java.util.EmptyStackException;
import java.util.Stack;

public class StackExam_ItemMatch {
    public static void main(String[] args) {
        Stack st = new Stack();
        String expression = "((3+5)*8-2)"; //args[0];
        System.out.println("expression:" + expression);
        System.out.println("expression:" + expression.length());

        try {
            for (int i = 0; i < expression.length(); i++) {
                char ch = expression.charAt(i);

                if (ch == '(') {
                    st.push(ch + "");
                } else if (ch == ')') {
                    st.pop();
                }
                System.out.println("st = " + st);
            }

            if (st.isEmpty()) {
                System.out.println("괄호가 일치합니다.");
            } else {
                System.out.println("괄호가 일치하지 않습니다.");
            }
        } catch (EmptyStackException e) {
            System.out.println("괄호가 일치하지 않습니다.");
        } // try

        /**
         * String.length() : 문자열의 char 요소의 길이 반환
         * */

    }
}
