package optional;

import java.util.Optional;

/**
 * Optional 클래스  - Optional 객체와 Stream 필터링, 매핑 혼합 예제
 *
 * @since  1.8
 * @see Optional
 * @author Yunjin
 */
public class OptionalStreamExam01 {
    public static void main(String[] args) {
        Optional<String> optStr = Optional.of("yunjin");
        Optional<Integer> optInt = optStr.map(String::length);

        System.out.println("optStr = " + optStr.get());
        System.out.println("optInt = " + optInt.get());

        int result1 = Optional.of("123456789")
                .filter(x -> x.length() > 0)
                .map(Integer::parseInt).get();

        int result2 = Optional.of("")
                .filter(x -> x.length() > 0)
                .map(Integer::parseInt).orElse(-1);

        System.out.println("result1 = " + result1);
        System.out.println("result2 = " + result2);

        Optional.of("17").map(Integer::parseInt)
                .ifPresent(x->System.out.printf("result3 = %d%n",x));
    }
}
