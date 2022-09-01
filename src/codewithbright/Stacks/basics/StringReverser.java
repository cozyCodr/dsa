package codewithbright.Stacks.basics;

import java.util.Stack;

public class StringReverser {

    public String reverse(String string){

        if (string == null)
            throw new IllegalArgumentException("Only strings allowed");

        Stack<Character> stack = new Stack<>();
        for (char ch : string.toCharArray())
            stack.push(ch);

        // Use string buffer because string concatenation
        // is expensive. Memory is allocated each time for each character concatenated
        StringBuffer buffer = new StringBuffer();
        while (!stack.empty())
            buffer.append(stack.pop());


        return buffer.toString();
    }
}
