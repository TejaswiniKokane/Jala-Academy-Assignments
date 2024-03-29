
public interface Jala_01 {
	
	void oneMethod();
	
}

class InterfaceOneMethod implements Jala_01{
	
	public void oneMethod() {
		System.out.println("This is a method");
	}
	
	public static void main(String[] args) {
		
		InterfaceOneMethod if1 = new InterfaceOneMethod();
		
		if1.oneMethod();
		
	}
}
