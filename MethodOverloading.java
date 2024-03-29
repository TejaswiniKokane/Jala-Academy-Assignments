
public class MethodOverloading {
	
	int num1;
    int num2;
    int rollNo;
    String name;
    
    void method1(int num1) {
    	
    	this.num1 = num1;
    	
    	System.out.println("1.First number : " + num1);
    	
    }

    void method1(int num1, int num2) {
    	
    	this.num1 = num1;
    	this.num2 = num2;
    	
    	System.out.println("1.Sum of two numbers : " + (num1 + num2));
    }
    
    void method2(int rollNo) {
    	this.rollNo = rollNo;
    	
    	System.out.println("2.Roll number : " + rollNo);
    	
    }
    
    void method2(int rollNo, String Name) {
    	this.rollNo = rollNo;
    	this.name = name;
    	
    	System.out.println("2.Roll number : " + rollNo + " ; " + "Name : " + name);
    	
    }
    
    void method4(int rollNo) {
        this.rollNo = rollNo;  
        System.out.println("4.Roll number : " + rollNo);
    }
    
    void method4(String name) {
        this.name = name;  
        System.out.println("4.Name : " + name);
    }

	public static void main(String[] args) {
		
		MethodOverloading mo = new MethodOverloading();
		
		mo.method1(0);
		mo.method1(0, 0);
		
		mo.method2(0);
		mo.method2(0, "Sharan");
		
		mo.method4(0);
		mo.method4("Sharan");
		

	}

}
