import java.awt.AWTException;
import java.io.IOException;

public class script extends attachment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		script s= new script();
		s.launch();
		s.logIn();
		try {
			s.attach();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (AWTException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Mail sent");

	}

}
