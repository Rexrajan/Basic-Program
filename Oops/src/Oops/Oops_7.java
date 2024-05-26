package Oops;

public class Oops_7 {
    public static void main(String[] args) {
        BankAccount bank = new BankAccount();
        bank.set_account("39595167804");
        bank.set_balance(34500d);
        System.out.println(bank.get_account()+"\n"+bank.get_balance());
    }
}
class BankAccount {
    private String account_no;
    private double balance;

    public void set_account(String A) {
        this.account_no = A;
    }

    public String get_account() {
        return account_no;
    }
    public void set_balance(double D){
        this.balance = D;
    }
    public double get_balance(){
        return balance;
    }
}