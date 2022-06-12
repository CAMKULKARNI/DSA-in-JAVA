import java.util.ArrayDeque;
import java.util.Queue;

public class Tree {
    private class Node {
        private int value;
        private Node leftChild;
        private Node rightChild;

        public Node(int value) {
            this.value = value;
            this.leftChild = null;
            this.rightChild = null;
        }

        @Override
        public String toString() {
            return "Node = " + value;
        }

    }

    private Node root;

    public void insert(int value) {
        if (root == null) {
            root = new Node(value);
            return;
        }

        var current = root;

        while (true) {
            if (value < current.value) {
                if (current.leftChild == null) {
                    current.leftChild = new Node(value);
                    return;
                }
                current = current.leftChild;
            } else {
                if (current.rightChild == null) {
                    current.rightChild = new Node(value);
                    return;
                }
                current = current.rightChild;
            }
        }
    }

    public Node find(int value) {
        var current = root;
        while (current != null) {
            if (value < current.value) {
                current = current.leftChild;
            } else if (value > current.value) {
                current = current.rightChild;
            } else {
                return current;
            }
        }
        return null;
    }

    public void preOrder() {
        preOrder(root);
    }

    private void preOrder(Node root) {
        if (root == null) {
            return;
        }

        System.out.println(root.value + "\t");
        preOrder(root.leftChild);
        preOrder(root.rightChild);
    }

    public void inOrder() {
        inOrder(root);
    }

    private void inOrder(Node root) {
        if (root == null) {
            return;
        }

        inOrder(root.leftChild);
        System.out.println(root.value + "\t");
        inOrder(root.rightChild);
    }

    public void postOrder() {
        postOrder(root);
    }

    private void postOrder(Node root) {
        if (root == null) {
            return;
        }

        postOrder(root.leftChild);
        postOrder(root.rightChild);
        System.out.println(root.value + "\t");
    }

    public int height(int value) {
        var node = find(value);

        if (node == null) {
            return -1;
        }

        if (node.leftChild == null || node.rightChild == null) {
            return 0;
        }

        return 1 + Math.max(height(node.leftChild.value), height(node.rightChild.value));
    }

    public int minimum() {
        return minimum(root);
    }

    private int minimum(Node root) {
        var node = root;
        if (node == null) {
            return Integer.MIN_VALUE;
        }
        while (node.leftChild != null) {
            node = node.leftChild;
        }

        return node.value;
    }

    public boolean isBST() {
        return isBST(root, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }

    private boolean isBST(Node node, int min, int max) {
        if (node == null) {
            return true;
        }

        if (node.value < min || node.value > max) {
            return false;
        }

        return isBST(node.leftChild, min, node.value - 1) && isBST(node.rightChild, node.value + 1, max);
    }

    public void swapRoot() {
        var temp = root.leftChild.value;
        root.leftChild.value = root.value;
        root.value = temp;
    }

    public void printNodesAtKdistance(int k) {
        printNodesAtKdistance(root, k);
    }

    private void printNodesAtKdistance(Node node, int k) {
        if (node == null) {
            return;
        }
        if (k == 0) {
            System.out.println(node.value + "\t");
        } else {
            printNodesAtKdistance(node.leftChild, k - 1);
            printNodesAtKdistance(node.rightChild, k - 1);
        }
    }

    public void levelOrder() {
        levelOrder(root);
    }

    private void levelOrder(Node root) {
        Queue<Node> queue = new ArrayDeque<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            if (queue.element().leftChild != null) {
                queue.add(queue.element().leftChild);
            }
            if (queue.element().rightChild != null) {
                queue.add(queue.element().rightChild);
            }

            System.out.println(queue.element().value);
            queue.remove();
        }
    }

}
