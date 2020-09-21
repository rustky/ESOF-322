public class Sorting {
    SortingBehavior sortingBehavior;

    public Sorting(){
    }
    public void setSortingBehavior(SortingBehavior type){
        sortingBehavior = type;
    }
    public void preformSort(int[] values){
        sortingBehavior.sort(values);
    }
}