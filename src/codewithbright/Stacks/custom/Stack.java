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
            makeBiggerStack();
            stack[counter] = number;
            counter++;
        }
    }

    private void pop(){
        if(isEmpty())
            return;
        else {
            stack[counter - 1] = 0;
            counter--;
        }
    }

    private int peek (){
        if (isEmpty())
            throw new IllegalArgumentException("Cannot peek empty stack");
        else
            return stack[counter];
    }

    private boolean isNotFull() {
        return counter != size - 1;
    }

    private void makeBiggerStack(){
        //double size
        size *= 2;
        int[] biggerStack = new int[size];

        //copy initial array
        for (int x = 0; x < stack.length; x++){
            biggerStack[x] = stack[x];
        }
        stack = biggerStack;
    }

    private boolean isEmpty(){
        if (counter == 0)
            return true;
        else
            return false;
    }
}
