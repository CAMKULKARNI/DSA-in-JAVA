public class Main {
    public static void main(String[] args) {
        Array numbers = new Array(0);
        numbers.insert(10);
        numbers.insert(20);
        numbers.insert(30);
        numbers.insert(40);
        numbers.print(); 
        System.out.println();
        // numbers.removeAt(-1);
        numbers.removeAt(2);
        numbers.print();

        System.out.println(numbers.search(30));
    }
}