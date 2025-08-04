package inheritance_5problems;

	class Vehicle {
	    void move() {
	        System.out.println("The vehicle is moving.");
	    }
	}

	
	class Car extends Vehicle {
	    void fuelType() {
	        System.out.println("This car runs on petrol.");
	    }
	}

	public class Single_InheritanceQ2 {
	    public static void main(String[] args) {
	        Car car = new Car();
	        car.move();      
	        car.fuelType();  
	    }
	}

	


