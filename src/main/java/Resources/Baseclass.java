package Resources;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Baseclass {
	public WebDriver Driver;
	public void initializeDriver() throws IOException {
		
//To read data.properties file
	FileInputStream fis = new FileInputStream("C:\\Users\\LENOVO\\eclipse-workspace\\MavenSelenium\\src\\main\\java\\Resources\\Data.properties");
	
//To access data.properties file
	Properties prop = new Properties();
	
//To load readed file
	prop.load(fis);
	String browsername = prop.getProperty("browser");
	
	if(browsername.equalsIgnoreCase("chrome")) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\LENOVO\\Desktop\\ChromeDriver\\chromedriver_win32\\chromedriver.exe");
		Driver = new ChromeDriver();
	}
	else if(browsername.equalsIgnoreCase("edge")) {
			//edge browsser launch code
		}
	else if(browsername.equalsIgnoreCase("firefox")) {
		//firefox broweser launch code
	}
	else {
		System.out.println("Other browser not compatible");
	}
		
	}
}
