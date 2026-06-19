interface ATMService {
    void withdraw(double amount);
    void deposit(double amount);
    void checkBalance();
}
class DBBL implements ATMService {
    private double balance;
    public DBBL(double balance) {
        this.balance = balance;
    }
    @Override
    public void withdraw(double amount) {
        if (amount > balance) {
            System.out.println("Insufficient balance!");
        } else {
            balance -= amount;
            System.out.println("Withdraw Successful! Amount: " + amount);
        }
    }
  
    @Override
    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposit Successful! Amount: " + amount);
    }

    @Override
    public void checkBalance() {
        System.out.println("Current Balance: " + balance);
    }
}

public class Main20 {
    public static void main(String[] args) {
        DBBL acc = new DBBL(1000);

        acc.checkBalance();
        acc.deposit(500);
        acc.withdraw(800);
        acc.checkBalance();
    }
}
