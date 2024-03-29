import java.util.Scanner;

public class EvenAndOddNumbers {

	static void EvenNumbers(int n) {
		System.out.println("These are Even Numbers from 0 to  "+n);
		
		for(int i = 0; i<=n; i++) {
			
			if(i % 2 ==0) {
				System.out.print(i+ " ");
			}
			
		}
		
		System.out.println(" ");
	}
	
	static void OddNumbers(int n) {
		System.out.println("These are Odd Numbers from 1 to  "+n);
		
		for(int i = 1; i <= n; i++) {
			
			if(i % 2 != 0) {
				System.out.print(i+ " ");
			}
		}
	}
	
	public static void main(String[] args) {

		int num ;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter any Number : ");
		num =sc.nextInt();
		EvenNumbers(num);
		OddNumbers(num);
	}

}
