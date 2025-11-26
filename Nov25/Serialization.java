package objectserialization;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class Serialization {

    public static void main(String[] args) {
		//Object Serialization
		try {
			FileOutputStream fo = new FileOutputStream("x.rm");
			AddTest ob = new AddTest();
			ob.setData(17, 10);
			ob.cal();
			new ObjectOutputStream(fo).writeObject(ob);
			fo.close();

			System.out.println("Serialization is completed");
		}
		catch(Exception e) {
			e.getMessage();
		}
    
}}
