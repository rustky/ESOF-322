public class heapSort implements SortingStrategy {
    @Override
    public void sort(int[] values) {
        System.out.println("Preforming Heap Sort");
        if (values.length == 0) return;

        // Building the heap
        int length = values.length;
        // we're going from the first non-leaf to the root
        for (int i = length / 2-1; i >= 0; i--)
            heapify(values, length, i);

        for (int i = length-1; i >= 0; i--) {
            int temp = values[0];
            values[0] = values[i];
            values[i] = temp;

            heapify(values, i, 0);
        }
        int k;
        for (k = 0; k < values.length; k++)
            System.out.print(values[k] + " ");
        System.out.println();
    }

    static void heapify(int[] array, int length, int i) {
        int leftChild = 2*i+1;
        int rightChild = 2*i+2;
        int largest = i;

        // if the left child is larger than parent
        if (leftChild < length && array[leftChild] > array[largest]) {
            largest = leftChild;
        }

        // if the right child is larger than parent
        if (rightChild < length && array[rightChild] > array[largest]) {
            largest = rightChild;
        }

        // if a swap needs to occur
        if (largest != i) {
            int temp = array[i];
            array[i] = array[largest];
            array[largest] = temp;
            heapify(array, length, largest);
        }
    }
}
