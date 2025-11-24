package filereader;

import java.io.*;

public class InputStreamReader {
	public static void main(String[] args) {
		try {
			BufferedReader br = new BufferedReader(new java.io.InputStreamReader(System.in));
			System.out.println("Enter two numbers: ");
			String num1 = br.readLine();
			String num2 = br.readLine();
			System.out.println("Sum is "+(Integer.parseInt(num1)+Integer.parseInt(num2)));
		}
		catch(Exception e) {
			e.getMessage();
		}
	}
}
 
