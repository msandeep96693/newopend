package CommonUtils;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class ConfigProperty {
	
	public Properties configReader() {
		
		Properties prop = new Properties();
		File propfile = new File(System.getProperty("user.dir")+"//src//test//resources//ConfigFolder//Config.properties");
		System.out.println(propfile);
		
		try 
		{
			FileInputStream fis = new FileInputStream(propfile);
			prop.load(fis);
		}catch(Throwable e) 
		{
			e.printStackTrace();
		}
		
		return prop;
		
	}

}
