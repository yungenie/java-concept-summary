package string;

import java.util.Arrays;
import java.util.Collections;

/**
 * 문자열 정렬
 */
public class StrSortExam {
    public static void main(String[] args) {
        // 문자열 정렬 기본 (대문자 -> 소문자 )
        String ss = "alsFWEYBNkdSDFjf";
        ss = ss.chars()        // IntStream
                .sorted()
                .collect(StringBuilder::new,
                        StringBuilder::appendCodePoint,
                        StringBuilder::append)
                .toString();
        Arrays.sort(ss.toCharArray());
        System.out.println("ss = " + ss);


        String str = "AbaFdecG";
        char[] charArr = str.toCharArray(); // String to Char Array
        Arrays.sort(charArr); // Char Array 대->소문자 알파벳 순 정렬
        String result = new String(charArr); // 또는 String.valueOf(charArr);
        System.out.println("result = " + result); //AFGabcde


    }
}
