import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class CharFinder {
    Map<Character, Integer> map = new HashMap<>();

    // public void storeString(String input) {
    // for (Character ch : input.toCharArray()) {
    // // if (map.containsKey(ch)) {
    // // var count = map.get(ch);
    // // map.put(ch, ++count);
    // // }
    // // else {
    // // map.put(ch, 1);
    // // }
    // var count = map.containsKey(ch) ? map.get(ch) : 0;
    // map.put(ch, count + 1);
    // }
    // }

    public char findFirstNonRepeatingChar(String input) {
        for (Character ch : input.toCharArray()) {
            var count = map.containsKey(ch) ? map.get(ch) : 0;
            map.put(ch, count + 1);
        }
        for (Character ch : input.toCharArray()) {
            if (map.containsKey(ch) && map.get(ch) == 1) {
                return ch;
            }
        }

        return Character.MIN_VALUE;
    }

    public char findFirstRepeatedChar(String input) {
        Set<Character> set = new HashSet<>();

        for (var ch : input.toCharArray()) {
            if (set.contains(ch) && (ch != ' ')) {
                return ch;
            }
            set.add(ch);
        }

        return Character.MIN_VALUE;
    }
}
