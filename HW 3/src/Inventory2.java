/**
 * Extends the Sorting class and sets an initial sorting algorithm
 */
public class Inventory2 extends Sorting {
    public Inventory2(){
        setSortingStrategy(new insertionSort());
    }
}
