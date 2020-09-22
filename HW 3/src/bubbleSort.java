public class bubbleSort implements SortingStrategy {
    @Override
    public void sort(int[] values) {
        System.out.println("Preforming Bubble Sort");
        int n = values.length;
        int i, j, temp;
        boolean swapped;
        for (i = 0; i < n - 1; i++)
        {
            swapped = false;
            for (j = 0; j < n - i - 1; j++)
            {
                if (values[j] > values[j + 1])
                {
                    // swap arr[j] and arr[j+1]
                    temp = values[j];
                    values[j] = values[j + 1];
                    values[j + 1] = temp;
                    swapped = true;
                }
            }

            // IF no two elements were
            // swapped by inner loop, then break
            if (swapped == false)
                break;
        }
        int k;
        for (k = 0; k < n; k++)
            System.out.print(values[k] + " ");
        System.out.println();
    }
}
