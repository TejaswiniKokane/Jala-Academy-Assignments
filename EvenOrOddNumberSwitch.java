import java.util.Scanner;

public class EvenOrOddNumberSwitch {

	
	public static void main(String[] args) {

		int n;
		System.out.print("Enter a number : ");
		
		n = new Scanner(System.in).nextInt();
		
		switch (n % 2) {
		
		case 0:
			System.out.println(n + " is an Even Number ");
			break;
			
		case 1:
			System.out.println(n + " is a Odd Number ");
			break;
		}
	}

}
