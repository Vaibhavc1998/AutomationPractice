package Day35.Mar4th.Selenium;

// WAP in java to validate list is in sorted order or not (Descending / Ascending).

import java.util.ArrayList;
import java.util.List;

public class SortedListValidator {
    public static void main(String[] args) {
        // Example usage
        List<Integer> ascendingList = new ArrayList<>();
        ascendingList.add(1);
        ascendingList.add(3);
        ascendingList.add(5);
        ascendingList.add(7);

        List<Integer> descendingList = new ArrayList<>();
        descendingList.add(7);
        descendingList.add(5);
        descendingList.add(3);
        descendingList.add(1);

        System.out.println("Is ascendingList sorted in ascending order? " + isSortedAscending(ascendingList));
        System.out.println("Is descendingList sorted in ascending order? " + isSortedAscending(descendingList));
        System.out.println("Is ascendingList sorted in descending order? " + isSortedDescending(ascendingList));
        System.out.println("Is descendingList sorted in descending order? " + isSortedDescending(descendingList));
    }

    // Method to check if the list is sorted in ascending order
    public static <T extends Comparable<? super T>> boolean isSortedAscending(List<T> list) {
        for (int i = 1; i < list.size(); i++) {
            if (list.get(i - 1).compareTo(list.get(i)) > 0) {
                return false;
            }
        }
        return true;
    }

    // Method to check if the list is sorted in descending order
    public static <T extends Comparable<? super T>> boolean isSortedDescending(List<T> list) {
        for (int i = 1; i < list.size(); i++) {
            if (list.get(i - 1).compareTo(list.get(i)) < 0) {
                return false;
            }
        }
        return true;
    }
}
