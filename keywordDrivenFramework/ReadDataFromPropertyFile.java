package keywordDrivenFramework;

import java.io.FileInputStream;
import java.util.Properties;

public class ReadDataFromPropertyFile {
	

		public static void main(String[] args) throws Throwable {
			 FileInputStream fis = new FileInputStream("./data/config.properties");
			Properties prop = new Properties();
			prop.load(fis);
//			String value = prop.getProperty("browser");
			String value = prop.getProperty("browser", "Incorrect key");
			System.out.println(value);
	}
}
