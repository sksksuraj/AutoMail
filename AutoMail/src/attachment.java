import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.io.IOException;
import org.openqa.selenium.By;
import java.awt.event.*;
//import org.testing.annotations.Test;
public class attachment extends login {
	public void attach() throws IOException, InterruptedException, AWTException{
		String text = "C:\\Users\\NCL\\Pictures\\Screenshots\\SURAJ_cv.pdf";
		//StringSelection stringSelection = new StringSelection(text);
		Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
		
		driver.findElement(By.cssSelector(".T-I.T-I-KE.L3")).click();
		driver.findElement(By.name("to")).sendKeys("fnifism@gmail.com");
		driver.findElement(By.name("subjectbox")).sendKeys("Automated Email");
		driver.findElement(By.cssSelector(".Ar.Au div")).sendKeys("this is an automatic mail");	
		driver.findElement(By.cssSelector("tr.btC td:nth-of-type(4) div div:nth-of-type(1)")).click();
		Thread.sleep(3000);
		//Runtime.getRuntime().exec("C:\\Users\\NCL\\Pictures\\Screenshots\\Screenshot (1).png");
		String date="01-05-2020";
		String filename="filename.pdf";
		String path="C:\\Users\\NCL\\Pictures\\Screenshots\\";
		String d[] = date.split("-"); 
        String day = d[0];
        String month = d[1]; 
        String year = d[2]; 
        String rpath= path.concat(String.valueOf(year)).concat("\\").concat(String.valueOf(month)).concat("\\").concat(String.valueOf(day)).concat("\\").concat(filename);
        //System.out.println("Real Path: " + rpath);
		
		
		
		Robot rb1=new Robot();
		Thread.sleep(2000);
		StringSelection stringSelection = new StringSelection(rpath);
		clipboard.setContents(stringSelection, stringSelection);
		//clipboard.setContents("C:\\Users\\NCL\\Pictures\\Screenshots\\Screenshot (1).png", null);
//		rb1.keyPress(KeyEvent.VK_CONTROL);
//		rb1.keyPress(KeyEvent.VK_F);
//		rb1.keyRelease(KeyEvent.VK_CONTROL);
//		rb1.keyRelease(KeyEvent.VK_F);
		
//		rb1.keyPress(KeyEvent.VK_);
//		rb1.keyPress(KeyEvent.VK_F);
//		rb1.keyPress(KeyEvent.VK_CONTROL);
//		rb1.keyPress(KeyEvent.VK_F);
		rb1.keyPress(KeyEvent.VK_CONTROL);
		rb1.keyPress(KeyEvent.VK_V);
		rb1.keyRelease(KeyEvent.VK_V);
		rb1.keyRelease(KeyEvent.VK_CONTROL);

		//Simulate Enter key event
		rb1.keyPress(KeyEvent.VK_ENTER);
		rb1.keyRelease(KeyEvent.VK_ENTER);
		
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("tr.btC td:nth-of-type(1) div div:nth-of-type(2)")).click();
		Thread.sleep(3000);
	}

}
