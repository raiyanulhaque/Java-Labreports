class BankAccount {
    private String accountHolder;
    private String accountNumber;
    private double balance;
    public void setAccountHolder(String accountHolder) {
        this.accountHolder = accountHolder;
    }
    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }
    public void setBalance(double balance) {
        this.balance = balance;
    }
  
    public String getAccountHolder() {
        return accountHolder;
    }
    public String getAccountNumber() {
        return accountNumber;
    }
    public double getBalance() {
        return balance;
    }
}
public class Main2 {
    public static void main(String[] args) {
        BankAccount b = new BankAccount();
        b.setAccountHolder("Raiyanul");
        b.setAccountNumber("ACC253048");
        b.setBalance(9940.00);

        System.out.println("Account Holder: " + b.getAccountHolder());
        System.out.println("Account Number: " + b.getAccountNumber());
        System.out.println("Balance: " + b.getBalance());
    }
}
