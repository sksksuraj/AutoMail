import java.util.Date; 
import java.time.Month; 
import java.time.LocalDate; 
public class read {
	public static void getDayMonthYear(String date,String filename) 
    { 
		String path="C:\\Users\\NCL\\Pictures\\Screenshots\\";
		String d[] = date.split("-"); 
        String day = d[0];
        String month = d[1]; 
        String year = d[2]; 
        String rpath= path.concat(String.valueOf(year)).concat("\\").concat(String.valueOf(month)).concat("\\").concat(String.valueOf(day)).concat("\\").concat(filename);
        System.out.println("Real Path: " + rpath);
    } 
	public static void main(String args[]){
		String date="01-05-2020";
		//String path="C:\\Users\\NCL\\Pictures\\Screenshots\\";
		String filename="filename.pdf";
		getDayMonthYear(date, filename);
	
			
	}
}
