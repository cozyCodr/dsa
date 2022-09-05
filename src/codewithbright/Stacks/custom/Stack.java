package codewithbright.Stacks.custom;

import java.util.Arrays;

public class Stack {
    private int size = 10;
    private int [] stack = new int [size];
    private int counter = 0;

    public void push(int number){
        if(isNotFull()) {
            stack[counter++] = number;
        } else {
            makeBiggerStack();
            stack[counter++] = number;
        }
    }

    private void pop(){
        if(isEmpty())
            throw new IllegalStateException();
        else {
            stack[counter - 1] = 0;
            counter--;
        }
    }

    private int peek (){
        if (isEmpty())
            throw new IllegalStateException("Cannot peek empty stack");
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
        return counter == 0;
    }

    @Override
    public String toString(){
        var content = Arrays.copyOfRange(stack, 0, counter);
        return Arrays.toString(content);
    }
}
