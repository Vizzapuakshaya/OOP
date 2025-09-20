/*A bank has different types of accounts. Abstract class: BankAccount Fields: accountNumber,
 *  balance Abstract method calculateInterest() Concrete methods: deposit(), withdraw() Subclasses: SavingsAccount, CurrentAccount.
 *  Question: Why is calculateInterest() abstract? What is the advantage of having deposit() and withdraw() as concrete methods in the abstract class?
 *   Can you make balance private in BankAccount and still let subclasses use it? How?*/

package abstract_classes;

//Abstract class
abstract class BankAccount {
 private String accountNumber;
 private double balance;

 // Constructor
 public BankAccount(String accountNumber, double balance) {
     this.accountNumber = accountNumber;
     this.balance = balance;
 }

 // Getter for account number
 public String getAccountNumber() {
     return accountNumber;
 }

 // Protected access to balance for subclasses
 protected double getBalance() {
     return balance;
 }

 protected void setBalance(double balance) {
     this.balance = balance;
 }

 // Concrete methods
 public void deposit(double amount) {
     if (amount > 0) {
         balance += amount;
         System.out.println(amount + " deposited. New balance: " + balance);
     } else {
         System.out.println("Invalid deposit amount.");
     }
 }

 public void withdraw(double amount) {
     if (amount > 0 && balance >= amount) {
         balance -= amount;
         System.out.println(amount + " withdrawn. New balance: " + balance);
     } else {
         System.out.println("Insufficient balance or invalid amount.");
     }
 }

 // Abstract method (must be implemented by subclasses)
 public abstract void calculateInterest();
}

//Subclass: Savings Account
class SavingsAccount extends BankAccount {
 private double interestRate; // e.g., 4% yearly

 public SavingsAccount(String accountNumber, double balance, double interestRate) {
     super(accountNumber, balance);
     this.interestRate = interestRate;
 }

 @Override
 public void calculateInterest() {
     double interest = getBalance() * (interestRate / 100);
     setBalance(getBalance() + interest);
     System.out.println("Interest of " + interest + " added. New balance: " + getBalance());
 }
}

//Subclass: Current Account
class CurrentAccount extends BankAccount {
 public CurrentAccount(String accountNumber, double balance) {
     super(accountNumber, balance);
 }

 @Override
 public void calculateInterest() {
     // Current accounts usually don't earn interest
     System.out.println("No interest for Current Account.");
 }
}

//Test class
public class Problem4 {
 public static void main(String[] args) {
     // Create Savings Account
     SavingsAccount savings = new SavingsAccount("S001", 1000, 4.0);
     savings.deposit(500);
     savings.withdraw(200);
     savings.calculateInterest();

     System.out.println();

     // Create Current Account
     CurrentAccount current = new CurrentAccount("C001", 2000);
     current.deposit(1000);
     current.withdraw(500);
     current.calculateInterest();
 }
}
