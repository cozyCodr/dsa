package codewithbright.Queues;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayQueue {
    private int[] queue;
    int front = 0;
    int last = 0;

    public ArrayQueue(int capacity) {
        this.queue = new int[capacity];
    }
    // Add
    public void enqueue(int item){
        if(isFull())
            throw new StackOverflowError();
        queue[last++] = item;
    }

    // Remove
    public int dequeue(){
        if (isEmpty())
            throw new IllegalStateException();
        var frontItem = queue[front];
        queue[front++] = 0;
        return frontItem;
    }

    public int peek(){
        if (isEmpty())
            throw new IllegalStateException();
        return queue[front];
    }

    public boolean isEmpty(){
        return front >= last;
    }

    public boolean isFull(){
        return last >= queue.length;
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
