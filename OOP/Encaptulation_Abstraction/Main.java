package Encaptulation_Abstraction;

public class Main {
    public static void main(String[] args) {
        BankAccount account = new SavingsAccount(1000, 5);
        System.out.println("Opening Balance: "+((SavingsAccount) account).getBalance());
        account.deposit(35500);

        double bankBalance=((SavingsAccount) account).getBalance();
        System.out.println("Account balance is: "+bankBalance);
        account.withdraw(2500);
        System.out.println();

        System.out.println("Final Balance: ");
        
        // Encapsulation: Accessing balance safely via method
        System.out.println("Balance: $" + ((SavingsAccount) account).getBalance());
    }
}
