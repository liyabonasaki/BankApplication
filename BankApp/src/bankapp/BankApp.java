/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package bankapp;
import java.util.*;
/**
 * @author Liyabona Saki
 * Version 10
 * Group D
 * StNo: 217120830
 */


// Creating the List of 5 bank accounts
 public class BankApp {
  String AccountHolder;
    String AccountType;
      long AccountNumber;
      
        BankApp(long AccountNumber, String AccountHolder, String AccountType){
            
           this.AccountHolder = AccountHolder;
             this.AccountNumber = AccountNumber;
                 this.AccountType = AccountType;
        }
    
    // Using the to string method to treat our objects as string
     @Override
        public String toString(){
            return " AccounHolder : " + AccountHolder + " \tAccountType : " + AccountType + "\t AccountNumber : " + AccountNumber;
        }
        
           
    /**
     * @param args the command line arguments
     */
     static Scanner key = new Scanner (System.in);
       public static void main(String[] args) {
        // TODO code application logic here
           BankApp B1 = new  BankApp(5425669," Mr Saki"," Check Account");
           BankApp B2 = new  BankApp(5682657," Mrs Saki"," Credit Account");
           BankApp B3 = new  BankApp(5556988," Mrs Nduku "," Debit Account");
           BankApp B4 = new  BankApp(9698789," Mr Mphahleni"," Student Account");
           BankApp B5 = new  BankApp(69857452," Mr L Saki"," Fixed Account");
                        
           try{
               
               //=================================================================================================// 
               
               AccountsObject O = new AccountsObject();
               
               // Calling my methods from the accountsobject class
               
               System.out.println("\n==========================================="); 
        
                 //show method
                     System.out.println("\nS H O W - M E T H O D "); 
                     O.show();
                     System.out.println("==========================================="); 
                      
                      //deposit method
                        System.out.println("\nD E P O S I T - M E T H O D "); 
                         O.deposit();
                         System.out.println("==========================================="); 
                          
        
                    //withdraw method
                    System.out.println("\nW I T H D R A W A L - M E T H O D "); 
                    
                   System.out.println("Please enter the money you want to withdraw ");
                   double withdraw;
                   withdraw = key.nextDouble();
                   O.withdraw();    //Calling our boolean withdrawal method
            //=================================================================================================//               
                   
           /*
           Create an array of five BankApp objects. Populate the array with your own values. Use the toString()
            to display every object on the array.
                 
                */
                   
                   System.out.println("\n==========================================="); 
                   
                   // calling our toString method
                   System.out.println("Five Bank Accounts \n");
                         System.out.println(B1);
                         System.out.println(B2);
                         System.out.println(B3);
                         System.out.println(B4);
                         System.out.println(B5);

           
           }catch(Exception e){
                       //throws an exception if anything fails when running the app.
                          System.out.println("Failed ,Sorry something went wrong");
               
        }
 
     }

}
 