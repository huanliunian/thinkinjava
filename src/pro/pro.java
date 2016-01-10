package pro;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Enumeration;
import java.util.Properties;

public class pro {
	
	public static void main(String[] args) throws FileNotFoundException, IOException {
		
		Properties properties = new Properties();
		properties.load(new FileInputStream("1.properties"));
		Enumeration e = properties.propertyNames();
		while(e.hasMoreElements()){
			String s = (String) e.nextElement();
			System.out.println(s+":"+properties.getProperty((s)));
		}
		properties.clear();
	}
	

}
