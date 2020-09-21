import java.util.*;
public abstract class Sorting {
    SortingBehavior sortingBehavior;

    public Sorting(){
    }
    public void setSortingBehavoir(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Choose a sorting algorithm: ");
        System.out.println("1. Bubble Sort");
        System.out.println("2. Merge Sort");
        System.out.println("3. Quick Sort");
        String sort = sc.nextLine().toLowerCase();
        if
        sortingBehavior = sort;
    }
    public void performSort(){
        sortingBehavior.sort();
    }
}