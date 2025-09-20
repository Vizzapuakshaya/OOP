/*You are designing a system for a food delivery app (like Zomato or Swiggy).
Create an abstract class FoodOrder with:
Abstract method calculateTotal()
Concrete method generateBill() that prints the bill.
Subclasses: RestaurantOrder (ordered from a restaurant) and CloudKitchenOrder (from a cloud kitchen).
Question:
Which methods should be abstract and why?
How will you handle the fact that both orders calculate the bill differently?
What common features will stay in the abstract class?*/

package abstract_classes;

abstract class FoodOrder {
    protected int orderId;
    protected String customerName;
    protected double total;

    public abstract double calculateTotal();

    public void generateBill() {
        total = calculateTotal(); // Polymorphic call
        System.out.println("Order ID: " + orderId);
        System.out.println("Customer: " + customerName);
        System.out.println("Total Amount: Rs. " + total);
    }
}

class RestaurantOrder extends FoodOrder {
    private double itemPrice;
    private double serviceCharge = 50;
    private double gst = 0.05;

    RestaurantOrder(int id, String name, double price) {
        this.orderId = id;
        this.customerName = name;
        this.itemPrice = price;
    }

    @Override
    public double calculateTotal() {
        return itemPrice + serviceCharge + (itemPrice * gst);
    }
}

class CloudKitchenOrder extends FoodOrder {
    private double itemPrice;
    private double packagingFee = 30;
    private double commission = 0.10;

    CloudKitchenOrder(int id, String name, double price) {
        this.orderId = id;
        this.customerName = name;
        this.itemPrice = price;
    }

    @Override
    public double calculateTotal() {
        return itemPrice + packagingFee + (itemPrice * commission);
    }
}

public class Problem1 {
    public static void main(String[] args) {
        FoodOrder order1 = new RestaurantOrder(101, "Akshaya", 500);
        FoodOrder order2 = new CloudKitchenOrder(102, "Ravi", 400);

        order1.generateBill();
        order2.generateBill();
    }
}
