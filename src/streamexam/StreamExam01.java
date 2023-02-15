package streamexam;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

/**
 * Stream 만들기 - Stream 생성과 닫힘 예제 (데이터 소스)
 * <p><blockquote><pre>
 * - Collection 데이터를 스트림으로 변환하는 예제입니다.
 * - 스트림은 1회용입니다.
 * - Stream 최종연산을 수행하면 Stream 닫힌다.
 * - 그러므로, 스트림을 재생성 후 사용합니다.
 * </p></blockquote></pre>
 *
 * @since  1.8
 * @see Arrays
 * @see List
 * @see Stream
 * @author Yunjin
 */
public class StreamExam01 {
    public static void main(String[] args) {
        // 1. Stream 만들기
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
        Stream<Integer> intStream = list.stream(); // List(데이터 소스) -> 새로운 Stream 생성

        // 2. Stream 모든 요소 출력
        intStream.forEach(System.out::println); // 최종연산 수행 후 Stream 닫힘

        // 3. Stream 재생성
        intStream = list.stream();  // List(데이터 소스) -> Stream 재생성

        // 4. Stream 모든 요소 출력
        intStream.forEach(System.out::print);
    }
}
