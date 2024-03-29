import java.util.Arrays;
import java.util.Iterator;



public class ArrayList {

	public static void main(String[] args) {
		
		java.util.ArrayList<String> jala = new java.util.ArrayList<>(
				Arrays.asList("zero", "one", "two", "three", "four", "five"));
		
		 System.out.println("\njala = " + jala);
		 jala.add("six");
	        jala.add("seven");
	        jala.add("eight");
	        jala.add("nine");
	        System.out.println("\nAfter adding elements :");
	        System.out.println("jala = " + jala);
	        
	        Iterator<String> itr = jala.iterator();
	        
	        System.out.println("\nIterating through the ArrayList : ");
	        
	        while(itr.hasNext()) {
	        	
	        	System.out.print(itr.next() + " ");
	        	
	        }
	        System.out.println(" ");
	        
	        jala.add(1, "AtIndex1");
	        System.out.println("\nAfter adding an element at index 1 :");
	        System.out.println("jala = " + jala);

	        jala.remove(1);
	        System.out.println("\nAfter removing an element at index 1 :");
	        System.out.println("jala = " + jala);
	        
	        jala.set(1, "ONE");
	        System.out.println("\nAfter updating the element at index 1 :");
	        System.out.println("jala = " + jala);

	        System.out.println("\nThe element is present at index :");
	        System.out.println(jala.indexOf("three"));
	        
	        System.out.println("\nThe element at index 3 :");
	        System.out.println(jala.get(3));
	        
	        System.out.println("\nSize of the ArrayList : ");
	        System.out.println(jala.size());
	        
	        System.out.println("\n'two' is present in the ArrayList : ");
	        System.out.println(jala.contains("two"));
	        
	        System.out.println("\nAfter removing all elements of the ArrayList :");
	        jala.clear();
	        System.out.println("jala = " + jala);



	}

}
