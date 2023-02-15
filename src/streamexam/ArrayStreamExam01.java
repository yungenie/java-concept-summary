package streamexam;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * Stream 만들기 - 객체 배열 및 기본형 배열로부터 스트림 생성하기
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
 * @see Arrays
 * @see IntStream
 * @see Stream
 * @author Yunjin
 */
public class ArrayStreamExam01 {
    public static void main(String[] args) {

        // 1. Stream 생성 - 객체 배열로부터 Stream 생성
        // Stream.of(T) T는 Stream<T> 타입변수
        Stream<String> streamStrArgs = Stream.of("1", "2"); // 가변인자

        String[] strArrObj = new String[]{"a", "b", "c", "d"};
        Stream<String> streamStrArrObj = Stream.of(strArrObj);
        Stream<String> streamStrArrObj2 = Stream.of(new String[]{"a", "b", "c", "d"});
        Stream<String> streamStrArrObj3 = Arrays.stream(new String[]{"g", "h", "i"}, 0,2);

        Integer[] integerArrObj = new Integer[]{3, 4, 5};
        Stream<Integer> streamIntegerArrObj = Stream.of(integerArrObj);
        Stream<Integer> streamIntegerArrObj2 = Arrays.stream(integerArrObj);

        streamStrArgs.forEach(System.out::print);
        streamStrArrObj.forEach(System.out::print);
        streamStrArrObj2.forEach(System.out::print);
        streamStrArrObj3.forEach(System.out::print);
        streamIntegerArrObj.forEach(System.out::print);
        streamIntegerArrObj2.forEach(System.out::print);

        // 2. Stream 생성 - 기본형 배열로부터 Stream 생성
        // IntStream.of(v) v(인자)는 int 타입
        int[] intArr = {6, 7, 8, 9, 10, 11};
        IntStream intStream = IntStream.of(intArr);
        IntStream intStream1 = Arrays.stream(intArr);

        System.out.print(intStream.count());
        //System.out.println(intStream.max());
        //System.out.println(intStream.average());
    }
}
