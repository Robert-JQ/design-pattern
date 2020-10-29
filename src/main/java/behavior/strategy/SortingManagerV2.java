package behavior.strategy;

import java.util.List;

public class SortingManagerV2 {

    SortingStrategy sortingStrategy;
    List<Integer> list;

    public SortingManagerV2(SortingStrategy sortingStrategy, List<Integer> list) {
        this.sortingStrategy = sortingStrategy;
        this.list = list;
    }

    public void sortList() {
        System.out.println("=================");
        System.out.println("Sorting List based on Type");
        System.out.println("=================");
        sortingStrategy.sort(list);
    }

    public SortingStrategy getSortingStrategy() {
        return sortingStrategy;
    }

    public void setSortingStrategy(SortingStrategy sortingStrategy) {
        this.sortingStrategy = sortingStrategy;
    }
}
