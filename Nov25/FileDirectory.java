package filereader;

import java.io.File;
import java.util.Scanner;

public class FileDirectory {

    public static void main(String[] args) {
        try{
            String fname;
            System.out.println("Enter File with path and extension");
            Scanner sc=new Scanner(System.in);
            fname=sc.nextLine();
            sc.close();
            File f1=new File(fname);
            if(f1.exists()){
                if(f1.isDirectory()){
                    System.out.println("Given is a directory");
                    String arr[]=f1.list();
                    for(String x: arr){
                        System.out.println(x);
                    }
                }
            else{
                System.out.println("Given is a file");
            }

            }
            else{
                System.out.println("File doesnt exist");
            }
        }
        catch(Exception e){
        }
    }
    
}
