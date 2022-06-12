import java.util.HashSet;
import java.util.Set;

// import java.util.HashMap;
// import java.util.Map;

public class Main {
    public static void main(String[] args) {
        // Map<Integer, String> map = new HashMap<>();

        // map.put(3113, "Chinmay");
        // map.put(1319, "Maithili");

        // System.out.println(map);

        // map.remove(3113);
        // System.out.println(map);

        // var m = map.get(1319);
        // System.out.println(m);

        // System.out.println(map.containsKey(3113));
        // System.out.println(map.containsKey(1319));

        // System.out.println(map.containsValue("Chinmay"));
        // System.out.println(map.containsValue("Maithili"));

        // map.put(3113, "Chinmay");

        // for (var item : map.keySet()) {
        // System.out.println(item);
        // }

        // for (var item : map.entrySet()) {
        // System.out.println(item);
        // }

        // CharFinder finder = new CharFinder();
        // String input = "a blue moon";
        // System.out.println(finder.findFirstNonRepeatingChar(input));

        // Set<Integer> set = new HashSet<>();

        // int[] numbers = { 1, 2, 3, 3, 2, 1, 4 };
        // for (var i : numbers) {
        // set.add(i);
        // }
        // System.out.println(set);

        // CharFinder finder = new CharFinder();
        // String input = "a blue moon";
        // // String input = "a green apple";
        // System.out.println(finder.findFirstRepeatedChar(input));

        HashTable table = new HashTable();
        table.put(6, "A");
        table.put(8, "B");
        table.put(11, "C");
        table.put(6, "A+");

        System.out.println("Done");
        System.out.println(table);

        // table.remove(60);
    }
}