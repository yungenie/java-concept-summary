package collectionframework.set.hashset;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * HashSet add() 기본 예제
 *
 *  <p><blockquote><pre>
 *  - HashSet : Set인터페이스의 구현 클래스
 *  - 저장 순서를 유지하지 않고, 중복 값을 허용하지 않음
 *  - Set은 한국번역어로 "집합"의 의미
 *  - 순서를 유지하고 싶으면 LinkedHashSet 클래스 사용
 *  </pre></blockquote></p>
 *
 * @author yunjin
 * @see Collection
 * @see HashSet
 * @see Set
 * @see Iterable
 */
public class HashSetExam2 {

	public static void main(String[] args) {
		
		// 1. 객체 선언 new HashSet<>();
		Set<String> set = new HashSet<>();

		// 2. 데이터 삽입 add()
		set.add("aspea");
		set.add("카리나");
		set.add("카리나");
		set.add("카리나");
		set.add("지젤");
		set.add("윈터");
		set.add("윈터");
		set.add("닝닝");
		set.add("닝닝");

		// 3. 데이터 출력
		// 확인
		System.out.println(set);

		// Collection 인터페이스의 iterator() 사용
		Iterator<String> iterSet = set.iterator();

		while(iterSet.hasNext()) {
			System.out.println(iterSet.next() + "");
		}
		
	}

}
