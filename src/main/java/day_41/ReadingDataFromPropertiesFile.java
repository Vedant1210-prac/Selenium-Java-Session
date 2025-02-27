package day_41;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Properties;
import java.util.Set;

public class ReadingDataFromPropertiesFile {

	public static void main(String[] args) throws IOException {


		//Reading the file
		FileInputStream file = new FileInputStream(System.getProperty("user.dir")+"\\testdata\\config.properties");
		
		//Loading properties file
		Properties properObject = new Properties();
		properObject.load(file);
		
		//Reading the data from property file
		
		String url = properObject.getProperty("appurl");
		String username = properObject.getProperty("username");
		String password = properObject.getProperty("password");
		
		System.out.println(url + " " +username+ " " +password);
		
		
		//Read all the keys from file
		
		Set<String> keys = properObject.stringPropertyNames();
	List<String> keyList = new ArrayList(keys);
		System.out.println(keyList.get(1));
		System.out.println(keys);
		
		//Read all the data from property file
		
		Collection<Object> object = properObject.values();
		System.out.println(object);
		
		
		
		
		
		
	}

}
