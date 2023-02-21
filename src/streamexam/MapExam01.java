package streamexam;

import java.io.File;
import java.util.stream.Stream;

/** Stream 중간연산 - 파일 스트림에서 파일 확장자 중복 없이 뽑아내기 (map(), peek())
 * <p><blockquote><pre>
 *     {@code <R> Stream<R> map(Function<? super T,? extends R> mapper)}
 *     - map() 연산은 지정된 함수를 스트림의 요소에 적용한 결과로 구성된 스트림을 반환합니다.
 *
 *     {@code Stream<T> peek(Consumer<? super T> action)}
 *     - 주로 디버깅을 지원하기 위해 사용하고 특정 지점을 통과할 때 요소를 볼 수 있습니다.

 *용</p></blockquote></pre>
 * @since 1.8
 * @see Stream
 * @see File
 */
public class MapExam01 {
    public static void main(String[] args) {

        File[] fileArr = { new File("Ex1.java"), new File("Ex1.bak"),
                new File("Ex2.java"), new File("Ex1"), new File("Ex1.txt")
        };

        Stream<File> fileStream = Stream.of(fileArr);
        fileStream.map(File::getName) // Stream<File> → Stream<String>
                .peek(System.out::println) // 중간 확인. 스트림을 소비 X
                .filter(s -> s.indexOf(".") != -1) // 확장자가 없는 것은 제외
                .map(s -> s.substring(s.indexOf(".") + 1)) // 확장자만 추출
                .map(String::toLowerCase) // 모두 소문자로 변환
                .distinct() // 중복제거
                .forEach(System.out::println);
    }
}
