package streamexam;

import java.util.stream.IntStream;

/**
 * Stream 만들기 - 특정 범위의 정수 range(),  rangeClosed()
 * <p><blockquote><pre>
 * 특정 범위의 정수를 요소로 갖는 스트림 생성하기
 * </p></blockquote></pre>
 *
 * @since  1.8
 * @see IntStream
 * @author Yunjin
 */
public class RangeIntStreamExam01 {
    public static void main(String[] args) {

        // 특정 범위의 정수 begin ~ end 미만
        IntStream intStreamRange = IntStream.range(1, 5);
        intStreamRange.forEach(System.out::print);

        // 특정 범위의 정수 begin ~ end 포함
        IntStream intStreamRangeClosed = IntStream.rangeClosed(6, 17);
        intStreamRangeClosed.forEach(System.out::print);
    }
}
