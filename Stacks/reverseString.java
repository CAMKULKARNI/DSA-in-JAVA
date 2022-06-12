import java.util.Stack;

public class reverseString {

    public String reverse(String input) {

        if (input == null)
            throw new IllegalArgumentException("Fuck You !!");

        Stack<Character> stack = new Stack<>();
        // for (int i = 0; i < input.length(); i++){
        // stack.push(input.charAt(i));
        // }
        for (Character character : input.toCharArray()) {
            stack.push(character);
        }

        StringBuffer reversed = new StringBuffer();

        while (!stack.isEmpty()) {
            reversed.append(stack.pop());
        }

        return reversed.toString();
    }
}
