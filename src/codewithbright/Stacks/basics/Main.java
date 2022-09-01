package codewithbright.Stacks.basics;

import java.util.Arrays;
import java.util.Stack;

public class Main {
    public static void main(String[] args){

        /* **** Reversing String with inbuilt stack (my solution) **** */

        String name = "Bright";
        char[] nameArray = name.toCharArray();
        int nameLength = nameArray.length;
        Stack<Character> stack = new Stack<>();

        // Add to stack
        for(char i: nameArray){
            stack.push(i);
        }
        // Reset name array
        nameArray = new char[nameLength];

        // get reversed string
        for (int x = 0; x < nameLength; x++){
            nameArray[x] = stack.pop();
        }

        // convert array to string
        name = String.valueOf(nameArray);
        System.out.println(name);
        /* *************************************************** */

    }
}