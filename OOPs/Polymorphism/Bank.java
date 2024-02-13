package OOPs.Polymorphism;

class Account{
    double sAmount = 84000.00;
    Account(){
        System.out.println( "Default constructor called : Account" ); 
    }

    void withrawal(){
        System.out.println("Withdraw money from account");
    }
    void deposit(){
        System.out.println("Deposit money to your account");
    }
}
class SavingAccount extends Account{
    double sAmount;
    SavingAccount(){
        System.out.println( "Constructor called : SavingAccount" ); 
    }

    @Override
    void withrawal() {
        System.out.println("Withdraw money from saving account");
    }
    void deposit(double amount){
        System.out.println("Deposit money to your saving account");
        // this.sAmount = this.sAmount  + amount;
        this.sAmount = super.sAmount  + amount;
        System.out.println(" CurrentBalance : " + this.sAmount);
    }
}

class CurrentAccount extends Account{
    double sAmount;
    CurrentAccount(){
        System.out.println("Constructor Called : CurrentAccount");
    }
    @Override
    void withrawal(){
        System.out.println("Current Account does not support withdrawal.");
    }
}
public class Bank {
    public static void main(String[] args) {
        SavingAccount sa = new SavingAccount();
        sa.deposit();
        sa.deposit(2000);
    }
}
