package collectionframework.list.queue;

import java.util.Queue;
import java.util.LinkedList;


/*
 * FIFO
 * offer() : 주어진 객체를 큐에 넣습니다.
 * peek() : 객체를 하나 가져옵니다. 객체를 제거하지 않습니다.
 * poll() : 객체를 하나 가져옵니다. 객체를 제거합니다.
 * */
public class MessageQueueTest {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue<Message> messageQueue = new LinkedList<>();
		
		messageQueue.offer(new Message("sendMail","홍길동"));
		messageQueue.offer(new Message("sendSMS","윤진"));
		messageQueue.offer(new Message("sendKakaotalk","영근"));
		
		while(!messageQueue.isEmpty()) {
			Message message = messageQueue.poll();
			
			switch(message.command){
				case "sendMail":
					System.out.println(message.to + "님에게 메일을 보냅니다.");
					break;
				case "sendSMS":
					System.out.println(message.to + "님에게 SMS을 보냅니다.");
					break;
				case "sendKakaotalk":
					System.out.println(message.to + "님에게 카카오톡을 보냅니다.");
			}
			
		}
		
	}
}
