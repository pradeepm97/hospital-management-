package project;
import java.util.Scanner;
public class UpdateMedicineData extends ObjectClass{
static Scanner scanner=new Scanner(System.in);
public static void options() {
	System.out.println("---------------------------------");
	System.out.println("1: delete particular medicine :");
	System.out.println("2: delete all medicines by Place:");
	System.out.println("3: clear the list and start with the new list:");
	System.out.print("enter your choice....");
	switch(scanner.next()) {
	case "1":deleteMedicine();
			break;
	case "2":deleteByRows();
			break;
	case "3":newList();
			break;	
	default:System.err.println("Wrong option...");
	options();
	}

}
public static void viewMedicines() {
	int i=0;
	System.out.println("********************************************************");
	System.out.println("----------Medicines-List-----------");
    for(MedicalGetters k:arrayList) {
    System.out.print(i);
    System.out.println(k);
    i++;
    }
    System.out.println("total "+(i-1)+" medicines present in the list");
    Controler.repetative();
}
public static void deleteMedicine() 
{
	System.out.print("enter medicine name:");
	String medicineName=scanner.next();
	MedicalInterface interface1=new MedInterfaceImp();
	if(arrayList.remove(interface1.searchMedicineByname(medicineName))) 
	{
		System.out.println("medicine data was deleted");
	}
	else 
	{
		System.err.println("so Operation can't be performed..");
	}
	direction();
}
public static void deleteByRows() {
	System.out.print("Enter the rack where medicine you want to remove (eg:1st or 2nd):");
    String row=scanner.next();
	MedicalInterface interface1=new MedInterfaceImp();
	interface1.searchMedicineByPlacing(row);
	direction();

}
public static void direction() {
	System.out.println("-------------------------------------");
	System.out.print(">>Press 1  for Search-Options  or Press 2 for Main-Menu any key for exit :");
	switch(scanner.next()){
	case "1":options();
	         break;
	case "2":UserAccess.inputvalidation();
	         break;
	case "3": System.out.println("   <:)  Thankyou  Have a nice Day.");
	          MedicineSerialaize.serializeMedicine();
	          System.exit(0);
	}
}
public static void newList() {
	arrayList.clear();
	System.out.println("list is empty now");
	MedicalGetters getters=new MedicalGetters("medicine name","medicine-comany", "medicine-price", "medicine-dose", "Medicine-place");
	MedicalInterface interface1=new MedInterfaceImp();
	interface1.addNewMedicine(getters);
	System.err.print("**");
	System.out.println("atleast one medicine should be present.So this List will have by default One dummy medicine");
	direction();
}
}