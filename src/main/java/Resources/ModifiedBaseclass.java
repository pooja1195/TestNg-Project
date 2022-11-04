package Resources;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ModifiedBaseclass {
	public WebDriver Driver;
	public Properties prop;
	
	public void initializeDriver() throws IOException {

//change data.properties file (dynamic)path so that any user can operate this project in their system. Common path will remain same
	FileInputStream fis = new FileInputStream(System.getProperty("user.dir") + "\\src\\main\\java\\Resources\\Data.properties");
	prop = new Properties();
	prop.load(fis);
	String browsername = prop.getProperty("browser");
	
	if(browsername.equalsIgnoreCase("chrome")) {
//Chromedriver path & Chrome version can change in future, it may impact on whole project. So changing (System.set property.....)code
		WebDriverManager.chromedriver().setup();//to use current browser
//To use specific browser version :: WebDriverManager.chromedriver().browserVersion("18.0.1").setup();
		
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
	
	@BeforeMethod
	public void launchbrowser() throws IOException {
		initializeDriver();
		String site = prop.getProperty("url");
		Driver.get(site);
	}
	
}
