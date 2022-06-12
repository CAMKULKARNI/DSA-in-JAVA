import java.util.PriorityQueue;
// import java.util.ArrayDeque;
// import java.util.Queue;
// import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        // Queue<Integer> queue = new ArrayDeque<>();
        // queue.add(10);
        // queue.add(20);
        // queue.add(30);
        // System.out.println(queue);

        // // var front = queue.remove();
        // // System.out.println(queue);
        // // System.out.println(front);

        // reverse(queue);
        // System.out.println(queue);

        // ArrayQueue queue = new ArrayQueue(5);
        // queue.enqueue(10);
        // queue.enqueue(20);
        // queue.enqueue(30);
        // System.out.println(queue);
        // queue.dequeue();
        // System.out.println(queue);
        // queue.enqueue(100);
        // queue.enqueue(200);
        // queue.enqueue(300);
        // System.out.println(queue);

        // QueueWithTwoStacks queue = new QueueWithTwoStacks();

        // queue.enqueue(10);
        // queue.enqueue(20);
        // queue.enqueue(30);
        // var first = queue.dequeue();
        // System.out.println(first);

        // PriorityQueue<Integer> queue = new PriorityQueue();
        // queue.add(5);
        // queue.add(1);
        // queue.add(3);
        // queue.add(2);

        // while (!queue.isEmpty()) {
        // System.out.println(queue.remove());
        // }

        PriorityQueue queue = new PriorityQueue();
        queue.add(5);
        queue.add(3);
        System.out.println(queue);
        queue.add(6);
        System.out.println(queue);
        queue.add(1);
        System.out.println(queue);
        
        while (!queue.isEmpty()) {
            System.out.println(queue.remove());
        }
    }

    // public static void reverse(Queue<Integer> queue) {
    // Stack<Integer> stack = new Stack<>();
    // while (!queue.isEmpty()) {
    // stack.push(queue.remove());
    // }

    // while (!stack.isEmpty()) {
    // queue.add(stack.pop());
    // }
    // }
}