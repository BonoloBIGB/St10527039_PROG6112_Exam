/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.mattresssales;

/**
 *
 * @author Student
 */
// Contract that every product sales class must follow 
public interface IProduct {
    
    // Returns the total number of products sold
    int GetTotalProductsSold();
    
    //Returns the average per product per month
    double GetAverageProductSold();
    
    //Returns the most popular product
    String GetMostPopularProduct();
}
