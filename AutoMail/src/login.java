
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class login {
	WebDriver driver=new ChromeDriver();
	public void launch() {
		driver.get("https://www.gmail.com/");
	}
	public void logIn() {
		driver.manage().window().maximize();
		
		driver.findElement(By.name("identifier")).sendKeys("surajk_bt17@iiitkalyani.ac.in");
		//driver.findElement(By.("VfPpkd-RLmnJb")).click();
		driver.findElement(By.className("VfPpkd-RLmnJb")).click();
		System.out.println("Email input Done");
		
		
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		System.out.println("5 sec done ");
		driver.findElement(By.name("password")).sendKeys("bullseye974@");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.className("VfPpkd-RLmnJb")).click();
		System.out.println("Password Input done");

	}
	/*public static void main(String args[]) {
		login l=new login();
		l.launch();
		l.logIn();
		System.out.println("Hello world");
	}*/
}
