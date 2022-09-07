package codewithbright.Queues;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Stack;

public class Main {
    public static void main(String[] args){
        ArrayQueue queue = new ArrayQueue(10);
        queue.enqueue(10);
        queue.enqueue(15);
        queue.enqueue(20);
        queue.enqueue(52);
        System.out.println(queue);
        reverse(queue);
        System.out.println(queue);
    }

    public static void reverse(ArrayQueue queue){
        Stack<Integer> stack = new Stack<>();
        while (!queue.isEmpty()){
            stack.push(queue.dequeue());
        }
        while (!stack.empty()){
            queue.enqueue(stack.pop());
        }
    }
}
