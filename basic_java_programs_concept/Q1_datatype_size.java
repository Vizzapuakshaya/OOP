package basic_java_programs_concept;

public class Q1_datatype_size {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  byte b = 10;
	        short s = 100;
	        int i = 1000;
	        long l = 10000L;
	        float f = 12.34f;
	        double d = 123.456;
	        char c = 'A';
	        boolean bool = true;

	        System.out.println("byte: " + b + " (Size: " + Byte.BYTES + " bytes)");
	        System.out.println("short: " + s + " (Size: " + Short.BYTES + " bytes)");
	        System.out.println("int: " + i + " (Size: " + Integer.BYTES + " bytes)");
	        System.out.println("long: " + l + " (Size: " + Long.BYTES + " bytes)");
	        System.out.println("float: " + f + " (Size: " + Float.BYTES + " bytes)");
	        System.out.println("double: " + d + " (Size: " + Double.BYTES + " bytes)");
	        System.out.println("char: " + c + " (Size: " + Character.BYTES + " bytes)");
	        System.out.println("boolean: " + bool + " (Size: " + "1 bit (JVM dependent))");
	
	}

}
