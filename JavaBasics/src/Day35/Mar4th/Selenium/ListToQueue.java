package Day35.Mar4th.Selenium;

// WAP in java to add list in to Queue 

import java.util.*;

public class ListToQueue {
    public static void main(String[] args) {
        // Create a list
        List<Integer> myList = new ArrayList<>();
        myList.add(1);
        myList.add(2);
        myList.add(3);
        myList.add(4);
        myList.add(5);

        // Create a queue
        Queue<Integer> myQueue = new LinkedList<>();

        // Add elements of the list to the queue
        for (Integer element : myList) {
            myQueue.offer(element); // Add an element to the end of the queue
        }

        // Display the elements of the queue
        System.out.println("Elements of the queue:");
        while (!myQueue.isEmpty()) {
            System.out.println(myQueue.poll()); // Remove and return the head of the queue
        }
    }
}
