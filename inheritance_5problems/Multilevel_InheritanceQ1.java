package inheritance_5problems;

	class Animals {
	    void eat() {
	        System.out.println("Animal is eating.");
	    }
	}

	
	class Dog extends Animals {
	    void bark() {
	        System.out.println("Dog is barking.");
	    }
	}

	
	class Puppy extends Dog {
	    void weep() {
	        System.out.println("Puppy is weeping.");
	    }
	}

	public class Multilevel_InheritanceQ1{
	    public static void main(String[] args) {
	        Puppy puppy = new Puppy();
	        puppy.eat();   
	        puppy.bark();  
	        puppy.weep();  
	    }
	}



