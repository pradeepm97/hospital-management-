package project;

import java.util.regex.Pattern;

public class Checking {
	public static boolean checking(String parameter) {
		Pattern p1=Pattern.compile("[A-Za-z' ']+");
		boolean b1= p1.matcher(parameter).matches();
		return b1;
	}
	public static boolean checkingNumber(String number) {
		Pattern p1=Pattern.compile("[0-9' ']+");
		boolean b1= p1.matcher(number).matches();
		return b1;
	}
	public static boolean checkingNumberAndData(String data) {
		Pattern p1=Pattern.compile("[A-Za-z0-9' ']+");
		boolean b1= p1.matcher(data).matches();
		return b1;
	}
}
