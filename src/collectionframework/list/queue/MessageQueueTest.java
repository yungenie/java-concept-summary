package collectionframework.list.queue;

import java.util.Queue;
import java.util.LinkedList;

public class MessageQueueTest {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue<Message> messageQueue = new LinkedList<>();
		
		messageQueue.offer(new Message("sendMail","È«±æµ¿"));
		messageQueue.offer(new Message("sendSMS","À±Áø"));
		messageQueue.offer(new Message("sendKakaotalk","¿µ±Ù"));
		
		while(!messageQueue.isEmpty()) {
			Message message = messageQueue.poll();
			
			switch(message.command){
				case "sendMail":
					System.out.println(message.to + "´Ô¿¡°Ô ¸ÞÀÏÀ» º¸³À´Ï´Ù.");
					break;
				case "sendSMS":
					System.out.println(message.to + "´Ô¿¡°Ô SMSÀ» º¸³À´Ï´Ù.");
					break;
				case "sendKakaotalk":
					System.out.println(message.to + "´Ô¿¡°Ô Ä«Ä«¿ÀÅåÀ» º¸³À´Ï´Ù.");
			}
			
		}
		
	}
}
