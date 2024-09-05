package collectionframework.list.queue;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Stack;

public class ArrayDequeExam {
    public static void main(String[] args) {

        ArrayDeque<Integer> arraydeq = new ArrayDeque<>();
        arraydeq.push(1);
        arraydeq.add(2);
        arraydeq.offer(3);

        System.out.println("arraydeq.pop() = " + arraydeq.pop());
        System.out.println("arraydeq.pop() = " + arraydeq.pop());
        System.out.println("arraydeq.pop() = " + arraydeq.pop());
        System.out.println("arraydeq.peek() = " + arraydeq.peek());
        System.out.println("arraydeq.remove() = " + arraydeq.remove()); // throws exception
        System.out.println("arraydeq.pop() = " + arraydeq.pop()); // throws exception

        System.out.println("arraydeq.poll() = " + arraydeq.poll());
        System.out.println("arraydeq.poll() = " + arraydeq.poll());
        System.out.println("arraydeq.poll() = " + arraydeq.poll());
        System.out.println("arraydeq.poll() = " + arraydeq.poll());


        Queue<Integer> arraydeqQ = new ArrayDeque<>();
        arraydeqQ.add(1);
        arraydeqQ.offer(2);
        System.out.println("arraydeqQ.poll() = " + arraydeqQ.poll());
        System.out.println("arraydeqQ.poll() = " + arraydeqQ.poll());
        System.out.println("arraydeqQ.poll() = " + arraydeqQ.poll());
        System.out.println("arraydeqQ.peek() = " + arraydeqQ.peek());

    }
}
