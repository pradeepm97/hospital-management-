package project;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class MedicineSerialaize {
	private static final String Finally = null;
	private static File f1=new File("./FileList/medicine.ser");
					public static void serializeMedicine()
					{
						FileOutputStream fos=null;
						ObjectOutputStream oos=null;
					 	try {
							f1.createNewFile();
							fos=new FileOutputStream(f1);
							oos=new ObjectOutputStream(fos);
			 				oos.writeObject(ObjectClass.arrayList);
							oos.flush();
						     }
						catch(Exception rv)
                        {
							System.err.println("somwthing went wrong...");
						}
						finally {
							
							try {
								fos.close();
								oos.close();
							} catch (IOException e) {
								System.err.println("something went wrong");
							}
						}
					}
public static void deSerializeMedicine() {
	FileInputStream fis=null;
	ObjectInputStream ois=null;
	try {
		fis=new FileInputStream(f1);
		ois=new ObjectInputStream(fis);
		ObjectClass.arrayList=(ArrayList<MedicalGetters>)ois.readObject();
		
	}catch(Exception rv1) {
		System.err.println("something wrong");
	}
    finally {
    	try {
    		fis.close();
    		ois.close();
    	}catch(IOException rv2){
    		System.err.println("something wrong...");
    	}
    }
	}
}
