/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mattresssales;

/**
 *
 * @author Student
 */
import java.util.Scanner;

public class SalesReport {
    // Console application that captures three months of sales for three mattresses and prints a sales report

   public static void main(String[] args) {
       
       // 1D array: stores the names of the three mattress products
       String[] productNames = {
           "Cozy Nights Monarch",
           "Restonic Barbados",
           "Sealy Phuket"
       };
       
       // 2D array: rows = products, columns = months
       int months = 3;
       int[][] monthlySales = new int[productNames.length][months];

       Scanner input = new Scanner(System.in);

       // Nested loop captures each month's sales for every product 
       for (int p = 0; p < productNames.length; p++) {
           for (int m = 0; m < months; m++) {
               monthlySales[p][m] = readSales(input,
                       "Enter number of sales for month " + (m + 1)
                       + " for " + productNames[p] + " mattress: ");
           }
           System.out.println();
       }

       // Product holds the sales data and performs the calculations
       IProduct product = new Product(productNames, monthlySales);
       
       // PrintProduct displays the report
       PrintProduct printer = new PrintProduct(product);

       System.out.println();
       printer.PrintReportHeader();
       printer.PrintTotalProductSales();
       printer.PrintAverageProductSales();
       printer.PrintMostPopularProduct();
   }

   // This Prompts until the user enters a valid whole number of 0 or more 
   private static int readSales(Scanner input, String prompt) {
       while (true) {
           System.out.print(prompt);
           String line = input.nextLine().trim();
           try {
               int value = Integer.parseInt(line);
               if (value >= 0) {
                   return value;
               }
               System.out.println("Please enter a whole number of 0 or more.");
           } catch (NumberFormatException e) {
               System.out.println("Invalid input. Please enter a whole number.");
           }
       }
   }
}
