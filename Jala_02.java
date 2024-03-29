
public interface Jala_02 {

	void methodOne();
	
	void methodTwo();
}

class InterfaceTwoMethod implements Jala_02{
	
	public void methodOne() {
		
		System.out.println("First Method");
	}
	public void methodTwo() {
		
		System.out.println("Second Method");
	}
	
	 public static void main(String[] args) {
	        InterfaceTwoMethod if2 = new InterfaceTwoMethod();
	        //Calling the methods implemented
	        if2.methodOne();
	        if2.methodTwo();
	    }
	
}