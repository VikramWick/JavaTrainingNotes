package Assignment1;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;


public class WordFrequency {
    public static void main(String[] args) {

        System.out.println("Enter the Sentence");
        Scanner sc=new Scanner(System.in);
        String sentence=sc.nextLine();
        sc.close();
        Map<String,Integer> mp=new LinkedHashMap<>();
        String arr[]=sentence.split("[ ,.]");
        for(String x:arr){
            int y=mp.getOrDefault(x,0);
            y++;
            mp.put(x,y);
        }
        System.out.println(mp); 
    }
}
