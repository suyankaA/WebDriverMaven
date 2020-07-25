import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class loginTest {
	
	  @Test
	  public void dologin()
	  {
		  System.setProperty("webdriver.chrome.driver","C:\\Suyanka\\Suyanka\\Testing\\chromedriver_win32 (2)\\chromedriver.exe" );
		WebDriver driver = new ChromeDriver();
		System.out.println("executing login test");
		  
		  
	  }
	}


