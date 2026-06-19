class BankAccount { 
    String accountNumber;     
    String accountHolderName;     
    double balance; 
    static String bankName = "Islami Bank";  
    BankAccount(String accNo, String holderName, double bal) {        
         accountNumber = accNo;         
         accountHolderName = holderName; 
         balance = bal; 
    }  
    void displayAccount() { 
        System.out.println("Account Number: " + accountNumber); 
        System.out.println("Account Holder: " + accountHolderName); 
        System.out.println("Balance: $" + balance); 
        System.out.println(); 
    } 
    static void showBankName() { 
        System.out.println("Bank Name: " + bankName); 
    } 
    public static void main(String[] args) { 
        BankAccount acc1 = new BankAccount("ACC1001", "Tom", 5000); 
        BankAccount acc2 = new BankAccount("ACC1002", "Raiyanul", 7500); 
        BankAccount.showBankName();        
         System.out.println();        
        acc1.displayAccount();        
        acc2.displayAccount(); 
    } 
} 
