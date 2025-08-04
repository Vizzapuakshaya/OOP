package inheritance_5problems;

	class Appliance {
	    void turnOn() {
	        System.out.println("Appliance is turned ON");
	    }

	    void turnOff() {
	        System.out.println("Appliance is turned OFF");
	    }
	}

	// First derived class
	class Fan extends Appliance {
	    void rotate() {
	        System.out.println("Fan is rotating");
	    }
	}

	// Second derived class
	class CeilingFan extends Fan {
	    void setSpeed(int speed) {
	        System.out.println("Ceiling Fan speed set to " + speed);
	    }
	}

	// Main class to test
	public class Multilevel_InheritanceQ3 {
	    public static void main(String[] args) {
	        CeilingFan cf = new CeilingFan();
	        cf.turnOn();         // From Appliance
	        cf.rotate();         // From Fan
	        cf.setSpeed(3);      // From CeilingFan
	        cf.turnOff();        // From Appliance
	    }
	}



