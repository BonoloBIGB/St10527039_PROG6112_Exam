/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mattresssales;

/**
 *
 * @author Student
 */
import java.text.DecimalFormat;
import java.time.Year;

// Responsible only for printing the report, which keeps output separate from the calculations 
public class PrintProduct {

    private final IProduct product;

    public PrintProduct(IProduct product) {
        this.product = product;
    }

    //This method prints the report header.
    public void PrintReportHeader() {
        System.out.println("PRODUCT SALES REPORT - " + Year.now().getValue());
        System.out.println();
        System.out.println("*".repeat(40));
    }

    //This method prints the total product sales.
    public void PrintTotalProductSales() {
        System.out.println("TOTAL PRODUCT SALES: " + product.GetTotalProductsSold());
    }

    //This method prints the average product sales.
    public void PrintAverageProductSales() {
        DecimalFormat format = new DecimalFormat("0.##");
        System.out.println("AVERAGE PRODUCT SALES: "
                + format.format(product.GetAverageProductSold()));
    }

    //This method prints the most popular product.
    public void PrintMostPopularProduct() {
        System.out.println("MOST POPULAR PRODUCT: " + product.GetMostPopularProduct());
    }
}
