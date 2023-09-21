/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prog_assignemnt_q2;

import java.util.Scanner;

/**
 *
 * @author deves
 */
public class PROG_ASSIGNEMNT_Q2 {

    /**
     * @param args the command line arguments
     */
    public static  Scanner kb=new Scanner(System.in);//initializedfor all meths
    
    public static void main(String[] args) {
        // product management application

        Product prod=new Product();
        ClothingItem cloth=new ClothingItem();
        ElectronicItem elec=new ElectronicItem();
        boolean controller=true;
        int temp;

        while(controller==true){
            welcomeMsg();
            String choice=kb.next();
            boolean navi;
          
            switch(choice){
                case "1":
                    //add item
                    System.out.println("Enter the ID of the item");
                    prod.setId(intVerification(kb.next()));
                    
                    System.out.println("Enter the name of the item");
                    prod.setProdName(kb.next());
                    
                    System.out.println("Enter the quantity of the item");
                    prod.setQuantity(intVerification(kb.next()));
                    
                    System.out.println("Enter the price of each unit, as purchased"
                            + "from wholesaler");
                    prod.setPrice(doubleVerification(kb.next()));
                     
                    if(ValidatedDecision("Is the item an Electronic item (1) or"
                            + " is it a Clothing item (2)")){
                        elec.setId(prod.getId());
                        elec.setName(prod.getProdName());
                        elec.setQuantity(prod.getQuantity());
                        elec.setPrice(prod.getSalesPrice());
                        System.out.println("Enter the warranty period of the item"
                                + " in months");
                        elec.setWarrantyPeriod(intVerification(kb.next()));  
                        if(elec.addItem()){
                            System.out.println("Item succesfuly added to inventory");
                        }else{System.out.println("Item was unable to be captured:"
                                + " invalid ID");}  
                    }else{
                        cloth.setId(prod.getId());
                        cloth.setName(prod.getProdName());
                        cloth.setPrice(prod.getSalesPrice());
                        cloth.setQuantity(prod.getQuantity());
                        System.out.println("Enter the size of the items");
                        cloth.setSize(intVerification(kb.next()));                       
                        if(cloth.addItem()){
                            System.out.println("Item succesfuly added to inventory");
                        }else{System.out.println("Item was unable to be captured:"
                                + " invalid ID");}                       
                    }                 
                    break;//add case
                                       
                case "2":
                    //delete 
                    System.out.println("Enter the ID of the item you wish to delete");
                     temp=intVerification(kb.next());
                     if(cloth.deleteItem(temp)){
                         System.out.println("The item was delete succesfully");                    
                     }else{
                        if(elec.search(temp)){
                            System.out.println("The item was delete succesfully");
                        }else{System.out.println("The item was not found"
                                + ", delete unsuccessful");}
                     }                   
                    break;//delete case
                case "3":
                   //edit 
                    if (ValidatedDecision("Do you want to edit an item"
                            + " in the Clothing category (1) or Electronic category (2)")){
                        System.out.println("Enter ID of the item");
                        temp=intVerification(kb.next());
                        if(cloth.search(temp)){
                            if(ValidatedDecision("Enter (1) to edit stock\nEnter (2) to edit price")){
                                System.out.println("Enter the new quantity");
                                cloth.editStock(temp, intVerification(kb.next()));
                                System.out.println("Quantity in inventory has been changed");
                            }else{
                                System.out.println("Enter new price");
                                prod.setPrice(intVerification(kb.next()));
                                cloth.editPrice(temp,prod.getSalesPrice());
                                System.out.println("Price has been changed");
                            }
                            
                        }else{System.out.println("Invalid ID");}//makes certain item is there
                    }else{//electronic item below
                        System.out.println("Enter ID of the item");
                        temp=intVerification(kb.next());
                        if(elec.search(temp)){
                            if(ValidatedDecision("Enter (1) to edit stock\nEnter (2) to edit price")){
                                System.out.println("Enter the new quantity");
                                elec.editStock(temp, intVerification(kb.next()));
                                System.out.println("Quantity in inventory has been changed");
                            }else{
                                System.out.println("Enter new price");
                                prod.setPrice(intVerification(kb.next()));
                                elec.editPrice(temp,prod.getSalesPrice());
                                System.out.println("Price has been changed");
                            }
                            
                        }else{System.out.println("Invalid ID");}//makes certain item is there
                    }         
                    break;//edit case
                case "4":
                    //display 
                    cloth.displayItems();
                    elec.displayItems();
                    break;//display case
                case "5":System.out.println("Application closing...");
                    controller=false;
                    break;//quit case
                default:System.out.println("invalid");break;
            }//switch
        }//while
             
    }//main
    
    public static void welcomeMsg(){
        System.out.println("user friendly here");
    
    }//display
    public static int intVerification(String val){
        boolean valid=false;
        while (valid==false){
            try{
                if (Integer.parseInt(val)>-1) {
                    return Integer.parseInt(val);
                }              
            }catch(NumberFormatException e){System.out.println("Try again");val=kb.next();}
       }//while  
        return 0; //default return, unreachable
    }
    //makes sure user inputs int
    
    public static double doubleVerification(String val){ 
        boolean valid=false;
        //i do not know why this works, only like this
        while (valid==false){
            try{
                if (Double.parseDouble(val)>0) {
                    return Double.parseDouble(val);
                }              
            }catch(NumberFormatException e){System.out.println("Try again");val=kb.next();}
       }//while  
        return 0; //default return, unreachable
    }
    //makes sure user inputs double
    
    public static boolean ValidatedDecision(String message){
        boolean run=true;   
        String choice;
            while(run==true){   
                System.out.println(message);
                switch(choice=kb.next()){
                    case "1":return true;
                    case "2":return false;
                    default:System.out.println("invalid");break;
                }
            }      
    return true;//default unreachable
    }
    //makes sure user selects valid item
    
}//class
