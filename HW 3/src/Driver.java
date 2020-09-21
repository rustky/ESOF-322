public class Driver {
    public static void main(String args[]){
        int[] intArray = new int[]{ 1,6,3,4 };
        Sorting Inventory1 = new Sorting();
        Inventory1.setSortingStrategy(new bubbleSort());
        Inventory1.preformSort(intArray);
        Inventory1.setSortingStrategy(new mergeSort());
        Inventory1.preformSort(intArray);
    }
}
