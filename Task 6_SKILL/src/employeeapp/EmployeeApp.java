package employeeapp;

import java.util.*;

public class EmployeeApp {
    public static void main(String[] args) throws CloneNotSupportedException {
        List<Employee> employees = new ArrayList<>(Arrays.asList(
            new Employee("Alice", 30, 50000),
            new Employee("Bob", 25, 60000),
            new Employee("Charlie", 35, 70000)
        ));

        Collections.sort(employees);
        employees.forEach(System.out::println);

        Collections.sort(employees, new AgeComparator());
        employees.forEach(System.out::println);

        Collections.sort(employees, new SalaryComparator());
        employees.forEach(System.out::println);

        Employee clone = (Employee) employees.get(0).clone();
        System.out.println(clone);
    }
}
