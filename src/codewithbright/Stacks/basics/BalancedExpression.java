package codewithbright.Stacks.basics;

import java.util.Arrays;
import java.util.Stack;

public class BalancedExpression {

    public boolean isBalanced(String string){
        Stack<Character> stack = new Stack<>();

        for (char ch : string.toCharArray()){
            // Check if character is a left bracket
            if(isLeftBracket(ch)){
                stack.push(ch);
            }
            // Check if character is a right bracket
            if(isRightBracket(ch)){
                if(stack.empty())
                    return false;
                stack.pop();
            }
        }

        if (!stack.empty()) {
            return false;
        }

        return true;
    }

    private boolean isLeftBracket(char ch){
        var leftBrackets = Arrays.asList('[', '{', '<', '(');
        return leftBrackets.contains(ch);
    }

    private boolean isRightBracket(char ch){
        var rightBrackets = Arrays.asList(']', '}', '>', ')');
        return rightBrackets.contains(ch);
    }
}
