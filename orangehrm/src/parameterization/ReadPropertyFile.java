package parameterization;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadPropertyFile {

	public static void main(String args[]) throws IOException {

		File file = new File("..\\orangehrm\\resources\\config.properties");
		FileInputStream fis = new FileInputStream(file);

		Properties prop = new Properties();

		prop.load(fis);

		System.out.println(prop.getProperty("browserName"));
		System.out.println(prop.getProperty("url"));

	}
}
