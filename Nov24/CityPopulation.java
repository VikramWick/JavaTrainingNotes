package Assignment1;

import java.util.*;
public class CityPopulation {
    public static void main(String[] args) {
        Map<String, Long> cityPop=new HashMap<>();
        cityPop.put("Bangalore",  3400000l);
        cityPop.put("Delhi", 19000000l);
        cityPop.put("Mumbai",  12400000l);

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter City name");
        String city=sc.nextLine();
        sc.close();
        if(cityPop.containsKey(city)){
            Long population=cityPop.get(city);
            System.out.println(city+" population is " +population);}
        else{
            System.out.println("city not found");
        }
    }  
}
