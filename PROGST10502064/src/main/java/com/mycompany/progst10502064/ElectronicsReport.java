package com.mycompany.progst10502064;

public class ElectronicsReport {

    public static void main(String[] args) {

        // Single-dimensional arrays
        String[] cities = {"CAPE TOWN", "PORT ELIZABETH", "PRETORIA"};
        String[] consoles = {"PS5", "XBOX", "SWITCH"};

        // Two-dimensional array: rows = cities, columns = consoles
        int[][] sales = {
            {1000, 2000, 3000},   // Cape Town
            {2000, 3000, 4000},   // Port Elizabeth
            {1500, 1100, 1200}    // Pretoria
        };

        int[] cityTotals = new int[cities.length];

        // Calculate total sales for each city
        for (int i = 0; i < cities.length; i++) {
            for (int j = 0; j < consoles.length; j++) {
                cityTotals[i] += sales[i][j];
            }
        }

        // Find city with the most sales
        int best = 0;
        for (int i = 1; i < cities.length; i++) {
            if (cityTotals[i] > cityTotals[best]) {
                best = i;
            }
        }

        String line = "-------------------------------------------------------------";

        // Gaming console report
        System.out.println(line);
        System.out.println("GAMING CONSOLE REPORT");
        System.out.println(line);

        System.out.printf("%-20s", "");
        for (String console : consoles) {
            System.out.printf("%-10s", console);
        }
        System.out.println();

        for (int i = 0; i < cities.length; i++) {
            System.out.printf("%-20s", cities[i]);
            for (int j = 0; j < consoles.length; j++) {
                System.out.printf("%-10d", sales[i][j]);
            }
            System.out.println();
        }

        // Totals per city
        System.out.println(line);
        System.out.println("CONSOLE SALES TOTALS FOR EACH CITY");
        System.out.println(line);
        for (int i = 0; i < cities.length; i++) {
            System.out.printf("%-20s%d%n", cities[i], cityTotals[i]);
        }

        // Best city
        System.out.println(line);
        System.out.println("CITY WITH THE MOST SALES: " + cities[best]);
        System.out.println(line);
    }
}
