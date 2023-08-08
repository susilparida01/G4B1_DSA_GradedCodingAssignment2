package com.greatlearning.dsa.driver;
import com.greatlearning.dsa.model.SkyscraperConstruction;
import java.util.Scanner;

public class SkyscraperDriver {

    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Question 1: Skyscraper Construction:");
        // question 1: driver code to get order of construction
        SkyscraperConstruction construction = new SkyscraperConstruction();

        // call to get user input related to building details
        construction.getFloorDetails(scanner);

        // call to print order of construction based on the user input
        construction.orderOfConstruction();
        scanner.close();
    }
}