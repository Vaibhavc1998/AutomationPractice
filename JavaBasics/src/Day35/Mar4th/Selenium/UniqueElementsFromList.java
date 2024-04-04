package Day35.Mar4th.Selenium;

// WAP in java to get the unique elements only from the list.

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class UniqueElementsFromList {

	public static void main(String[] args) {
		
		// Sample list
        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(2);
        numbers.add(4);
        numbers.add(3);

        // Get unique elements
        List<Integer> uniqueNumbers = getUniqueElements(numbers);

        // Print unique elements
        System.out.println("Unique elements:");
        for (Integer num : uniqueNumbers) 
        {
            System.out.println(num);
        }
    }

    public static <T> List<T> getUniqueElements(List<T> list) 
    {
        Set<T> set = new HashSet<>(list);
        return new ArrayList<>(set);
    }
}