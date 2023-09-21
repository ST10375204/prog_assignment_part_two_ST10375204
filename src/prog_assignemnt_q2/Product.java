/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prog_assignemnt_q2;

/**
 *
 * @author deves
 */
public class Product {
  //parent  
    private String prodName;
    private int quantity;
    private double price;
    private double salesPrice;
    private int id;
    //getter and setter--------------------------
    public String getProdName() {
        return prodName;
    }

    public void setProdName(String prodName) {
        this.prodName = prodName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
        setSalesPrice(price);
    }
    
    public double getSalesPrice() {
        return salesPrice;
    }

    private void setSalesPrice(double salesPrice) {
        this.salesPrice=Math.ceil(price*1.15+price*0.2);
        //15% vat, 20% markup
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    //getter and setter-------------------------- 
    
}
