package streamexam;

import java.util.Arrays;
import java.util.stream.Stream;

/** Stream 중간연산 - flatMap()
 * <p><blockquote><pre>
 *     {@code <R> Stream<R> map(Function<? super T,? extends R> mapper)}
 *     - map() 연산은 지정된 메서드를 스트림의 요소에 적용한 결과로 구성된 스트림을 반환합니다.
 *
 *     {@code <R> Stream<R> flatMap(Function<? super T,? extends Stream<? extends R>> mapper)}
 *     - flatMap() 연산은 스트림의 요소에 일대일 변환을 적용한 다음 결과 요소를 새로운 스트림과 평탄화 합니다.
 *
 * </p></blockquote></pre>
 * @since 1.8
 * @see Stream
 * @see Arrays
 * @see String
 */
public class FlatMapExam01 {
    public static void main(String[] args) {

        // 예제1. 스트림 배열 객체의 모든 요소 중 공통 문자열 뽑아내기.
        Stream<String[]> strArrStrm = Stream.of(
                new String[]{"abc", "def", "jkl"},
                new String[]{"ABC", "GHI", "JKL"}
        );
        //Stream<Stream<String>> strStrmStrm = strArrStrm.map(Arrays::stream);
        //strStrmStrm.forEach(System.out::println);
        /* result :
         * java.util.stream.ReferencePipeline$Head@682a0b20
         * java.util.stream.ReferencePipeline$Head@3d075dc0
         * 스트링 배열 객체 각 1개씩 스트림으로 이루어져있음.
         * Stream<Stream<String>>
         *      {"abc", "def", "jkl"}, → stream
         *      {"ABC", "GHI", "JKL"}  → stream
         */

        Stream<String> strStream = strArrStrm.flatMap(Arrays::stream);
        //strStream.forEach(System.out::println);
        /* result :
         * abc
         * def
         * jkl
         * ABC
         * GHI
         * JKL
         */

        strStream.map(String::toLowerCase) // 스트림의 모든 요소를 소문자로 변경
                    .distinct() // 중복 제거
                    .sorted() // 정렬
                    .forEach(System.out::println);
        System.out.println();

        // 예제2. 스트링 배열에 포함된 공통 단어 뽑기.
        String[] lineArr = {
                "Believe or not It is true",
                "Do or do not There is no try",
        };

        Stream<String> lineStrm = Arrays.stream(lineArr);
        lineStrm.flatMap(line -> Stream.of(line.split(" +")))
                .map(String::toLowerCase)
                .distinct()
                .sorted()
                .forEach(System.out::println);


    }
}
