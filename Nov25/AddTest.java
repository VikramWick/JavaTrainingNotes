package objectserialization;

import java.io.*;
 
public class AddTest implements Serializable {
	int num1;
	int num2;
	int num3;
	
	public void setData(int num1, int num2) {
		this.num1 =  num1;
		this.num2 = num2;
	}
	
	public void cal() {
		this.num3 = num1 + num2;
	}
	
	public void display() {
		System.out.println("num1 : "+num1+" num2 : "+num2+" num3 : "+num3);
	}
}