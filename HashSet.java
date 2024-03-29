import java.util.Iterator;
public class HashSet {
    public static void main(String[] args) {

        java.util.HashSet<String> jala = new java.util.HashSet<>();

        
        jala.add("zero");
        jala.add("one");
        jala.add("two");
        jala.add("three");
        jala.add("four");
        jala.add("five");
        jala.add("six");
        jala.add("seven");
        jala.add("eight");
        jala.add("nine");
        jala.add("ten");
        
        jala.add("nine");
        System.out.println("\nAfter adding elements to HashSet :");
        
        System.out.println("jala = " + jala);


        
        Iterator<String> itr = jala.iterator();
        System.out.println("\nIterating through the HashSet : ");
        while (itr.hasNext()) {
            System.out.print(itr.next() + " ");
        }
        System.out.println(" ");

        System.out.println("\nclone/copy of HashSet : ");
        System.out.println(jala.clone());

       
        jala.remove("zero");
        System.out.println("\nAfter removing element 'zero' :");
        System.out.println("jala = " + jala);

        
        System.out.println("\nChecking if the set is empty :");
        System.out.println(jala.isEmpty());


        
        System.out.println("\nSize of the HashSet : ");
        System.out.println(jala.size());

        
        System.out.println("\nElement 'one' is present in the HashSet : ");
        System.out.println(jala.contains("one")); //returns boolean value

        
        System.out.println("\nAfter removing all elements of the HashSet :");
        jala.clear();
        System.out.println("jala = " + jala);
    }
}