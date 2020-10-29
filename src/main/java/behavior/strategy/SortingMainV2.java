package behavior.strategy;

import java.util.Arrays;
import java.util.List;

public class SortingMainV2 {

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(new Integer[] {44, 5, 3, 5, 5, 64, 3});
        MergeSortStrategy mergeSortStrategy = new MergeSortStrategy();
        SortingManagerV2 sm = new SortingManagerV2(mergeSortStrategy, list);
        sm.sortList();

        System.out.println();

        QuickSortStrategy quickSortStrategy = new QuickSortStrategy();
        sm.setSortingStrategy(quickSortStrategy);
        sm.sortList();

        System.out.println();

        HeapSortStrategy heapSortStrategy = new HeapSortStrategy();
        sm.setSortingStrategy(heapSortStrategy);
        sm.sortList();
    }

}
