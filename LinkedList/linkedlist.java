public class linkedlist {
    private class Node {
        private int value;
        private Node next;
    
        public Node(int value) {
            this.value = value;
        }
    }
    
    private Node first; 
    private Node last;
    private int count = 0;
    
    public void addLast(int item) {
        var node = new Node(item);
        count++;
            
        if (first == null)
            first = last = node;
        else {
            last.next = node;
            last = node;
        }
    }

    public void addFirst(int item) {
        var node = new Node(item);
        count++;
            
        if (first == null)
            first = last = node;
        else {
            node.next = first;
            first = node;
        }
    }

    public int indexOf(int item) {
        int index = 0;
        var current = first;
        
        while (current != null) {
            if (current.value == item)
                return index;
            current = current.next;
            index++;
        }

        return -1;
    }

    public boolean contains(int item) {
        return indexOf(item) == -1;
    }

    public void removeFirst() {
        if (first == null) {
            return ;
        }
        
        count--;
        
        if (first == last) {
            first = last = null;
        }
        else {
            first = first.next;
        }
    }
   
    public void removeLast() {

        if (first == null) {
            return;
        }
        
        count--;
        
        if (first == last) {
            first = last = null;
        }

        var current = first;

        while (current != null) {
            if (current.next == last)
                break;
            current = current.next;
        }
        last = current;
        last.next = null;

    }

    public int size() {
        return count;
    }

    public int[] toArray() {
        int[] array = new int[count];
        var current = first;
        var index = 0;
        while (current != null) {
            array[index++] = current.value;
            current = current.next;
        }

        return array;
    }

    public void reverse() {
        var tail = first;

        while (tail != null && tail.next != null) {
            tail = tail.next;
        }

        while (tail != first) {
            var temp = first.next;
            first.next = tail.next;
            tail.next = first;
            first = temp;
        }
    }

    public int kNodeFromEnd(int k) {
        if (k >= count) {
            System.err.println("Enter a valid index you fucking Bastard !!");
            return;
        }
        int iterations = count - k + 1;
        var current = first;
        for (int i = 0; i < iterations - 1; i++) {
            current = current.next;
        }

        return current.value;
    }
}

