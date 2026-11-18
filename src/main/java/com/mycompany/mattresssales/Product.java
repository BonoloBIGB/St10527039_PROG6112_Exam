/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mattresssales;

/**
 *
 * @author Student
 */

// Implements IProduct and holds the sales data for the report 
public class Product implements IProduct {

    // Single-dimensional arrays
    private final String[] productNames;
    private final int[] productTotals;

    // Two-dimensional array: [product][month]
    private final int[][] monthlySales;

    // Adds up each product's monthly sales into the productTotals array
    public Product(String[] productNames, int[][] monthlySales) {
        this.productNames = productNames;
        this.monthlySales = monthlySales;
        this.productTotals = new int[productNames.length];

        for (int p = 0; p < monthlySales.length; p++) {
            for (int m = 0; m < monthlySales[p].length; m++) {
                productTotals[p] += monthlySales[p][m];
            }
        }
    }

    @Override
    // Adds every product's total to give the overall number of products sold
    public int GetTotalProductsSold() {
        int total = 0;
        for (int productTotal : productTotals) {
            total += productTotal;
        }
        return total;
    }

    @Override
    // Total sales divided by the number of product-month entries; returns 0 if there is no data
    public double GetAverageProductSold() {
        int entries = 0;
        for (int[] productSales : monthlySales) {
            entries += productSales.length;
        }
        if (entries == 0) {
            return 0;
        }
        return (double) GetTotalProductsSold() / entries;
    }

    @Override
    // Finds the product with the highest total sales and returns its name and total
    public String GetMostPopularProduct() {
        int bestIndex = 0;
        for (int p = 1; p < productTotals.length; p++) {
            if (productTotals[p] > productTotals[bestIndex]) {
                bestIndex = p;
            }
        }
        return productNames[bestIndex] + "(" + productTotals[bestIndex] + ")";
    }
}

