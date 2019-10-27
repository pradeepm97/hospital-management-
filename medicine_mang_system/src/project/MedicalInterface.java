package project;
public interface MedicalInterface {
public MedicalGetters addNewMedicine(MedicalGetters rv);
public MedicalGetters searchMedicineBynameAndPlacing(String name,String placing);
public MedicalGetters searchMedicineBynameAndCompany(String name,String company);
public MedicalGetters searchMedicineBynameAndDose(String name,String dose);
public MedicalGetters searchMedicineByname(String name);
public MedicalGetters searchMedicineByPlacing(String placing);
}
