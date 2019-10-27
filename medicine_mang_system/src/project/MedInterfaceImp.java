package project;
public class MedInterfaceImp extends ObjectClass implements MedicalInterface  {
	public MedicalGetters addNewMedicine(MedicalGetters rv) {
		arrayList.add(rv);
		return null;
	}
	public MedicalGetters searchMedicineBynameAndPlacing(String name, String placing) {
	boolean sts=false;
	 MedicalGetters b2=null;
     for(int i=0;i<=arrayList.size()-1;i++){
     b2=arrayList.get(i);
      String st=b2.getName();
     String st1=b2.getPlacing();
     if(st.equals(name)&&(st1.equals(placing))){
    sts=true;
    break;
     }
	}
     if(sts){
    	 System.out.println(")>Medicine Found for the respective Name and Placing...");
    	 System.out.println(b2);
    	 return b2;
     }else{
    	 System.out.println(")>Medicine not found...");
    	 return null;
     }

	}
	public MedicalGetters searchMedicineBynameAndCompany(String name, String company) {
		boolean sts=false;
		MedicalGetters b2=null;
	     for(int i=0;i<=arrayList.size()-1;i++){
	     b2=arrayList.get(i);
	     String st=b2.getName();
	     String st1=b2.getCompany();
	     if(st.equals(name)&&(st1.equals(company))){
	    sts=true;
	    break;
	     }
		}
	     if(sts){
	    	 System.out.println(")>Medicine Found for the respective Name and Company...");
	    	 System.out.println(b2);
	    	 return b2;
	     }else{
	    	 System.out.println(")>Medicine Not Found...");
	    	 return null;
	     }	
	}
	public MedicalGetters searchMedicineBynameAndDose(String name, String dose) {
		boolean sts=false;
		MedicalGetters b2=null;
	     for(int i=0;i<=arrayList.size()-1;i++){
	     b2=arrayList.get(i);
	     String st=b2.getName();
	     String st1=b2.getDose();
	     if(st.equals(name)&&(st1.equals(dose))){
	    sts=true;
	    break;
	     }
		}
	     if(sts){
	    	 System.out.println(")>Medicine Found for the respective name and Dose...");
	    	 System.out.println(b2);
	    	 return b2;
	     }else{
	    	 System.out.println(")>Medicine not found...");
	    	 return null;
	     }	
	}

	public MedicalGetters searchMedicineByname(String name) {
		boolean sts=false;
		MedicalGetters b2=null;
	     for(int i=0;i<=arrayList.size()-1;i++){
	     b2=arrayList.get(i);
	     String st=b2.getName();
	     if(st.equals(name)){
	    sts=true;
	    break;
	     }
		}
	     if(sts){
	    	 System.out.println(")>Medicine Found for the respective Name...");
	    	 System.out.println(b2);
	    	 return b2;
	     }else{
	    	 System.out.println(")>Medicine not found...");
	    	 return null;
	     }	

	}
     public MedicalGetters searchMedicineByPlacing(String placing) {
    	 boolean sts=false;
         int j=0;
    	 MedicalInterface interface1=new MedInterfaceImp();
 		MedicalGetters b2=null;
 	     for(int i=0;i<=arrayList.size()-1;i++){
 	     b2=arrayList.get(i);
 	     String st=b2.getPlacing();
 	    if(st.equalsIgnoreCase(placing)) {
 	    	arrayList.remove(i);
 	    	i--;
         }
 	     }
 	    return b2;
     }
}
