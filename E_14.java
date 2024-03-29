import java.lang.reflect.Method;

public class E_14 {
	
	public void addition(int a, int b) {
		
		int c ;
		c = a + b;
		System.out.println(c);
		
	}
}
 class NoSuchMethod{

	public static void main(String[] args) {
		
		try {
			
			Class c = Class.forName("com.jala.exceptions.E_14");
			
			Method m = c.getDeclaredMethod("Substraction", int.class, int.class);
			
		}
		
		catch (NoSuchMethodException | ClassNotFoundException e) {
			e.printStackTrace();
			
		}

	}

}
