package study.designpattern.singleton;

/*
 * 클래스의 인스턴스, 즉 객체를 하나만 만들어서 사용하는 패턴
 * 
 * ※
 * 정적변수는 프로그램이 시작될 때부터 종료될 때까지 없어지지 않고, 메모리에 상주하며
 * 클래스에서 생성된 모든 객체에서 참조할 수 있다.
 * */



public class Singleton {
	
	static Singleton singletonObject; // 정적 참조 변수
	
	private Singleton() {}; // private 생성자
	
	public static Singleton getInstance() {
		
		if(singletonObject == null) {
			singletonObject = new Singleton();
		}
		return singletonObject;
	}

}
