
public class Parent_06 {
	
	void method1() {
		System.out.println("Used this() and super() in methods");
	}
	
	void method2() {
		this.method1();
	}
}

class child_06 extends Parent_06{
	void method3() {
		super.method2();
	}
} 

 class ThisSuperInMethods{
	public static void main(String[] args) {

		child_06 c = new child_06();
		c.method3();
		
	}

}
