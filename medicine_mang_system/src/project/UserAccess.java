package project;

import java.util.Scanner;
import java.util.regex.Pattern;
public class UserAccess{
	static Scanner scanner=new Scanner(System.in);
	public static void  inputvalidation() {
	System.out.println("1: Add a new medicine.");
   	System.out.println("2: Searching madicine.");
 	System.out.println("3: Remove medicine.");
	System.out.println("4: View medicine list");
	System.out.print(">>Choose any option in above   :");
  	String userSelectedValue=scanner.nextLine();
	switch(userSelectedValue){
 	case "1": addMedicine();
	            break;
	case "2":SearchingMedicine.display();
	            break;
	case "3":UpdateMedicineData.options();
	            break;   
	case "4":UpdateMedicineData.viewMedicines();            
	default: System.err.println("your option is  not valid"); 
	         inputvalidation();
}
}
public static void addMedicine() {
	boolean status;
	String name;
	String company;
	String price;
	String dose;
	String placing;
	do {
		   System.out.print("Enter medicine name :");
		   name=scanner.nextLine();
 	   status= Checking.checking(name);
 }while(!status);
	do {
		   System.out.print("Enter medicine company :");
		   company=scanner.nextLine();
	   status= Checking.checking(company);
}while(!status);
	do {
		   System.out.print("Enter medicine price :");
		   price=scanner.nextLine();
	   status= Checking.checkingNumber(price);
}while(!status);
	do {
		   System.out.print("Enter medicine dose(mg) :");
		   dose=scanner.nextLine();
	   status= Checking.checkingNumberAndData(dose);
}while(!status);
	do {
		   System.out.print("Enter medicine placing (eg:1st rack):");
		   placing=scanner.nextLine();
	   status= Checking.checkingNumberAndData(placing);
}while(!status);
	MedicalGetters medicalGetters=new MedicalGetters(name, company, price, dose, placing);
	MedicalInterface interface1=new MedInterfaceImp();
	interface1.addNewMedicine(medicalGetters);
	System.out.println("medicine added successfully...");
	Controler.repetative();
}

}
