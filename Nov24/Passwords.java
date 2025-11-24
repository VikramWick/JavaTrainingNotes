package regexpression;

import java.util.Scanner;

public class Passwords {

    private static final String PASSWORD_PATTERN=
                "^(?=.*[0-9])" +  //atleast one digit
                "^(?=.*[a-z])" +  //atleast one lowercase character
                "(?=.*[A-Z])" +   //atleast one uppercase character
                "(?=.*[@#$%^&+=!])" +  //atleast one special character
                "(?=.*\\S+$)" + //should not have any spaces
                ".{8,20}$"; //charcters length should be between 8-20
            String password;
    public static void main(String[] args) {
        System.out.println("Enter Password");
        Scanner sc= new Scanner(System.in);
        String password=sc.nextLine();
        sc.close();
        if(password.matches(PASSWORD_PATTERN)){
            System.out.println("Valid Password");
        }
        else{
            System.out.println("Weak Password");
        }
        
    }
            
    
}
