import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        var heap = new Heap();

        // heap.insert(10);
        // heap.insert(5);
        // heap.insert(17);
        // heap.insert(4);
        // heap.insert(22);

        // System.out.println(heap.remove());
        // System.out.println(heap.remove());

        // System.out.println("DONE");

        int[] numbers = new int[10];
        Random rand = new Random();
        for (int i = 0; i < 10; i++) {
            numbers[i] = rand.nextInt(100);
        }

        // for (int i = 0; i < 10; i++) {
        // int num = numbers[i];
        // heap.insert(num);
        // }

        // for (int i = 0; i < 10; i++) {
        // System.out.print(numbers[i] + "\t");
        // }

        System.out.println(Arrays.toString(numbers));

        // for (int i = 0; i < 10; i++) {
        // System.out.print(heap.remove() + "\t");
        // }

        MaxHeap.heapify(numbers);
        System.out.println(Arrays.toString(numbers));
    }
}