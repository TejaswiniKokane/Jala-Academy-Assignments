
public class MultipleIfElseStatement {

	public static void main(String[] args) {

		int a = 10, b = 40, c = 20;
		
			if (a > b && a > c) {
	            System.out.println(a + " is the Largest Number");

	        }
	       
	        else if (b > a && b > c) {
	            System.out.println(b + " is the Largest Number");
	        }
	        
	        else {
	            System.out.println(c + " is the Largest Number");
	        }
			
		}
	}


