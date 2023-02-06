package streamexam;

import java.util.stream.Stream;

/**
 * Stream Lambda interate(), generate() 기본예제
 *
 * @since  1.8
 * @see Stream
 * @author Yunjin
 */
public class StreamLambdaExam01 {
    public static void main(String[] args) {

        // 1. 스트림 람다 - interate(T seed, UnaryOperator f) seed : 초기값, f : 단항 연산자
        Stream<Integer> integerStream = Stream.iterate(2, n -> n * 2);
        integerStream.limit(5).forEach(System.out::println);

        // 2. 스트림 람다 - generate(Supplier s) : 주기만 하는 것 입력x, 출력 o
        Stream<Integer> generateStream = Stream.generate(() -> 2);
        generateStream.limit(7).forEach(System.out::println);

    }
}
