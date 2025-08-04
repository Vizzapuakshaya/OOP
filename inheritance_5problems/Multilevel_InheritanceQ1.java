package inheritance_5problems;

	class Animals {
	    void eat() {
	        System.out.println("Animal is eating.");
	    }
	}

	// Derived class: Dog extends Animal
	class Dog extends Animals {
	    void bark() {
	        System.out.println("Dog is barking.");
	    }
	}

	// Derived class: Puppy extends Dog
	class Puppy extends Dog {
	    void weep() {
	        System.out.println("Puppy is weeping.");
	    }
	}

	// Main class to demonstrate multilevel inheritance
	public class Multilevel_InheritanceQ1{
	    public static void main(String[] args) {
	        Puppy puppy = new Puppy();
	        puppy.eat();   // inherited from Animal
	        puppy.bark();  // inherited from Dog
	        puppy.weep();  // defined in Puppy
	    }
	}



