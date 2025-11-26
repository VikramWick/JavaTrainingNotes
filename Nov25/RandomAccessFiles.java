package filereader;

import java.io.File;
import java.io.RandomAccessFile;
import java.util.Scanner;

public class RandomAccessFiles {
    public static void main(String[] args) {
        try{
            String fname;
            System.out.println("Enter the File name & Extension");
            Scanner sc=new Scanner(System.in);
            fname=sc.nextLine();
            sc.close();
            File f1=new File(fname);
            if(f1.exists()){
            RandomAccessFile rm=new RandomAccessFile(f1, "rw");
            long fp=0L;
            int ch;
            while((ch=rm.read())!=-1){
                if(ch==97){
                    rm.seek(fp);
                    rm.write(65);

                }
                fp++;

            }
            rm.close();
            System.out.println("File processing is done");
        }
        else{
            System.out.println("File Doesnt exist");
        }}
        catch(Exception e){

        }

    }}
    
