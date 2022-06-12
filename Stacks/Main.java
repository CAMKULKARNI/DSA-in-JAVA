// import java.util.Stack;
public class Main {
    public static void main(String[] args) {
        // Stack<Integer> stack = new Stack<>();
        // stack.push(10);
        // stack.push(20);
        // stack.push(30);
        // System.out.println(stack);
        // var top = stack.pop();
        // System.out.println(top);
        // System.out.println(stack);
        // System.out.println(stack.isEmpty());

        // String str = null;
        // reverseString reverser = new reverseString();
        // var result = reverser.reverse(str);

        // System.out.println(result);

        // String str = "({1 + 2})";
        // expression exp = new expression();
        // var result = exp.isBalanced(str);
        // System.out.println(result);

        Stack stack = new Stack();
        stack.push(10);
        stack.push(11);
        stack.push(12);
        System.out.println(stack);
        stack.pop();
        System.out.println(stack);
        System.out.println(stack.peek());
        ;
    }
}