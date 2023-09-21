/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prog_assignemnt_q2;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author deves
 */
public class ProductIT {
    
    public ProductIT() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    @Test
    public void testGetProdName() {
        System.out.println("getProdName");
        Product instance = new Product();
        String expResult = null;
        String result = instance.getProdName();
        assertEquals(expResult, result);
    }

    @Test
    public void testSetProdName() {
        System.out.println("setProdName");
        String prodName = "";
        Product instance = new Product();
        instance.setProdName(prodName);
    }

    @Test
    public void testGetPrice() {
        System.out.println("getPrice");
        Product instance = new Product();
        double expResult = 0.0;
        double result = instance.getPrice();
        assertEquals(expResult, result, 0.0);
    }

    @Test
    public void testSetPrice() {
        System.out.println("setPrice");
        double price = 24.0;
        Product instance = new Product();
        instance.setPrice(price);
     
    }

    @Test
    public void testGetSalesPrice() {
        System.out.println("getSalesPrice");
        Product instance = new Product();
        double expResult = 0.0;
        double result = instance.getSalesPrice();
        assertEquals(expResult, result, 0.0);
   
    }

    @Test
    public void testGetQuantity() {
        System.out.println("getQuantity");
        Product instance = new Product();
        int expResult = 0;
        int result = instance.getQuantity();
        assertEquals(expResult, result);
    
    }

    @Test
    public void testSetQuantity() {
        System.out.println("setQuantity");
        int quantity = 0;
        Product instance = new Product();
        instance.setQuantity(quantity);
 
    }

    @Test
    public void testGetId() {
        System.out.println("getId");
        Product instance = new Product();
        int expResult = 0;
        int result = instance.getId();
        assertEquals(expResult, result);

    }

    @Test
    public void testSetId() {
        System.out.println("setId");
        int id = 0;
        Product instance = new Product();
        instance.setId(id);
    }
    
}
