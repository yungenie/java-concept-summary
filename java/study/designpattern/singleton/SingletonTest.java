package study.designpattern.singleton;

public class SingletonTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Singleton 클래스에서 private 생성자므로 new를 통해 인스턴스를 생성할 수 없다.
		//Singleton s1 = new Singleton();
		
		Singleton s1 = Singleton.getInstance();
		System.out.println(s1);
		
		//초기화
		s1 = null;
		System.out.println(s1);
	}

}
