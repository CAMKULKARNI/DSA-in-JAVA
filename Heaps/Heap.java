public class Heap {
    private int items[] = new int[100];
    private int size;

    public void insert(int value) {
        if (isFull()) {
            throw new IllegalStateException();
        }

        items[size++] = value;

        bubbleUp();
    }

    public int remove() {
        if (isEmpty()) {
            throw new IllegalStateException();
        }

        int max_value = items[0];
        items[0] = items[--size];
        bubbleDown();

        return max_value;
    }

    public boolean isFull() {
        return size == items.length;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    private void bubbleUp() {
        var index = size - 1;
        while ((index > 0) && (items[index] > items[parentIndex(index)])) {
            swap(index, parentIndex(index));
            index = parentIndex(index);
        }
    }

    private void bubbleDown() {
        var index = 0;
        while ((index <= size) && isValidParent(index)) {
            int max_child_index = maxChildIndex(index);
            if (max_child_index != -1) {
                swap(index, max_child_index);
                index = max_child_index;
            }
        }
    }

    private boolean isValidParent(int index) {
        int left_Child_Index = leftChildIndex(index);
        int right_Child_Index = rightChildIndex(index);

        if (left_Child_Index == -1 && right_Child_Index == -1) {
            return false;
        } else if (left_Child_Index != -1 && right_Child_Index == -1 && items[index] < items[leftChildIndex(index)]) {
            return true;
        } else if (left_Child_Index != -1 && right_Child_Index != -1 && items[index] < items[leftChildIndex(index)]
                && items[index] < items[rightChildIndex(index)]) {
            return true;
        }

        return false;
    }

    private int maxChildIndex(int index) {
        if (leftChildIndex(index) != -1 && rightChildIndex(index) == -1) {
            return leftChildIndex(index);
        } else if (leftChildIndex(index) != -1 && rightChildIndex(index) != -1) {
            return items[leftChildIndex(index)] > items[rightChildIndex(index)] ? leftChildIndex(index)
                    : rightChildIndex(index);
        } else
            return -1;
    }

    private int leftChildIndex(int index) {
        return (index * 2) + 1 < size ? (index * 2) + 1 : -1;
    }

    private int rightChildIndex(int index) {
        return (index * 2) + 2 < size ? (index * 2) + 2 : -1;
    }

    private int parentIndex(int index) {
        return (index - 1) / 2;
    }

    private void swap(int first, int second) {
        var temp = items[first];
        items[first] = items[second];
        items[second] = temp;
    }
}
