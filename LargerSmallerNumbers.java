
public class LargerSmallerNumbers {

	public static void main(String[] args) {

		int a = 5;
		int b = 10;
		
		int min = (a<b)?a:b;
		int max = (a>b)?a:b;
		System.out.println("Smaller Number is "+ min);
		System.out.println("Larger Number is "+ max);
		
		
		if (a > b) {
			System.out.println("Larger Number is "+ a);
		} else {
			System.out.println("Smaller Number is "+ a);
		}
		if(a<b) {
			System.out.println("Larger Number is "+ b);
		}else {
			System.out.println("Smaller Number is "+ b);
		}
	}

}
