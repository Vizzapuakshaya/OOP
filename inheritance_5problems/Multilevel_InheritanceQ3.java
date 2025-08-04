package inheritance_5problems;

	class Appliance {
	    void turnOn() {
	        System.out.println("Appliance is turned ON");
	    }

	    void turnOff() {
	        System.out.println("Appliance is turned OFF");
	    }
	}


	class Fan extends Appliance {
	    void rotate() {
	        System.out.println("Fan is rotating");
	    }
	}

	class CeilingFan extends Fan {
	    void setSpeed(int speed) {
	        System.out.println("Ceiling Fan speed set to " + speed);
	    }
	}

	
	public class Multilevel_InheritanceQ3 {
	    public static void main(String[] args) {
	        CeilingFan cf = new CeilingFan();
	        cf.turnOn();        
	        cf.rotate();         
	        cf.setSpeed(3);     
	        cf.turnOff();        
	    }
	}



