public class StringIndexOutOfBonds {
    public static void main(String[] args) {

        String str = "Tejaswini";
        
        try {
        	char charAtNegativeIndex = str.charAt(-1);
        	char charAtLengthIndex = 	str.charAt(11);	
        }
        
        catch(StringIndexOutOfBoundsException e) {
        	System.err.println("StringIndexOutOfBoundsException caught");
        	e.printStackTrace();
        	
        }
    }
}