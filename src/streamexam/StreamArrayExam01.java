package streamexam;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * Stream 객체 배열 및 기본형 배열 예제.
 * <p><blockquote><pre>
 * 배열 데이터를 스트림으로 받을 때 사용법
 * 1. 객체 배열의 경우
 *      - {@code Stream.of()}, {@code Arrays.stream()} 사용
 *      - return {@code Stream<T>} // T는 타입변수로 참조형
 * 2. 기본형 배열의 경우
 *      - {@code 기본형Stream.of()}, {@code Arrays.stream()} 사용
 *      - return {@code 기본형Stream}
 * </p></blockquote></pre>
 *
 * @since  1.8
 * @see Stream
 * @see IntStream
 * @see Arrays
 * @author Yunjin
 */
public class StreamArrayExam01 {
    public static void main(String[] args) {

        // 1. 스트림 생성 - 객체배열
        Stream<String> streamStrArgs = Stream.of("1", "2", "3");
        Stream<String> streamStrObj = Stream.of(new String[]{"a", "b", "c"});
        Stream<String> arraysStrStream = Arrays.stream(new String[]{"d","e","f"});
        Stream<String> arraysStrStreamRange = Arrays.stream(new String[]{"g","h","i"}, 0,2);

        streamStrArgs.forEach(System.out::println);
        streamStrObj.forEach(System.out::println);
        arraysStrStream.forEach(System.out::println);
        arraysStrStreamRange.forEach(System.out::println);

        // 2. 스트림 생성 - 기본형 배열
        int[] intArr = {1,2,3,4,5};
        IntStream intStream = IntStream.of(intArr);
        IntStream arraysIntStream = Arrays.stream(intArr);
        //System.out.println(intStream.max());
        //System.out.println(intStream.average());
        intStream.limit(3).forEach(System.out::println);

        Integer[] integerArr = new Integer[]{5,6,7,8};
        Stream<Integer> arraysIntegerStream = Arrays.stream(integerArr);
        System.out.println(arraysIntegerStream.count()); // Stream<T>는 count() 메서드만 존재. 나머지 숫자메서드는 숫자 스트림에 존재.
    }
}
