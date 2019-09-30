/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bankapp;

/**
 *
 * @author Liyabona Saki
 */
public class AccountsObject {
    
     private String accountHolder;
       private long accountNumber;
          private String accountType;
            private double balance1;
              private double balance2;
          
          //instantiation
          public AccountsObject(){
            this.accountHolder = "Liyabona Saki";
              this.accountType = "Student Account";
                this.accountNumber = 980719597;
                  this.balance1 = 100;
                    this.balance2 = 50;
          }
          
          
          
          
    //  O B J E C T S //
   // Ecapsulation : getters and setters
       
  // ACCOUNT NUMBER 
    //Getter
       public long getaccountNumber(){
            return accountNumber;
        }
        
         //Setter
            public void setaccountNumber(long accountNumber){
              this.accountNumber = accountNumber;  
            }
        
            
            
            
     //ACCOUNT HOLDER
         //Getter
            public String getaccountHolder(){
              return accountHolder;
              }
              
             //Setter
                public void setaccountHolder(String accountHolder){
                  this.accountHolder = accountHolder;
                 }
                
             
                
                
         // ACCOUNT TYPE
            //Getter
               public String getaccountType(){
                 return accountType;
                }
               //Setter
                  public void setaccountType(String accountType){
                    this.accountType = accountType;
                  }
                   
                 
                  
                  
          // BALANCE 1st OBJECT
               //Getter
                 public double getbalance1(){
                    return balance1;
                   }
                  //Setter
                     public void setbalance1(double balance1){
                       this.balance1 = balance1;
                        }
                                    
                     
                     
                     
               // BALANCE 2nd OBJECT
                    //Getter
                        public double getbalance2(){
                          return balance2;
                         }
                        //Setter
                            public void setbalance2(double balance2){
                              this.balance2 = balance2;
                           }
                            
                        

     // M E T H O D S //
      //Show method
         public void show(){
       
          System.out.println("Account Holder : "+accountHolder);
            System.out.println("Account Type : "+accountType);
              System.out.println("Account Number : "+accountNumber);
                System.out.println("\n1st Object balance : R"+balance1);
                  System.out.println("2nd Object balance : R"+balance2);
          }
    
       //Deposit method
        public void deposit(){
       // 1st Object
          System.out.println("\n1st Object");
           double deposit1 = 50; 
            System.out.println("The money deposited is " + deposit1);
              System.out.println("Current balance is "+ (deposit1 + balance1));  
         
                
                }
        
                //withdraw method
                //boolean should use instead of void
        
                  public boolean withdraw(){
                   
                  double withdrawal =(-this.balance2);
                  
                     if( withdrawal >= this.balance2 ){
                         System.out.println("Unsuccesfull");
                         return false;
                         
                     }else{
                         
                         System.out.println("succesfull");
                         return true;
                     } 
             
        
       }
    
}
