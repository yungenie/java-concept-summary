package optional;

import java.util.Optional;

/**
 * Optional 클래스  - 생성 of(), 초기화 empty(), 값 출력 get()/orElse()/orElseGet()/ofNullalbe(), isPresent()/ifPresent()
 *
 * @since  1.8
 * @see Optional
 * @author Yunjin
 */
public class OptionalExam01 {
    public static void main(String[] args) {

        // Optional 객체 생성하는 법
        Optional<String> optStr = Optional.of("abcde");

        // Optional null 저장
        //Optional<String> optStr2 = Optional.of(null); // NPE 발생
        Optional<String> optStr3 = Optional.ofNullable(null);

        // Optional 객체 초기화
        Optional<String> optEmpt = Optional.empty();

        // Optional 객체의 값 가져오기.
        System.out.println("optEmpt = " + optEmpt);
        System.out.println("optStr.get() = " + optStr.get()); // optStr에 저장된 값을 반환.
        //System.out.println("optStr3.get() = " + optStr3.get()); // error. NoSuchElementException 발생
        System.out.println("optStr3.orElse = " + optStr3.orElse("empty!!")); // optStr에 저장된 값이 null 일 때 "값"를 반환
        System.out.println("optStr3.orElseGet = " + optStr3.orElseGet(String::new)); // optStr에 저장된 값이 null 일 때 람다식 사용가능
        //System.out.println("optStr3.orElseThrow" + optStr3.orElseThrow(NullPointerException::new)); // optStr에 저장된 값이 null 일 때 예외처리 가능

        // Optional 객체 값 판단 유무
        System.out.println("Optional.of(0).isPresent() = " + Optional.of(0).isPresent());
        System.out.println("Optional.of(\"\").isPresent() = " + Optional.of("").isPresent());
        System.out.println("optEmpt.isPresent() = " + optEmpt.isPresent());
        System.out.println("Optional.ofNullable(optStr).isPresent() = " + Optional.ofNullable(optStr).isPresent()); // Optional 객체 값이 있으면  true

        // Optional 객체 값 있을 경우 consumer 호출
        optStr.ifPresent(str -> System.out.println(str.length()));
    }
}
