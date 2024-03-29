
public interface Jala_4 {

	void methodOne();
	
	
}
interface Jala_04{
	
	void methodTwo();
}

class TwoInterfaceOneMethod implements Jala_4, Jala_04{
	
	public void methodOne() {
		
		System.out.println("This is Method one");
	}
	
	public void methodTwo() {
		
		System.out.println("This is Method Two");
		
	}
	
	public static void main(String[] args) {
		
		TwoInterfaceOneMethod if4 = new TwoInterfaceOneMethod();
        
        if4.methodOne();
        if4.methodTwo();
		
	}
} 