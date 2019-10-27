package project;

import java.util.Scanner;

public class SearchingMedicine {
	static Scanner scanner=new Scanner(System.in);
	
	public static  void display() {
		System.out.println("-------------------------------------");
		System.out.println("1: Search medicine based on name.");
		System.out.println("2: Search medicine Based on name and company.");
		System.out.println("3. Search  medicine Based on name and dose.");
		System.out.println("4: Search medicine Based on name and placing.");
		System.out.print(">>Choose any option in above   :");
		switch(scanner.next()) {
		case "1":searchbyName();
		       	break;
		case "2":searchByNameAndCompany();
	    		break;
		case "3": searchByNameAndDose();
				break;
		case "4":searchByNameAndPlacing();
				break;
		default:System.err.println("Wrong option");
		        display();
		}
	}

	public static void searchbyName() {
		System.out.print("Enter medicine Name:");
		 String name=scanner.next();
		 MedicalInterface interface1=new MedInterfaceImp();
		 interface1.searchMedicineByname(name);
		 direction();
	}
	private static void searchByNameAndCompany() {
		System.out.print("Enter medicine Name:");
		 String name=scanner.next();
		 System.out.print("Enter medicine company:");
		 String company=scanner.next();
		 MedicalInterface interface1=new MedInterfaceImp();
	     interface1.searchMedicineBynameAndCompany(name, company);
	     direction();
			
		}
	private static void searchByNameAndDose() {
		boolean status;
		String dose;
		System.out.print("Enter medicine Name:");
		 String name=scanner.next();
		 
		 do
		 {
			 System.out.print("Enter medicine dose:");
			 dose=scanner.next();
		   status= Checking.checkingNumber(dose);
	      }while(!status);
		MedicalInterface interface1=new MedInterfaceImp();
	    interface1.searchMedicineBynameAndDose(name, dose);
	    direction();
			
		}
	private static void searchByNameAndPlacing() {
		boolean status;
		String placing;
		System.out.print("Enter medicine Name:");
		 String name=scanner.next();
									 do
									 {
										 System.out.print("Enter medicine placing:");
										 placing=scanner.next();
									   status= Checking.checkingNumberAndData(placing);
								      }while(!status);
		 MedicalInterface interface1=new MedInterfaceImp();
		 interface1.searchMedicineBynameAndPlacing(name, placing);
		 direction();
			
		}
    public static void direction() {
    	System.out.println("-------------------------------------");
    	System.out.print(">>Press 1  for Search-Options  or Press 2 for Main-Menu any key for exit :");
    	switch(scanner.next()){
    	case "1":display();
    	         break;
    	case "2":UserAccess.inputvalidation();
    	         break;
    	case "3": System.out.println("   <:)  Thankyou  Have a nice Day.");
		          MedicineSerialaize.serializeMedicine();
		          System.exit(0);
    	}
    }
}
