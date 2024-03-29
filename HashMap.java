
public class HashMap {

	public static void main(String[] args) {
		
		java.util.HashMap<Integer, String> jala = new java.util.HashMap<>();
		
		jala.put(1, "Tejaswini");
		jala.put(2, "Rohit");
        jala.put(3, "Leo");
        jala.put(4, "Keerthana");
        jala.put(5, "Aditya");
        jala.put(6, "Manoj");
        jala.put(7, "Mahideep");
        jala.put(8, "Prapul");
        jala.put(9, "Dheeraj");
        jala.put(10, "Rahul");
        System.out.println("\nkey-value pairs of the Student ID and Name : ");
        System.out.println("jala = " + jala);
        
        System.out.println("\nName of the Student with ID no = 6 :");
        System.out.println(jala.get(6));

        
        System.out.println("\nclone/copy of HashMap jala : ");
        System.out.println(jala.clone());
        
        System.out.println("\nID No = 3 is in the Map : ");
        System.out.println(jala.containsKey(3));
        
        System.out.println("\nStudent Name = 'Sharan' is in the map :");
        System.out.println(jala.containsValue("Tejaswini"));
        
        System.out.println("\nChecking if the map is empty :");
        System.out.println(jala.isEmpty());
        
        System.out.println("\nThe size of the Map is :");
        System.out.println(jala.size());
        
        System.out.println("\nAll ID No of the students :");
        System.out.println(jala.keySet());
        
        System.out.println("\nRemoved ID no = 2 ,Student name = 'Rohit' : ");
        jala.remove(2, "Rohit");
        System.out.println(jala);

        System.out.println("\nCopied all the elements of the jala to icfai :");

        java.util.HashMap<Integer, String> icfai = new java.util.HashMap<>();

        icfai.putAll(jala);
        System.out.println("icfai = " + icfai);
    

	}

}
