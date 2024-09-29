import java.lang.System;
import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        int pin = 89;
        double balance = 10000;
        double addamount = 0;
        double takeamount = 0;
        String name;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your pin number last two digits only..");
        int password = sc.nextInt();
        if(pin==password){
            System.out.println("Enter your name ");
            name = sc.next();
            System.out.println("welcome "+" "+name);
            while(true){
                System.out.println("welcome to canara ATM..");
                System.out.println("1.check your balance..");
                System.out.println("2.add amount...");
                System.out.println("3.take amount....");
                System.out.println("4.take recipt..");
                System.out.println("5.exit..");
                System.out.println("Thank you for using this menu-driven..");
                int option;
                option = sc.nextInt();
                switch(option){
                    case 1:
                        System.out.println("Your balance is : "+balance);
                        break;
                    case 2:
                        System.out.println("How much amount did you want ADD your current balance");
                        addamount = sc.nextDouble();
                        System.out.println("Sucessfully credited....");
                        balance = addamount + balance;
                        break;
                    case 3:
                         System.out.println("How much amount did you want TAKE your current balance");
                         takeamount = sc.nextDouble();
                         if(balance<takeamount){
                             System.out.println("your balance is insufficient");
                             System.out.println("try less than your current balance ");
                             
                         }
                         else{
                             System.out.println("sucessfully Debited....");
                             balance = balance - takeamount;
                         }
                         break;
                    case 4:
                        System.out.println("WELCOME TO CANARA ATM");
                        System.out.println("===========================");
                        System.out.println("your current balance is : "+balance);
                        System.out.println("recently take amont is : "+takeamount);
                        System.out.println("recently add amount is : "+addamount);
                        System.out.println("============================");
                        System.out.println("THANK YOU");
                        break;
                    case 5:
                        System.out.println("NOW plz you can leave this ATM");
                        return;
                    
     
                    
                    
                        
                    
                }
                
            }
        }
        else{
            System.out.println("wrong pin number");
            System.out.println("plz check it");
        }
        
    }
}
