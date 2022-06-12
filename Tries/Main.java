public class Main {
    public static void main(String[] args) {
        var trie = new Trie();
        trie.insert("car");
        // trie.insert("canada");
        // System.out.println(trie.contains("can"));
        // trie.traverse();
        trie.insert("care");
        trie.insert("card");
        // System.out.println(trie.contains("care"));
        // System.out.println(trie.contains("car"));
        trie.insert("careful");
        trie.insert("egg");
        var words = trie.findWords("care");
        System.out.println(words);
        System.out.println("Done");
    }
}