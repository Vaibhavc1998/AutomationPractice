package Day35.Mar4th.Selenium;

// WAP in Java to get the duplicate elements count.

import java.util.HashMap;
import java.util.Map;

public class DuplicateElementCount {
    public static void main(String[] args) {
        int[] arr = {4, 2, 4, 5, 2, 3, 1, 7, 7, 8, 9, 9, 2};
        Map<Integer, Integer> elementCountMap = new HashMap<>();

        // Counting occurrences of each element
        for (int num : arr) {
            if (elementCountMap.containsKey(num)) {
                elementCountMap.put(num, elementCountMap.get(num) + 1);
            } else {
                elementCountMap.put(num, 1);
            }
        }

        // Printing duplicate elements and their counts
        System.out.println("Duplicate Elements and their Counts:");
        for (Map.Entry<Integer, Integer> entry : elementCountMap.entrySet()) {
            if (entry.getValue() > 1) {
                System.out.println(entry.getKey() + " : " + entry.getValue());
            }
        }
    }
}