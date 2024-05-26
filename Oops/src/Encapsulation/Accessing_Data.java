package Encapsulation;

public class Accessing_Data {
    public static void main(String[] args) {
        BankAccount bank = new BankAccount();
        System.out.println("Reading the data "+"\nAccountnumber: "+bank.getAccount_number()+"\nBalance: "+bank.getBalance());
        System.out.println("Setting the new data");
        bank.setValues(33353234,12000d);
        System.out.println("New Accountnumber: "+bank.getAccount_number()+"\nNew Balance: "+bank.getBalance());
    }
}
