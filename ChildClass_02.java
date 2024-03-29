
public class ChildClass_02 extends ParentClass_01 {
	
	String clg;
	String city;
	
	ChildClass_02(){
		super();
	}
	
	ChildClass_02( int rollNo){
		
		super(rollNo);
		
	}
	
	ChildClass_02(String name, String branch, String clg, String city){
		
		super(name, branch);
		this.clg = clg;
		this.city = city;
		
		System.out.println("College : " + this.clg);
	}

}

class CallSuperFromChild{
	public static void main(String[] args) {
		
		new ChildClass_02();

		new ChildClass_02(317);
		
		new ChildClass_02("Tejaswini", "BEIT", "SNDCOE","Babhulgoan" );

	}

}
