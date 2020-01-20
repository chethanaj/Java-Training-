package Sample;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Sort {
    public static void main(String[] args) {
        List<Employee> employeeList = Application.getAllEmployees();

        System.out.println(employeeList);

        List<Employee> sorted = employeeList.stream()
                .sorted(Comparator.comparing(Employee::getName).reversed())
                .collect(Collectors.toList());

        System.out.println(sorted);
    }
}
