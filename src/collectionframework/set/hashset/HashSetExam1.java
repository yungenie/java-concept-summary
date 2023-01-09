package collectionframework.set.hashset;

import java.util.*;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * ����) String ��ü�� �ߺ� ���� �����ϴ� HashSet
 *
 * ���� )
 *		Set �÷����� �ε����� ��ü�� �˻��ؼ� �������� �޼ҵ尡 �����ϴ�.
 * 		���, ��ü�� ��ü�� ������� �� ���� �ݺ��ؼ� �������� �ݺ���(iterator)�� �����մϴ�.
 * 		�ݺ��ڴ� Iterator �������̽��� ������ ��ü
 *
 * 		[iterator �������̽��� ����� �޼ҵ�]
 * 		_________________________________________________________________________
 * 		 ����Ÿ��	|    �޼ҵ�    |                        ����
 * 		_________________________________________________________________________
 * 		boolean | hashNext() | ������ ��ü�� ������ true�� �����ϰ� ������ false�� �����մϴ�.
 * 		_________________________________________________________________________
 * 		   E    |  next()    | �÷��ǿ��� �ϳ��� ��ü�� �����ɴϴ�.
 * 		_________________________________________________________________________
 * 		  void  |  remove()  | Set �÷��ǿ��� ��ü�� �����մϴ�.
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
		System.out.println("�� ��ü��: " + size);
		System.out.println("set : " + set);
		System.out.println("TypeȮ�� :" + set.getClass().getName());
		
		//Iterator
		Iterator<String> iterator = set.iterator();
		System.out.println("iterator Ȯ��: " + iterator);
		System.out.println("iterator.hasNext() Ȯ�� :" + iterator.hasNext());
		System.out.println("iterator.next() Ȯ�� :" + iterator.next());
		
		//Iterator - ��ü �ϳ��� ��������
		while(iterator.hasNext()) {
			String element = iterator.next();
			System.out.println("\t" + element);
		}
		
		//Iterator - ��ü����
		set.remove("iBATIS");
		System.out.println("�� ��ü��: " + set.size());
		
		//Iterator - ��ü����
		set.clear();		
		if(set.isEmpty()) { System.out.println("��� ����"); }
		
		//Array
		String[] names = {"������","����","���","����","������ �� �� ������?"};
		System.out.println("array test : " + names);
		System.out.println("array test : " + names.length);
		
	}
}

