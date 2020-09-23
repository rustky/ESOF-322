/**
 *  An abstract class that sets up the instance fields and methods needed to operate the sorting project
 */
public abstract class Sorting {
    // An instance of the sortingStrategy class to keep track of what sorting algorithm you're using
    SortingStrategy sortingStrategy;

    public Sorting(){
    }

    /**
     * Sets the sorting algorithm type
     * @param type
     */
    public void setSortingStrategy(SortingStrategy type){
        sortingStrategy = type;
    }

    /**
     * Preforms the sorting of an array of integers
     * @param values
     */
    public void preformSort(int[] values){
        sortingStrategy.sort(values);
    }
}