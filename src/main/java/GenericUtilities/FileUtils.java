package GenericUtilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class FileUtils {
	public String readDataFromPropertyFile(String key) throws IOException {
		FileInputStream fis=new FileInputStream(iPathConstants.PROPERTYPATH);
		Properties p=new Properties();
		p.load(fis);
		String data=p.getProperty(key);
		return data;
	}
}
