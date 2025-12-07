import java.util.*;
public class Atm {
    public static void main(String[] args){
    Scanner s=new Scanner(System.in);
    int pin=123;
    int balance=5000;
    System.out.println("Enter the Pin");
    int up=s.nextInt();
    s.nextLine();
    if(up==pin){
        System.out.println("Login Successfully");
    }
    else{
        System.out.println("Invalid Pin");
    }
    while(true){
        System.out.println("What do you want to do with your Account");
        System.out.println("balance / withdraw / deposit / exit");
        String uc=s.nextLine();
        if(uc.equalsIgnoreCase("balance")){
            System.out.println("Your Account Balance: "+balance);
        }
        else if(uc.equalsIgnoreCase("withdraw")){
            System.out.println("Enter the Amount to withdraw");
            int wa=s.nextInt();
            s.nextLine();
            if(wa<balance){
                balance-=wa;
                System.out.println("Withdraw Successfully");
                System.out.println("Updated balance: "+balance);
            }
            else{
                System.out.println("Invalid");
            }
        }
        else if(uc.equalsIgnoreCase("deposit")){
            System.out.println("Enter the Amount to deposit");
            int da=s.nextInt();
            s.nextLine();
            balance+=da;
        }
        else if(uc.equalsIgnoreCase("exit")){
            System.out.println("exit...");
            break;
        }
    }       
    }
}
