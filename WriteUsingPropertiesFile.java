import java.io.FileOutputStream;
import java.util.Properties;

public class WriteUsingPropertiesFile {

	public static void main(String[] args) {
		
		
		try {
			 Properties props = new Properties();
			 props.put("Name", "Tejaswini");
	            props.put("E.no", "101");
	            props.put("College", "SNDCOE RC");
	            
	            FileOutputStream outputStrem = new FileOutputStream("pf.txt");
	            //Storing the properties file
	            props.store(outputStrem, "This is a sample properties file");
	            System.out.println("Properties file created");


		}catch (Exception e) {
           
            e.printStackTrace();
        }
		
	}
}
