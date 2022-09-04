package codewithbright.Stacks.basics;

import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class BalancedExpression {

    private final List<Character> leftBrackets = Arrays.asList('[', '{', '<', '(');
    private final List<Character> rightBrackets = Arrays.asList(']', '}', '>', ')');
    
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

                var left = leftBrackets.indexOf(stack.pop());
                var right = rightBrackets.indexOf(ch);

                if (left == right)
                    continue;
                else
                    return false;

            }
        }

        if (!stack.empty()) {
            return false;
        }

        return true;
    }

    private boolean isLeftBracket(char ch){
        return leftBrackets.contains(ch);
    }

    private boolean isRightBracket(char ch){
        return rightBrackets.contains(ch);
    }
}
