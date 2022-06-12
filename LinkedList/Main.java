import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        var list = new linkedlist();
        list.addLast(10);
        list.addLast(20);
        list.addLast(30);

        // System.out.println(list.indexOf(10));

        // list.removeFirst();
        // System.out.println(list.indexOf(10));

        // list.removeLast();
        // System.out.println(list.indexOf(30));

        var array = list.toArray();

        System.out.println(Arrays.toString(array));

        list.reverse();
        
        array = list.toArray();

        System.out.println(Arrays.toString(array));

        System.out.println(list.kNodeFromEnd(4));

        // System.out.println(list.size());
    }
}
