package collectionframework.list.queue;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.LinkedList;

public class MessageQueueTest {
	public static void main(String[] args) {
		Queue<Message> messageQueue = new LinkedList<>();

		/**
		 *  Throws Exception  | Return Special Value
		 *  add(ele) | offer(ele)
		 *  remove() | poll()
		 *  element() | peek()
		 */


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
