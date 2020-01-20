package Sample;

import java.util.*;

public class Application {


    public static void main(String[] args) {

        List<Employee> employeeList=Application.getAllEmployees();
        System.out.println(employeeList);
        Comparator<Employee> employeeComparator= (e1,e2) -> e1.getAge() > e2.getAge() ? +1 : (e1.getAge()<e2.getAge()? -1 : 0);
        Collections.sort(employeeList,employeeComparator);
        System.out.println(employeeList);

    }

    public static List<Employee> getAllEmployees(){
        List<Employee> employeeList=new ArrayList<>();

        employeeList.add(new Employee("Sam",25));
        employeeList.add(new Employee("Ann",32));
        employeeList.add(new Employee("Mike",12));
        employeeList.add(new Employee("Diana",46));
        employeeList.add(new Employee("Johny",44));
        employeeList.add(new Employee("Zee",68));

        return employeeList;

    }
}
