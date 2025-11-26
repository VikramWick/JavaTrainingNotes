package objectserialization;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class Deserialization {
    public static void main(String[] args) {
		try {
			//Deserialization
			FileInputStream fi = new FileInputStream("x.rm");
			AddTest ob =(AddTest) new ObjectInputStream(fi).readObject();
			ob.display();
			
		}
		catch(Exception e) {
			e.getMessage();
		}
	}

    
}
