package Encapsulation;

public class BankAccount {
    private long account_number = 395951678;
    private double balance = 33000d;
    public long getAccount_number(){
        return account_number;
    }
    public double getBalance(){
        return balance;
    }
    public void setValues(int account_number,double balance){
        this.account_number = account_number;
        this.balance = balance;
    }
}
