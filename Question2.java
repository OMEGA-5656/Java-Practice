//1. Create class Account:
//- accountNumber, balance
//- Static block to initialize bank name
//- IIB to print "Account instance initializing"
//- Constructor to set account details
//- Method withdraw(double amount)
class Account{
    static int accountNumber;
    static double balance;
    static{
        String bankName = "xyz";
    }
    {
        //IIB
        System.out.println("Account instance initializing");
    }
    Account(int accountNumber,double balance){
        this.accountNumber=accountNumber;
        this.balance=balance;
    }
    void withdraw(double amount){
        this.balance = balance-amount;
    }
}

//2. Create class SavingsAccount:
//- interestRate
//- Override withdraw():
//  - Prevent withdrawal if balance < 1000
//  - Print appropriate message

class SavingsAccount extends Account{
    double interestRate;
    SavingsAccount(int accountNumber,double balance){
        super(accountNumber,balance);
    }
    @Override
    void withdraw(double amount){
        if(Account.balance > 1000){
            System.out.println("Withdrawing: "+amount);
            Account.balance -= amount;
            System.out.println("Remaining Balance: "+Account.balance);
        }
    }
}

//3. In main:
//  Account a = new SavingsAccount(...);
//  a.withdraw(...);

public class Question2 {
    public static void main(String[] args){
        Account a = new SavingsAccount(1234,10000);
        a.withdraw(100);
    }
}
