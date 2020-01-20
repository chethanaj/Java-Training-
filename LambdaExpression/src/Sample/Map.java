package Sample;

import java.util.List;
import java.util.stream.Collectors;

public class Map {
    public static void main(String[] args) {
        List<Employee> employeeList = Application.getAllEmployees();

        System.out.println(employeeList);

        List<Integer> maped = employeeList.stream()
                .map(employee -> employee.getAge() )
                .collect(Collectors.toList());

        System.out.println(maped);

    }
}
