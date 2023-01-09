package collectionframework.list.stack;

import java.util.Stack;

/*
 * FILO, LIFO
 * push() : 주어진 객체를 스택에 넣습니다.
 * peer() : 스택의 맨 위 객체를 가져옵니다. 객체를 스택에서 제거하지 않습니다.
 * pop()  : 스택의 맨 위 객체를 가져옵니다. 객체를 스택에서 제거합니다.
 * */
public class CoinStackTest {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Stack<Coin> coinbox = new Stack<>();

		coinbox.push(new Coin(100));
		coinbox.push(new Coin(20));
		coinbox.push(new Coin(500));
		coinbox.push(new Coin(7));
		
		System.out.println(coinbox);
		
		while(!coinbox.isEmpty()) {
			Coin coin = coinbox.pop();
			System.out.println("꺼내온 동전 : " + coin.getValue() + "원");
		}
		
		System.out.println(coinbox.empty()); //size() == 0;
		System.out.println(coinbox.isEmpty()); //elementCount == 0;
		
	}

}
