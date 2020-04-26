package telusko_serialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Properties;

public class PropertyFileDemo {
	public static void main(String[] args) throws Exception {
		Properties p = new Properties();
		
		/*
		 * 	OutputStream os = new FileOutputStream("dataCOnfig.properties");
		*	p.setProperty("name", "wilmir");
		*	p.setProperty("url","localhost:3306/mydb\n");
		*	p.setProperty("pass", "0000");
		*	p.store(os, null);
		 */
	
		InputStream is = new FileInputStream("dataCOnfig.properties");
		
		p.load(is);
		
		System.out.println(p.getProperty("uname"));
		System.out.println(p.getProperty("url"));
		System.out.println(p.getProperty("pass"));

		p.list(System.out);
	}
}
