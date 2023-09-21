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
public class ElectronicItemIT {
    
    public ElectronicItemIT() {
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
    public void testGetPrice() {
        System.out.println("getPrice");
        ElectronicItem instance = new ElectronicItem();
        double expResult = 0.0;
        double result = instance.getPrice();
        assertEquals(expResult, result, 0.0);

    }

    @Test
    public void testSetPrice() {
        System.out.println("setPrice");
        double price = 0.0;
        ElectronicItem instance = new ElectronicItem();
        instance.setPrice(price);
 
    }

    @Test
    public void testGetName() {
        System.out.println("getName");
        ElectronicItem instance = new ElectronicItem();
        String expResult = null;
        String result = instance.getName();
        assertEquals(expResult, result);
      
    }

    @Test
    public void testSetName() {
        System.out.println("setName");
        String name = "";
        ElectronicItem instance = new ElectronicItem();
        instance.setName(name);

    }

    @Test
    public void testGetWarrantyPeriod() {
        System.out.println("getWarrantyPeriod");
        ElectronicItem instance = new ElectronicItem();
        int expResult = 0;
        int result = instance.getWarrantyPeriod();
        assertEquals(expResult, result);

    }

    @Test
    public void testSetWarrantyPeriod() {
        System.out.println("setWarrantyPeriod");
        int warrantyPeriod = 0;
        ElectronicItem instance = new ElectronicItem();
        instance.setWarrantyPeriod(warrantyPeriod);

    }

    @Test
    public void testGetQuantity() {
        System.out.println("getQuantity");
        ElectronicItem instance = new ElectronicItem();
        int expResult = 0;
        int result = instance.getQuantity();
        assertEquals(expResult, result);

    }

    @Test
    public void testSetQuantity() {
        System.out.println("setQuantity");
        int quantity = 0;
        ElectronicItem instance = new ElectronicItem();
        instance.setQuantity(quantity);

    }

    @Test
    public void testGetId() {
        System.out.println("getId");
        ElectronicItem instance = new ElectronicItem();
        int expResult = 0;
        int result = instance.getId();
        assertEquals(expResult, result);

    }

    @Test
    public void testSetId() {
        System.out.println("setId");
        int id = 0;
        ElectronicItem instance = new ElectronicItem();
        instance.setId(id);

    }

    @Test
    public void testAddItem() {
        System.out.println("addItem");
        ElectronicItem instance = new ElectronicItem();
        boolean expResult = true;
        boolean result = instance.addItem();
        assertEquals(expResult, result);

    }

    @Test
    public void testDisplayItems() {
        System.out.println("displayItems");
        ElectronicItem instance = new ElectronicItem();
        instance.displayItems();

    }

    @Test
    public void testDeleteItem() {
        System.out.println("deleteItem");
        int id = 0;
        ElectronicItem instance = new ElectronicItem();
        boolean expResult = false;
        boolean result = instance.deleteItem(id);
        assertEquals(expResult, result);
  
    }

    @Test
    public void testEditStock() {
        System.out.println("editStock");
        int id = 0;
        int val = 0;
        ElectronicItem instance = new ElectronicItem();
        instance.editStock(id, val);

    }

    @Test
    public void testEditPrice() {
        System.out.println("editPrice");
        int id = 0;
        double val = 0.0;
        ElectronicItem instance = new ElectronicItem();
        instance.editPrice(id, val);

    }

    @Test
    public void testSearch() {
        System.out.println("search");
        int id = 0;
        ElectronicItem instance = new ElectronicItem();
        boolean expResult = false;
        boolean result = instance.search(id);
        assertEquals(expResult, result);

    }
    
}
