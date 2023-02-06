package streamexam;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

/**
 * Stream 생성과 닫힘 예제
 * <p><blockquote><pre>
 * - Collection 데이터를 스트림으로 변환하는 예제입니다.
 * - 스트림은 1회용입니다.
 * - Stream 최종연산을 수행하면 Stream 닫힌다.
 * - 그러므로, 스트림을 재생성 후 사용합니다.
 * </p></blockquote></pre>
 *
 * @since  1.8
 * @see Stream
 * @see List
 * @see Arrays
 * @author Yunjin
 */
public class StreamExam01 {
    public static void main(String[] args) {
        // 1.Stream 만들기
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
        Stream<Integer> intStream = list.stream(); // list → Stream 변환
        intStream.forEach(System.out::println); // 최종연산 수행 후 Stream 닫힘

        // 2. Stream 재생성
        intStream = list.stream();  // // list → Stream 재변환
        intStream.forEach(System.out::print);
    }
}
