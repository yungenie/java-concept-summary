package streamexam;

import java.util.stream.Stream;

/**
 * Stream 만들기 - 람다식 iterate(), generate()
 * <p><blockquote><pre>
 * - interate(T seed, UnaryOperator f)
 *      → seed : 초기값, f : 단항 연산자
 * - generate(Supplier s)
 *      → seed 없고 출력만 존재
 * </p></blockquote></pre>
 *
 * @since  1.8
 * @see Stream
 * @author Yunjin
 */
public class StreamLambdaExam01 {
    public static void main(String[] args) {

        // 이전 요소에 종속적
        Stream<Integer> integerStream = Stream.iterate(2, n -> n * 2);
        integerStream.limit(7).forEach(System.out::println);

        // 이전 요소에 독립적
        Stream<Integer> generateStream = Stream.generate(() -> 7);
        generateStream.limit(7).forEach(System.out::println);
    }
}
