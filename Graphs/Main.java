public class Main {
    public static void main(String[] args) {
        var graph = new Graph();
        // graph.addNode("A");
        // graph.addNode("B");
        // graph.addNode("C");
        // graph.addNode("D");
        // graph.addEdge("A", "C");
        // graph.addEdge("A", "B");
        // graph.addEdge("D", "A");
        // graph.addEdge("B", "D");
        // graph.addEdge("D", "C");
        // graph.print();
        // graph.removeEdge("D", "A");
        // graph.print();
        // graph.removeNode("D");
        // graph.print();
        // graph.traverseDepthFirst("A");
        // graph.traverseDepthFirst("B");
        // graph.traverseDepthFirst("C");
        // graph.traverseDepthFirst("D");
        // graph.traverseBreadthFirst("A");

        // graph.addNode("X");
        // graph.addNode("A");
        // graph.addNode("B");
        // graph.addNode("P");
        // graph.addEdge("X", "A");
        // graph.addEdge("X", "B");
        // graph.addEdge("A", "P");
        // graph.addEdge("B", "P");

        // var list = graph.topologicalSort();

        // System.out.println(list);

        graph.addNode("A");
        graph.addNode("B");
        graph.addNode("C");
        graph.addEdge("A", "B");
        graph.addEdge("B", "C");
        graph.addEdge("C", "A");

        System.out.println(graph.hasCycle());
    }
}