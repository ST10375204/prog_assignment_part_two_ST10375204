/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prog_assignemnt_q2;

import java.util.ArrayList;

/**
 *
 * @author deves
 */
public class ElectronicItem extends Product {
    private double price;
    private String name;
    private int warrantyPeriod;
    private int quantity;
    private int id;
    
    private final ArrayList<Integer>ids=new ArrayList<>();
    private final ArrayList<Double> prices=new ArrayList<>();
    private final ArrayList<String> names=new ArrayList<>();
    private final ArrayList<Integer> warranty=new ArrayList<>();
    private final ArrayList<Integer> stock=new ArrayList<>();
    //getter and setter-------------------------- 
   
    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public void setPrice(double price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWarrantyPeriod() {
        return warrantyPeriod;
    }

    public void setWarrantyPeriod(int warrantyPeriod) {
        this.warrantyPeriod = warrantyPeriod;
    }

    @Override
    public int getQuantity() {
        return quantity;
    }

    @Override
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public int getId() {
        return id;
    }

    @Override
    public void setId(int id) {
        this.id = id;
    }
    //getter and setter-------------------------- 
    
     public boolean addItem(){
        for (int i = 0; i < ids.size(); i++) {
            if (id==ids.get(i)){
                return false;
            }
        }     
        ids.add(id);
        names.add(name);
        warranty.add(warrantyPeriod);
        stock.add(quantity);
        prices.add(price);     
    //default, as if no match it should add    
    return true;}
    
   public void displayItems(){
       System.out.println("Displaying electronics\n================\n");
        for (int i = 0; i < names.size(); i++) {
            System.out.println("Name: "+names.get(i));
            System.out.println("Warranty: "+warranty.get(i));
            System.out.println("Quantity on stock: "+stock.get(i));
            System.out.println("Price: "+prices.get(i)+"\n================\n");
        }
   }
   
   public boolean deleteItem(int id){
       for (int i = 0; i < ids.size(); i++) {
          if(id==ids.get(i)){
              names.remove(i);
              ids.remove(i);
              prices.remove(i);
              stock.remove(i);
              warranty.remove(i);
              return true;
          } 
       }//for
       
   //default, and fail clause
   return false;}
   
   public void editStock(int id, int val){
       for (int i = 0; i < ids.size(); i++) {
           if(id==ids.get(i)){
               stock.add(i,val);
           }
       }
   }
   
   public void editPrice(int id,double val){
          for (int i = 0; i < ids.size(); i++) {
           if(id==ids.get(i)){
               prices.add(i,val);
           }
       }
   }
    public boolean search(int id){
          for (int i = 0; i < ids.size(); i++) {
           if(id==ids.get(i)){
               System.out.println("ID: "+ids.get(i)+
                       "\nProduct name: "+names.get(i)+
                       "\nQuantity: "+stock.get(i)+
                       "\nSize: "+warranty.get(i)+
                       "\nUnit price: "+prices.get(i));
               return true;
           }
       }
    return false;}
    
}
