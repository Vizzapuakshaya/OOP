/* Transportation Booking System
You are building a system for booking transportation.
Abstract class: TransportBooking
Abstract method calculateFare(distance)
Concrete method bookTicket()
Subclasses: BusBooking, TrainBooking, FlightBooking.
Question:
Which part of booking is common and which part varies per transport mode?
Why is it better to use an abstract class than an interface here?
What happens if one subclass does not implement calculateFare()?*/

package abstract_classes;

abstract class TransportBooking {
    protected int bookingId;
    protected String passengerName;

    public abstract double calculateFare(double distance);

    public void bookTicket(double distance) {
        double fare = calculateFare(distance);
        System.out.println("Booking ID: " + bookingId);
        System.out.println("Passenger: " + passengerName);
        System.out.println("Distance: " + distance + " km");
        System.out.println("Total Fare: Rs. " + fare);
        System.out.println("Ticket booked successfully!\n");
    }
}

class BusBooking extends TransportBooking {
    @Override
    public double calculateFare(double distance) {
        return 100 + (distance * 5);  // base fare + per km
    }
}

class TrainBooking extends TransportBooking {
    @Override
    public double calculateFare(double distance) {
        return 200 + (distance * 3);  // base + lower per km
    }
}

class FlightBooking extends TransportBooking {
    @Override
    public double calculateFare(double distance) {
        return 1000 + (distance * 10) + 500; // base + per km + airport fee
    }
}

public class Problem3{
    public static void main(String[] args) {
        TransportBooking bus = new BusBooking();
        bus.bookingId = 101;
        bus.passengerName = "Akshaya";
        bus.bookTicket(50);

        TransportBooking train = new TrainBooking();
        train.bookingId = 102;
        train.passengerName = "Ravi";
        train.bookTicket(200);

        TransportBooking flight = new FlightBooking();
        flight.bookingId = 103;
        flight.passengerName = "Priya";
        flight.bookTicket(800);
    }
}
