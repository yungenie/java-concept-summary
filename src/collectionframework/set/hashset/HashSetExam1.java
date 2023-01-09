package collectionframework.set.hashset;

import java.util.*;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * 예제) String 객체를 중복 없이 저장하는 HashSet
 *
 * 설명 )
 *		Set 컬렉션은 인덱스로 객체를 검색해서 가져오는 메소드가 없습니다.
 * 		대신, 객체를 전체를 대상으로 한 번씩 반복해서 가져오는 반복자(iterator)를 제공합니다.
 * 		반복자는 Iterator 인터페이스를 구현한 객체
 *
 * 		[iterator 인터페이스에 선언된 메소드]
 * 		_________________________________________________________________________
 * 		 리턴타입	|    메소드    |                        설명
 * 		_________________________________________________________________________
 * 		boolean | hashNext() | 가져올 객체가 있으면 true를 리턴하고 없으면 false를 리턴합니다.
 * 		_________________________________________________________________________
 * 		   E    |  next()    | 컬렉션에서 하나의 객체를 가져옵니다.
 * 		_________________________________________________________________________
 * 		  void  |  remove()  | Set 컬렉션에서 객체를 제거합니다.
 * 		_________________________________________________________________________
 *
 *
 * @author yunjin
 * @see Collection
 * @see HashSet
 * @see Set
 * @see Iterator
 * @Date 20210710
 */




public class HashSetExam1 {
	
	public static void main(String[] args) {
		//Set
		Set<String> set = new HashSet<String>();
		
		set.add("Java");
		set.add("JDBC");
		set.add("Servlet/JSP");
		set.add("iBATIS");
		
		//for each
		for(String ee : set) {
			System.out.println("\t" + ee);
		}
		
		int size = set.size();
		System.out.println("총 객체수: " + size);
		System.out.println("set : " + set);
		System.out.println("Type확인 :" + set.getClass().getName());
		
		//Iterator
		Iterator<String> iterator = set.iterator();
		System.out.println("iterator 확인: " + iterator);
		System.out.println("iterator.hasNext() 확인 :" + iterator.hasNext());
		System.out.println("iterator.next() 확인 :" + iterator.next());
		
		//Iterator - 객체 하나씩 가져오기
		while(iterator.hasNext()) {
			String element = iterator.next();
			System.out.println("\t" + element);
		}
		
		//Iterator - 객체삭제
		set.remove("iBATIS");
		System.out.println("총 객체수: " + set.size());
		
		//Iterator - 전체제거
		set.clear();		
		if(set.isEmpty()) { System.out.println("비어 있음"); }
		
		//Array
		String[] names = {"곽윤진","균진","찌니","지니","취직잘 할 수 있을까?"};
		System.out.println("array test : " + names);
		System.out.println("array test : " + names.length);
		
	}
}

