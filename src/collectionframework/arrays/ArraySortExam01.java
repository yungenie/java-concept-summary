package collectionframework.arrays;

import java.util.Arrays;
import java.util.Collections;

/**
 * String[] 배열 정렬
 */
//https://linuxism.ustd.ip.or.kr/964
public class ArraySortExam01 {
    public static void main(String[] args) {

        // 배열 정렬 (알파벳 순서) 대소문자 무시
        // Arrays.sort()는 Quicksort 알고리즘을 사용하며 O(n*log(n))의 시간 복잡도
        String[] arrToSort = {"apple", "oranges", "bananas", "Strawberry", "Blueberry"};
        Arrays.sort(arrToSort, String.CASE_INSENSITIVE_ORDER);
        System.out.println("arrToSort = " + Arrays.toString(arrToSort));

        // 배열 정렬 (소문자 -> 대문자)
        Arrays.sort(arrToSort, Collections.reverseOrder());
        System.out.println("arrToSort = " + Arrays.toString(arrToSort));
    }
}
