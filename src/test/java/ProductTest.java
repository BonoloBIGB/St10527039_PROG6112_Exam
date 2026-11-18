/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */

import com.mycompany.mattresssales.Product;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 *
 * @author Student
 */

// Unit tests for the Product class 
public class ProductTest {
    
    // Creates a Product with known sales data to use in each test
     private Product createProduct() {
        String[] names = {"Cozy Nights Monarch", "Restonic Barbados", "Sealy Phuket"};
        int[][] sales = {
            {25, 18, 20},
            {15, 10, 12},
            {18, 15, 20}
        };
        return new Product(names, sales);
    }

    @Test
    // Verifies GetTotalProductsSold returns 153 for the test data 
    public void GetTotalProductSales_WithValidData_ReturnsCorrectValue() {
        Product product = createProduct();

        int actual = product.GetTotalProductsSold();

        assertEquals(153, actual);
    }

    @Test
    // Verifies GetAverageProductSold returns 17.0 for the test data
    public void GetAverageSales_WithValidData_ReturnsCorrectValue() {
        Product product = createProduct();

        double actual = product.GetAverageProductSold();

        assertEquals(17.0, actual, 0.001);
    }
}