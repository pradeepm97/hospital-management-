package project;

import java.util.Scanner;

public class Controler extends Thread {
	static Scanner scanner=new Scanner(System.in);
 public void run() {
  	 System.out.println("************************************");
 	 System.out.println("*    Medicines-Management-System   *");
   	 System.out.println("************************************");
   	 medicineServices();
 }
 public static void repetative(){
	  	
		System.out.println("******************************************************!");
		System.out.print(">>Press 1  for Options  or Press Any Key to Exit :");
			String ref=scanner.next();
		System.out.println("**********************************");
		if(ref.equals("1")){
			UserAccess.inputvalidation();
		}
		else{
		System.out.println("   <:)  Thankyou  have a nice day.");
		MedicineSerialaize.serializeMedicine();
		System.exit(0);
		}
 }
 public  void medicineServices() {
	
		MedicineSerialaize.deSerializeMedicine();
	    UserAccess.inputvalidation();
	  
 }
}
		
