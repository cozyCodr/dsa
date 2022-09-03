package codewithbright.Stacks.basics;

import java.util.ArrayList;
import java.util.Stack;

public class BalancedExpression {

    public boolean isBalanced(String string){
        Stack<Character> stack = new Stack<>();
        ArrayList<Character> leftBrackets = new ArrayList<Character>();
        leftBrackets.add('[');
        leftBrackets.add('{');
        leftBrackets.add('<');
        leftBrackets.add('(');
        ArrayList<Character> rightBrackets = new ArrayList<>();
        rightBrackets.add(']');
        rightBrackets.add('}');
        rightBrackets.add('>');
        rightBrackets.add(')');

        for (char ch : string.toCharArray()){
            // Check if character is a left bracket
            if(leftBrackets.contains(ch)){
                stack.push(ch);
            }
            // Check if character is a right bracket
            if(rightBrackets.contains(ch)){
                char lastInsertedBracket = stack.pop();
                if (lastInsertedBracket == ch)
                    continue;
                else
                    return false;
            }
        }
        return true;
    }
}
