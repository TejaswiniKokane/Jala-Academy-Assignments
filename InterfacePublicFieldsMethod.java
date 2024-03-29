
public interface InterfacePublicFieldsMethod {

	int num = 111;
	
	public void myMethod();
}

class Jala_08 implements InterfacePublicFieldsMethod{
	
	public void myMethod() {
		
		System.out.println("This is a method");
	}
	
	public static void main(String[] args) {
		
		Jala_08 j = new Jala_08();
		
		System.out.println(num);
		j.myMethod();
	}
}
