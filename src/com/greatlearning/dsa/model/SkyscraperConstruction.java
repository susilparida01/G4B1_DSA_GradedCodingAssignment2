package com.greatlearning.dsa.model;

import java.util.Collections;
import java.util.Scanner;
import java.util.TreeSet;

public class SkyscraperConstruction {

    // instance variable to store number of floors in the building
    private int noOfFloors;

    // instance variable to store each floor size
    private int[] floorSizes;

    /**
     * Gets No of Floors and size of the floor on day basis from user
     *
     * @param scanner - instance of scanner class
     */
    public void getFloorDetails(Scanner scanner) {
        System.out.print("Enter the total number of floors in the building: ");
        noOfFloors = scanner.nextInt();
        if (noOfFloors <= 0) {
            System.out.println("Invalid input. Number of floors should be a positive integer.");
            return;
        }
        floorSizes = new int[noOfFloors];
        for (int i = 0; i < noOfFloors; i++) {
            System.out.println("enter the floor size given on day : " + (i + 1));
            floorSizes[i] = scanner.nextInt();
            if (floorSizes[i] <= 0) {
                System.out.println("Invalid input. Floor Size should be a positive integer.");
                return;
            }
        }
    }

    /**
     * Prints order of construction based on the user input
     */
    public void orderOfConstruction() {
        TreeSet<Integer> treeSet = new TreeSet<>(Collections.reverseOrder());
        int currentFloor = noOfFloors;
        System.out.println("The order of construction is as follows");
        for (int i = 0; i < noOfFloors; i++) {
            treeSet.add(floorSizes[i]);
            StringBuilder floors = new StringBuilder();
            while (!treeSet.isEmpty() && treeSet.iterator().next() >= currentFloor) {
                int largest = treeSet.iterator().next();
                floors.append(largest).append(" ");
                treeSet.remove(largest);
                currentFloor--;
            }
            System.out.println("Day: " + (i + 1));
            System.out.println(floors);
        }
    }
}