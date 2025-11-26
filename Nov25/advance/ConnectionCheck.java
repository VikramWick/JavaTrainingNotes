package com.advance;

import java.sql.Connection;
import java.sql.Date;
import java.util.List;
import java.util.Scanner;

public class ConnectionCheck {

   public static void main(String[] args) {
		try {
			StudentDAO dao = new StudentDAO();
			int ch = 0;
			do {
				System.out.println("---------------------------------");
                System.out.println("Enter 0 for Exit");
                System.out.println("Enter 1 to Display All");
                System.out.println("Enter 2 to Search by Id");
                System.out.println("Enter 3 to Delete by Id");
                System.out.println("Enter 4 to Insert New Record"); 
                System.out.println("---------------------------------");
				ch = new Scanner(System.in).nextInt();
				switch(ch) {
				case 0:
					System.out.println("Thank you for using");
					dao = null;
					break;
				case 1:
					List<StudentDTO> l1 = dao.getallstudents();
					l1.forEach(System.out :: println);
                    break;
                case 2:
                    StudentDTO ob=new StudentDTO();
                    System.out.println("Enter the id");
                    ob.setSroll(new Scanner(System.in).nextInt());
                    System.out.println(dao.getbyId(ob));
                    break;
                case 3:
                    StudentDTO ob1=new StudentDTO();
                    System.out.println("Enter the id to be deleted");
                    ob1.setSroll(new Scanner(System.in).nextInt());
                    System.out.println(dao.deletebyId(ob1));
                    break;
                case 4:
                    StudentDTO newStudent = new StudentDTO();

                    System.out.println("Enter Roll Number:");
                    newStudent.setSroll(new Scanner(System.in).nextInt());

                    System.out.println("Enter First Name:");
                    newStudent.setFname(new Scanner(System.in).next());

                    System.out.println("Enter Last Name:");
                    newStudent.setLname(new Scanner(System.in).next());

                    System.out.println("Enter DOB (yyyy-mm-dd):");
                    String dateInput = new Scanner(System.in).next();
                    
                    newStudent.setDob(Date.valueOf(dateInput));

                    System.out.println("Enter Gender:");
                    newStudent.setGender(new Scanner(System.in).next());

                    System.out.println(dao.insertStudent(newStudent));
                    break;

	
				default:
					System.out.println("Enter Correct choice");
				}
				
				
			}while(ch!=0);
			
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
    
}
