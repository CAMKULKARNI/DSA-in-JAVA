import java.util.Stack;

public class expression {
    public boolean isBalanced(String input) {
        Stack<Character> stack = new Stack<>();

        for (Character character : input.toCharArray()) {
            if (character == '(' || character == '<' || character == '[' || character == '{') {
                stack.push(character);
            } else if (character == ')' || character == '>' || character == ']' || character == '}') {
                if (!stack.isEmpty()) {
                    var top = stack.pop();
                    if ((character == ')' && top != '(') || (character == '>' && top != '<')
                            || (character == ']' && top != '[') || (character == '}' && top != '{')) {
                        return false;
                    }
                } else {
                    return false;
                }
            }
        }

        return stack.isEmpty();
    }
}
