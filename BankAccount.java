import java.util.Calendar;

/**
 * Lab 4
 * Description: this program contains a bank account class that will work with the provided
 * tester,it will show the balance, withdrawals, deposits, and account number
 * @author Gabriel Salinas-Carter
 * @author Erick Espinoza
 * @since 03/02/25
 */
public class BankAccount {

    /**
     * Declared instance Variiables to hold accountNumber, balance, and transactions
     */
    private int accountNumber;
    private double balance;
    private StringBuilder transactions;

    /**
     * Default Constructor initalizing account to 0
     */
    public BankAccount() {
        accountNumber =0;
        balance = 0;
        transactions = new StringBuilder();
        recordTransaction("Account created with balance of " + this.balance);
    }

    /**
     * Overloaded Constructor receives amount to initialize balance
     * @param balance
     */
    public BankAccount(double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.transactions = new StringBuilder();
        recordTransaction("Account created with balance of " + this.balance);
    }


    /**
     * Method to record deposited amount
     * @param amount
     */
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            recordTransaction("Deposited " + amount);
        }
        else {
            System.out.println("Deposit must be positive");
        }
    }

    /**
     * Method to record withdrawn amount
     * @param amount
     */
    public void withdraw(double amount) {
        if (amount > 0) {
            if (balance >= amount) {
                balance -= amount;
                System.out.println("Withdrew " + amount);
            } else {
                System.out.println("Insufficient funds");
            }
        } else
            System.out.println("Withdraw must be positive");
    }

    /**
     * Method to record transaction date and amount
     * @param transaction
     */
    private void recordTransaction(String transaction) {
        Calendar calendar = Calendar.getInstance();
        String time = String.format("%1$tF",calendar);
        transactions.append(time).append(" ").append(transaction).append("\n");

    }
}
