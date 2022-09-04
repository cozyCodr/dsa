package codewithbright.Stacks.custom;

public class Stack {
    private int size = 10;
    private int [] stack = new int [size];
    private int counter = 0;

    public void push(int number){
        if(isNotFull()) {
            stack[counter] = number;
            counter++;
        } else {
            //double size
            size *= 2;
            int[] biggerStack = new int[size];

            //copy initial array
            for (int x = 0; x < stack.length; x++){
                biggerStack[x] = stack[x];
            }
            stack = biggerStack;
        }
    }
    private boolean isNotFull() {
        return counter != size - 1;
    }
}
