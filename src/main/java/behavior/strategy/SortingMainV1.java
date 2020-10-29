package behavior.strategy;

import java.util.Arrays;
import java.util.List;

public class SortingMainV1 {

    public static void main(String[] args) {
        List list = Arrays.asList(new Integer[] {44, 5, 3, 5, 5, 64, 3});
        SortingManagerV1 sm = new SortingManagerV1(list);
        sm.sortListBasedOnType(SortingType.MERGE_SORT);
        System.out.println();
        sm.sortListBasedOnType(SortingType.QUICK_SORT);
    }

}
