public class Driver {
    public static void main(String args[]){
        int[] intArray = new int[]{ 1,6,3,4 };
        Sorting test = new Sorting();
        test.setSortingBehavior(new bubbleSort());
        test.preformSort(intArray);
        test.setSortingBehavior(new mergeSort());
        test.preformSort(intArray);
    }
}
