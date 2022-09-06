package codewithbright.Queues;

public class ArrayQueue {
    private int[] queue = new int[20];
    int front = 0;
    int last = 0;

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
        return queue[front++];
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


}
