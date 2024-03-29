public class NumberFormat {
    public static void main(String[] args) {

        String str = "111ABC";
        try {
           
            int x = Integer.parseInt(str);
            int y = Integer.valueOf(str);
        } catch (NumberFormatException e) {
            System.err.println("NumberFormatException caught!");
            
            e.printStackTrace();
        }
    }
}