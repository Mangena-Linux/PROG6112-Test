package com.mycompany.devicesales;

import java.util.Scanner;

public class RunApplication {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] types = {"PS5", "XBOX", "SWITCH"};

        // Select console type
        int choice = 0;
        while (choice < 1 || choice > types.length) {
            System.out.println("Select the console type");
            for (int i = 0; i < types.length; i++) {
                System.out.println((i + 1) + ") " + types[i]);
            }
            try {
                choice = Integer.parseInt(input.nextLine().trim());
            } catch (NumberFormatException e) {
                choice = 0;
            }
            if (choice < 1 || choice > types.length) {
                System.out.println("Invalid choice. Try again.\n");
            }
        }
        String consoleType = types[choice - 1];

        // Store name
        System.out.print("Enter the store: ");
        String store = input.nextLine().trim();

        // Total sales
        int totalSales = -1;
        while (totalSales < 0) {
            System.out.print("Enter the total sales of " + consoleType
                    + " consoles for " + store + ": ");
            try {
                totalSales = Integer.parseInt(input.nextLine().trim());
            } catch (NumberFormatException e) {
                totalSales = -1;
            }
            if (totalSales < 0) {
                System.out.println("Invalid amount. Enter a whole number of 0 or more.");
            }
        }

        // Instantiate ConsoleSales and print report
        ConsoleSales report = new ConsoleSales(consoleType, store, totalSales);
        report.printReport();
    }
}
