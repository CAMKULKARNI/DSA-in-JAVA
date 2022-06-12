public class Main {
    public static void main(String[] args) {
        Tree tree = new Tree();
        tree.insert(7);
        tree.insert(4);
        tree.insert(9);
        tree.insert(1);
        tree.insert(6);
        tree.insert(8);
        tree.insert(10);
        tree.insert(-1);
        System.out.println(tree.find(10) + "\n" + tree.find(11));

        tree.preOrder();
        System.out.println("\n");
        tree.inOrder();
        System.out.println("\n");
        tree.postOrder();

        System.out.println("\n" + tree.height(7));

        System.out.println("\n" + tree.minimum());

        System.out.println(tree.isBST());

        // tree.swapRoot();
        // System.out.println(tree.isBST());

        System.out.println("\n");
        tree.printNodesAtKdistance(4);

        tree.levelOrder();
    }
}