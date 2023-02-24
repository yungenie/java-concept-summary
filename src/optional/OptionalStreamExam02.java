package optional;

import java.util.Optional;
import java.util.OptionalInt;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * Optional 클래스  - Stream 조건 검사, 기본 집계, 커스텀 집계 예제
 *
 * @since  1.8
 * @see Optional
 * @author Yunjin
 */
public class OptionalStreamExam02 {
    public static void main(String[] args) {
        String[] strArr = {
                "Inheritance", "Java", "Lambda", "sum",
                "OptionalDouble", "IntStream", "count", "stream"
        };
        Stream.of(strArr).forEach(System.out::println);

        // Stream 최종연산 (조건 검사)
        boolean hasAllMatch = Stream.of(strArr).allMatch(s -> s.length() >= 0); // allMatch : 모든 요소가 조건을 만족시키면 true
        boolean hasAnyMatch = Stream.of(strArr).anyMatch(s -> s.toLowerCase().contains("K")); // anyMatch : 한 요소라도 조건을 만족시키면 true
        boolean hasNoneMatch = Stream.of(strArr).noneMatch(s -> s.length() == 0); // noneMatch : 모든 요소가 조건을 만족시키지 않으면 true
        System.out.println("hasAllMatch = " + hasAllMatch);
        System.out.println("hasAnyMatch = " + hasAnyMatch);
        System.out.println("hasNoneMatch = " + hasNoneMatch);

        // String 기본집계
        Optional<String> sWord = Stream.of(strArr).filter(s -> s.charAt(0) == 's').findFirst(); // findFirst : 첫번째 요소
        Optional<String> sWord2 = Stream.of(strArr).filter(s -> s.charAt(0) == 'a').findAny(); // findAny : 아무거나 하나 반환
        System.out.println("sWord1 = " + sWord.get());
        System.out.println("sWord2 = " + sWord.get());

        IntStream intStream1 = Stream.of(strArr).mapToInt(String::length);
        IntStream intStream2 = Stream.of(strArr).mapToInt(String::length);
        IntStream intStream3 = Stream.of(strArr).mapToInt(String::length);
        IntStream intStream4 = Stream.of(strArr).mapToInt(String::length);

        // Stream 커스텀 집계
        int count = intStream1.reduce(0, (a,b) -> a + 1);
        int sum   = intStream2.reduce(0, (a,b) -> a + b);

        OptionalInt max = intStream3.reduce(Integer::max);
        OptionalInt min = intStream4.reduce(Integer::min);
        System.out.println("count = " + count);
        System.out.println("sum = " + sum);
        System.out.println("max = " + max.getAsInt());
        System.out.println("min = " + min.getAsInt());

    }
}
