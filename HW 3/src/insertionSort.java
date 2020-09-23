/**
 * Implementation of Insertion Sort from the internet
 * See Works Cited for source
 */
public class insertionSort implements SortingStrategy {
    @Override
    public void sort(int[] values) {
        System.out.println("Preforming Insertion Sort");
        int n = values.length;
        for (int i = 1; i < n; ++i) {
            int key = values[i];
            int j = i - 1;

            /* Move elements of arr[0..i-1], that are
               greater than key, to one position ahead
               of their current position */
            while (j >= 0 && values[j] > key) {
                values[j + 1] = values[j];
                j = j - 1;
            }
            values[j + 1] = key;
        }
        int k;
        for (k = 0; k < n; k++)
            System.out.print(values[k] + " ");
        System.out.println();
    }
}
