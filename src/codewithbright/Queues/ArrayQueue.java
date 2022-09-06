package codewithbright.Queues;

public class ArrayQueue {
    private int[] queue = new int[20];
    int front = 0;
    int last = 0;

    public boolean isEmpty(){
        return front > last;
    }


}
