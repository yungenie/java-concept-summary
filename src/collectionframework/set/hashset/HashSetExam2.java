package collectionframework.set.hashset;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * An HashSet over a collection.
 * HashSet은 Set 인터페이스의 구현 클래스
 * Set은 한국말로는 "집합"
 * 저장 순서를 유지하지 않음
 * 중복 값을 허용하지 않음
 * 
 * <p> 순서를 유지하고 싶으면 LinkedHashSet 클래스 사용
 * 
 * @author YunJin
 * @see Collection
 * @see HashSet
 * @see Set
 * @see Iterable
 * @Date 20211007
 */
public class HashSetExam2 {

	public static void main(String[] args) {
		
		// 1. 객체 선언 new HashSet<>();
		Set<String> set = new HashSet<String>();
		
		// 2. 데이터 삽입 set.add()
		set.add("aspea");
		set.add("카리나");
		set.add("지젤");
		set.add("윈터");
		set.add("닝닝");
		
		System.out.println(set.toString()); //[윈터, aspea, 닝닝, 지젤, 카리나]
		System.out.println(set.toString().getClass().getName()); //java.lang.String
		
		// 3. 데이터 출력 
		Iterator<String> iterSet = set.iterator();
		
		while(iterSet.hasNext()) {
			System.out.println(iterSet.next() + "");
		}
		
	}

}
