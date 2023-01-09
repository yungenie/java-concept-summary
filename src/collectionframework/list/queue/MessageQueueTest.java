package collectionframework.list.queue;

import java.util.Queue;
import java.util.LinkedList;


/*
 * FIFO
 * offer() : �־��� ��ü�� ť�� �ֽ��ϴ�.
 * peek() : ��ü�� �ϳ� �����ɴϴ�. ��ü�� �������� �ʽ��ϴ�.
 * poll() : ��ü�� �ϳ� �����ɴϴ�. ��ü�� �����մϴ�.
 * */
public class MessageQueueTest {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue<Message> messageQueue = new LinkedList<>();
		
		messageQueue.offer(new Message("sendMail","ȫ�浿"));
		messageQueue.offer(new Message("sendSMS","����"));
		messageQueue.offer(new Message("sendKakaotalk","����"));
		
		while(!messageQueue.isEmpty()) {
			Message message = messageQueue.poll();
			
			switch(message.command){
				case "sendMail":
					System.out.println(message.to + "�Կ��� ������ �����ϴ�.");
					break;
				case "sendSMS":
					System.out.println(message.to + "�Կ��� SMS�� �����ϴ�.");
					break;
				case "sendKakaotalk":
					System.out.println(message.to + "�Կ��� īī������ �����ϴ�.");
			}
			
		}
		
	}
}
