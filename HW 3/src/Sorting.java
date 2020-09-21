public class Sorting {
    SortingStrategy sortingStrategy;

    public Sorting(){
    }
    public void setSortingStrategy(SortingStrategy type){
        sortingStrategy = type;
    }
    public void preformSort(int[] values){
        sortingStrategy.sort(values);
    }
}