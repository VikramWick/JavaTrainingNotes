package filereader;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class BufferReader {
    public static void main(String[] args) {
        try{
            BufferedReader br=new BufferedReader(new FileReader("C:\\Users\\gurajala.vikram1\\JavaTraining\\filereader\\data.txt"));
            BufferedWriter br1=new BufferedWriter(new FileWriter("C:\\Users\\gurajala.vikram1\\JavaTraining\\filereader\\data1.txt"));
            String s1;
            while((s1=br.readLine())!=null){
                br1.write(s1);
                br1.newLine();
            }
            br1.write("--the data has been Copied--");
            br.close();
            br1.close();
        }
        catch(Exception e){
            e.printStackTrace();
        }

    }
    
}
