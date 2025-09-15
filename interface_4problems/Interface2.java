/* Q2. An e-commerce application supports multiple payment methods. To ensure flexibility, define an interface Payment with methods to process and refund transactions. Implement two classes:

CreditCardPayment – simulates processing and refunding via a credit card.

UPIPayment – simulates processing and refunding via UPI.

Write a program that creates an array of Payment references, processes payments, and issues refunds for each type of payment method.*/


package interface_4problems;

interface Payment {
 void processPayment(double amount);
 void refundPayment(double amount);
}


class CreditCardPayment implements Payment {
 @Override
 public void processPayment(double amount) {
     System.out.println("Processing credit card payment of ₹" + amount);
 }

 @Override
 public void refundPayment(double amount) {
     System.out.println("Refunding credit card payment of ₹" + amount);
 }
}


class UPIPayment implements Payment {
 @Override
 public void processPayment(double amount) {
     System.out.println("Processing UPI payment of ₹" + amount);
 }

 @Override
 public void refundPayment(double amount) {
     System.out.println("Refunding UPI payment of ₹" + amount);
 }
}

//Main class
public class Interface2 {
 public static void main(String[] args) {
     // Array of Payment references
     Payment[] payments = new Payment[2];
     payments[0] = new CreditCardPayment();
     payments[1] = new UPIPayment();

     double[] amounts = {2500.00, 1200.50}; 

     for (int i = 0; i < payments.length; i++) {
         payments[i].processPayment(amounts[i]);
         payments[i].refundPayment(amounts[i]);
         System.out.println("---------------------------");
     }
 }
}


