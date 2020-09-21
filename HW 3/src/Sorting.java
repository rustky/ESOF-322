public class Sorting {
    SortingBehavior sortingBehavior;

    public Sorting(){
    }
    public void setSortingBehavior(SortingBehavior sort){
        sortingBehavior = sort;
    }
    public void preformSort(int[] values){
        sortingBehavior.sort(values);
    }
}