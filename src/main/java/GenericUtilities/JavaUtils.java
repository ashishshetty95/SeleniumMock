package GenericUtilities;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

public class JavaUtils {
	public int randomNumber(int range) {
		Random ran=new Random();
		int number = ran.nextInt(range);
		return number;
	}
	public String systemDate() {
		Date date=new Date();
		String systemDate = date.toString();
		return systemDate;
	}
	public String systemDateInFormat() {
		SimpleDateFormat format=new SimpleDateFormat("dd/MM/yyyy HH-mm-ss");
		Date date=new Date();
		String dateInFormat = format.format(date);
		return dateInFormat;
	}
}
