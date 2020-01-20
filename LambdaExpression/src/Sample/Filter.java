package Sample;

import java.util.List;
import java.util.stream.Collectors;

public class Filter {
    public static void main(String[] args) {

        List<Employee> employeeList = Application.getAllEmployees();

        System.out.println(employeeList);

        List<Employee> filtered = employeeList.stream().filter(employee -> employee.getName().contains("e"))
                .collect(Collectors.toList());

        System.out.println(filtered);

    }
}
