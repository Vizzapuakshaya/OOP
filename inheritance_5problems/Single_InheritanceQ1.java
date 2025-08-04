package inheritance_5problems;

class Animal {
	    void eat() {
	        System.out.println("This animal eats food.");
	    }
	}


	class Lion extends Animal {
	    void roar() {
	        System.out.println("The lion roars loudly!");
	    }
	}

	// Main class to demonstrate the behavior
	public class Single_InheritanceQ1 {
	    public static void main(String[] args) {
	        Lion lion = new Lion();
	        lion.eat();   // Inherited method
	        lion.roar();  // Lion-specific method
	    }
	}



