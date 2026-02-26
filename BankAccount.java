//Problem 1: Bank Account With Security Rules
//
//Create a BankAccount class with:
//
//Private fields:
//- accountNumber
//- balance
//- pin
//
//Rules:
//- No direct setter for balance
//- Deposit allowed only if amount > 0
//- Withdraw allowed only if:
//  * Correct PIN
//  * Sufficient balance
//  * Amount <= 25000 per transaction
//- After 3 wrong PIN attempts → account locked
//- Add a method: isAccountLocked()

import java.util.*;
public class BankAccount {
    private String accountNumber;
    private double balance;
    private int pin;
    private int wrongCounter;

    public BankAccount(String accountNumber, double balance,int pin){
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.pin = pin;
        this.wrongCounter = 0;
    }

    public boolean isAccountLocked(){
        if (this.wrongCounter>3){
            return true;
        }
        else {
            return false;
        }
    }

    public void deposit(double amount){
        if(isAccountLocked()){
            System.out.println("Account is Locked. Cannot deposit.");
        }
        else if(this.balance>0){
            System.out.println("Old balance: "+this.balance);
            System.out.println(amount+" Deposited.");
            this.balance+=amount;
            System.out.println("New balance: "+this.balance);
        }
    }

    public void withdraw(double amount, int enteredPin){
        if(enteredPin!=this.pin){
            System.out.println("Incorrect Pin.");
            wrongCounter++;
        }

        else if(isAccountLocked()){
            System.out.println("The Account is Locked. Cannot Withdraw");
        }

        else{
            this.balance -= amount;
            System.out.println("Withdrew: "+amount);
            System.out.println("The remaining balance is: "+this.balance);
        }
    }

    public static void main(String args[]){
        BankAccount ob = new BankAccount("10290222",50000.00,1234);
        Scanner sc = new Scanner(System.in);
        int ch;
        while(ob.wrongCounter<3){
            System.out.println("1.Deposit");
            System.out.println("2.Withdraw");
            System.out.println("3.Check Balance");
            System.out.println("4.Exit");
            ch = sc.nextInt();
            switch(ch){
                case 1:
                    System.out.println("Enter the amount to be deposited: ");
                    ob.deposit(sc.nextDouble());
                    break;
                case 2:
                    System.out.println("Enter the amount to be withdrawn: ");
                    double amount = sc.nextDouble();
                    System.out.println("Enter the account pin: ");
                    ob.withdraw(amount,sc.nextInt());
                    break;
                case 3:
                    System.out.println("Balance: "+ ob.balance);
                    break;
                case 4:
                    System.out.println("Exiting...");
                    System.exit(0);
                default:
                    System.out.println("Invalid Choice");
            }
        }
        System.out.println("Max Attempts Exceeded. \nExiting...");

    }


}
