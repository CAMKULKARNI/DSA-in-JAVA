public class BubbleSort {
    public void sort(int[] array) {
        boolean isSorted;
        for (int i = 0; i < array.length; i++) {
            isSorted = true;
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] > array[j]) {
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                    isSorted = false;
                }
            }

            if (isSorted) {
                return;
            }
        }
    }
}
