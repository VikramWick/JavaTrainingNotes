package CollectionsPractice;

import java.util.*;
import java.util.stream.Collectors;

public class Array {

    public static void main(String[] args) {
        List<EmployeeDTO> obj=new ArrayList<>();
        obj.add(new EmployeeDTO(1005, "Ram"));
        EmployeeDTO dto=new EmployeeDTO(0, null);
        dto.setId(1006);
        dto.setName("Bheem");
        obj.add(dto);
        for (int i = 0; i < obj.size(); i++) {
            System.out.println((i+1)+". "+obj.get(i));
        }
        obj.forEach(System.out::println);
        System.out.println("Employee Id's ..");
        obj.stream().filter((ob)->(ob.getId()%2==0)).forEach(System.out::println); //prints both id and name for even Id numbers since for each is used.
        obj.stream().map((ob)->(ob.getName())).forEach(System.out::println); //prints only names since we used "map" instead of "filter" in streams
        obj.stream().filter((ob)->(ob.getName().charAt(2)=='e')).forEach(System.out::println); //prints object which has 'e' in its empname at position 3

        System.out.print("Count of names that starts with R: ");
        Integer c=(int)obj.stream().filter((ob)->(ob.getName().charAt(0)=='R')).count();// returns long so printing in integer by converting
        System.out.println(c);

        //creating a arraylist of employees whose first letter of their names are between A to C
        List<EmployeeDTO> obj1 = obj.stream().filter((ob)->(ob.getName().matches("[A-Ca-c].*"))).collect(Collectors.toList());
        obj1.stream().map(EmployeeDTO::getName).forEach(System.out::println);    

        //sorting based on employee name
        System.out.print("Sorting by name :");
        Collections.sort(obj, Comparator.comparing(EmployeeDTO::getName));
        // Another method: Collections.sort(obj,(x,y)->(x.getName().compareTo(y.getName()));
        System.out.println(obj);
    }
}
