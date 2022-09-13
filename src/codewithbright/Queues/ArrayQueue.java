package codewithbright.Queues;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayQueue {
    private int[] queue;
    int front = 0;
    int last = 0;
    int count = 0;

    public ArrayQueue(int capacity) {
        this.queue = new int[capacity];
    }

    // Add
    public void enqueue(int item){
        if(isFull())
            throw new StackOverflowError();
        queue[last] = item;
        last = (last + 1) % queue.length;
        count++;
    }

    // Remove
    public int dequeue(){
        if (isEmpty())
            throw new IllegalStateException();
        var frontItem = queue[front];
        queue[front] = 0;
        front = (front + 1) % queue.length;
        count--;
        return frontItem;
    }

    public int peek(){
        if (isEmpty())
            throw new IllegalStateException();
        return queue[front];
    }

    public boolean isEmpty(){
        return count == 0;
    }

    public boolean isFull(){
        return count == queue.length;
    }

    @Override
    public String toString(){
        ArrayList<Integer> temp = new ArrayList<>();
        for(int x = front; x < last; x++){
            temp.add(queue[x]);
        }
        return Arrays.toString(temp.toArray());
    }


}
