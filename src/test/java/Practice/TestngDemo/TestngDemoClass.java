package Practice.TestngDemo;



import java.util.logging.Logger;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.w3c.dom.DOMConfiguration;

import io.github.bonigarcia.wdm.WebDriverManager;
import net.bytebuddy.implementation.FieldAccessor.PropertyConfigurable;

public class TestngDemoClass {
	
	@Test
	public void test()
	{
		Logger log=Logger.getLogger("TestngDemoClass");
		
		log.info("test case started");
		
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		
	}

}
