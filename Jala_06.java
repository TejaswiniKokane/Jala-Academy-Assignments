
public interface Jala_06 {

	default void defaultMethod() {
		
		 System.out.println("This is a default method");
	}
	
	class InterfaceDefaultMethod implements Jala_06 {
		
	    public static void main(String[] args) {
	        
	        InterfaceDefaultMethod if6 = new InterfaceDefaultMethod();
	        
	        if6.defaultMethod();
	    }
	}
}
