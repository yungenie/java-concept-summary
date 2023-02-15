package streamexam;

import java.util.Random;
import java.util.stream.IntStream;

/**
 * Stream 만들기 - 난수를 요소로 갖는 스트림 (임의의 수)
 * <p><blockquote><pre>
 * 임의의 수를 갖는 무한 스트림 생성
 * 1. 난수의 요소를 갖는 무한 스트림 생성
 *      - {@code new Random().ints()}
 * 2. 지정된 범위의 난수를 요소로 갖는 스트림 생성
 *      - {@code new Random().ints(streamSize, randomNumberOrigin, randomNumberBound)}
 * </p></blockquote></pre>
 *
 * @since  1.8
 * @see Random
 * @see IntStream
 * @author Yunjin
 */
public class RandomStreamExam01 {
    public static void main(String[] args) {
        // 난수의 요소를 갖는 무한 스트림 생성
        IntStream unlimitedIntStream = new Random().ints();
        unlimitedIntStream.forEach(System.out::println);

        // 난수의 요소를 갖는 무한 스트림 생성 (제한)
        IntStream limitedIntStream = new Random().ints().limit(5);
        //limitedIntStream.forEach(System.out::println);

        // 지정된 범위의 난수를 요소로 갖는 스트림 생성 (제한)
        IntStream limitedRangeIntStream = new Random().ints(77, 127).limit(5);
        //limitedRangeIntStream.forEach(System.out::println);

        // 지정된 범위의 난수를 요소로 갖는 스트림 생성 (범위 및 제한 동시에)
        IntStream limitedRangeIntStream2 = new Random().ints(3, 77, 127);
        limitedRangeIntStream2.forEach(System.out::println);
    }
}
