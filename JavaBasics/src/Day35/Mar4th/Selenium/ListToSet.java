package Day35.Mar4th.Selenium;

// WAP in java to add list in to set

import java.util.*;

public class ListToSet {
    public static void main(String[] args) {
        // Create a list
        List<String> myList = new ArrayList<>();
        myList.add("Apple");
        myList.add("Banana");
        myList.add("Orange");
        myList.add("Banana"); // Adding duplicate for demonstration

        // Create a set and add all elements of the list to it
        Set<String> mySet = new HashSet<>(myList);

        // Display elements of the set
        System.out.println("Elements of the set:");
        for (String element : mySet) {
            System.out.println(element);
        }
    }
}