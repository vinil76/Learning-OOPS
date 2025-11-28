public class BankAccount {

    private final String accountNumber;
    private double balance;

    public BankAccount(){
        this.accountNumber = null;
        this.balance = 0.0;
    }

    public BankAccount(String accountNumber,double balance){
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public void deposit(double amount){
        if(amount > 0){
            balance += amount;
        }else{
            System.out.println("Balance can't be negative");
        }
    }

    public void withdraw(double amount){
        if(amount <= balance){
            balance -= amount;
        }else{
            System.out.println("Insufficient funds");
        }

    }

    public void displayDetails(){
        System.out.println("Account Number : "+this.accountNumber);
        System.out.println("Balance : "+ String.format("%.2f", this.balance));
    }
}
