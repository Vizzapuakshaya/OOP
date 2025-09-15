
/*Q1. A transport management application needs to handle different types of vehicles in a uniform way. Define an interface Vehicle with methods to start the vehicle, stop it, and get its fuel type.
Implement two classes:
Car – represents a petrol-powered car.
ElectricBike – represents an electric bike.
In the main program, store both types of vehicles in an array of Vehicle references, then iterate through the array to start each vehicle, display its fuel type, and stop it.*/

package interface_4problems;

interface Vehicle {
 void start();
 void stop();
 String getFuelType();
}


class Car implements Vehicle {
 @Override
 public void start() {
     System.out.println("Car is starting...");
 }

 @Override
 public void stop() {
     System.out.println("Car is stopping...");
 }

 @Override
 public String getFuelType() {
     return "Petrol";
 }
}


class ElectricBike implements Vehicle {
 @Override
 public void start() {
     System.out.println("Electric Bike is starting...");
 }

 @Override
 public void stop() {
     System.out.println("Electric Bike is stopping...");
 }

 @Override
 public String getFuelType() {
     return "Electric";
 }
}


public class Interface1 {
 public static void main(String[] args) {
    
     Vehicle[] vehicles = new Vehicle[2];
     vehicles[0] = new Car();
     vehicles[1] = new ElectricBike();

  
     for (Vehicle v : vehicles) {
         v.start();
         System.out.println("Fuel Type: " + v.getFuelType());
         v.stop();
         System.out.println("---------------------------");
     }
 }
}




