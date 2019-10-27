package project;

import java.io.Serializable;

public class MedicalGetters implements Serializable {
	private String name;
	 private String company;
	 private String price;
	 private String dose;
	 private String placing;
	public MedicalGetters(String name, String company, String price, String dose, String placing) {
 			super();
	   		this.name = name;
			this.company = company;
			this.price = price;
			this.dose = dose;
			this.placing = placing;
		}
	public String getName() {
		return name;
	}
	public String toString() {
		return  " :[name=" + name + ", company=" + company + ", price=" + price + ", dose=" + dose
				+ ", placing=" + placing + "]";
	}
	public String getCompany() {
		return company;
	}
	public String getPrice() {
		return price;
	}
	public String getDose() {
		return dose;
	}
	public String getPlacing() {
		return placing;
	}


}
