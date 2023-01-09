package collectionframework.list.stack;

import java.util.Stack;

/*
 * FILO, LIFO
 * push() : �־��� ��ü�� ���ÿ� �ֽ��ϴ�.
 * peer() : ������ �� �� ��ü�� �����ɴϴ�. ��ü�� ���ÿ��� �������� �ʽ��ϴ�.
 * pop()  : ������ �� �� ��ü�� �����ɴϴ�. ��ü�� ���ÿ��� �����մϴ�.
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
			System.out.println("������ ���� : " + coin.getValue() + "��");
		}
		
		System.out.println(coinbox.empty()); //size() == 0;
		System.out.println(coinbox.isEmpty()); //elementCount == 0;
		
	}

}
