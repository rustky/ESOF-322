/**
 * This is the class for running the program. Simply run this class to see the output of this project
 */
public class Driver {
    public static void main(String args[]){
        int[] intArray = new int[]{ 1,6,3,4 };
        Inventory1 inventory1 = new Inventory1();
        Inventory2 inventory2 = new Inventory2();

        inventory1.preformSort(intArray);
        inventory1.setSortingStrategy(new insertionSort());
        inventory1.preformSort(intArray);

        inventory2.preformSort(intArray);
        inventory2.setSortingStrategy(new heapSort());
        inventory2.preformSort(intArray);

    }
}
