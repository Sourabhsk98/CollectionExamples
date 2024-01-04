package com.example.Employee;
import java.util.*;
public class EmployeeManagementListInterface {
    public static void main(String[] args) {
        List<Employee> arrayListEmployeeList = new ArrayList<>();
        List<Employee> linkedListEmployeeList = new LinkedList<>();
        List<Employee> vectorEmployeeList = new Vector<>();
        Stack<Employee> stackEmployeeList = new Stack<>();

        // Adding employees to each list
        addEmployees(arrayListEmployeeList);
        addEmployees(linkedListEmployeeList);
        addEmployees(vectorEmployeeList);
        addEmployees(stackEmployeeList);

        // Displaying employees from each list
        displayEmployeeList("ArrayList Employee List:", arrayListEmployeeList);
        displayEmployeeList("LinkedList Employee List:", linkedListEmployeeList);
        displayEmployeeList("Vector Employee List:", vectorEmployeeList);
        displayEmployeeList("Stack Employee List:", stackEmployeeList);

        // Updating salary for an employee in each list
        updateEmployeeSalary(arrayListEmployeeList, 2, 65000.0);
        updateEmployeeSalary(linkedListEmployeeList, 2, 70000.0);
        updateEmployeeSalary(vectorEmployeeList, 2, 72000.0);
        updateEmployeeSalary(stackEmployeeList, 2, 75000.0);

        // Displaying employees after salary update
        displayEmployeeList("ArrayList Employee List (After Salary Update):", arrayListEmployeeList);
        displayEmployeeList("LinkedList Employee List (After Salary Update):", linkedListEmployeeList);
        displayEmployeeList("Vector Employee List (After Salary Update):", vectorEmployeeList);
        displayEmployeeList("Stack Employee List (After Salary Update):", stackEmployeeList);
    }
    //ArrayList: Offers dynamic array implementation. Good for random access and iteration.
    //LinkedList: Provides efficient insertion and deletion operations. Suitable for frequent modifications.
    //Vector: Synchronized version of ArrayList. Thread-safe but may have performance overhead.
    //Stack: Represents a Last-In-First-Out (LIFO) stack. Extends Vector and is used for stack-based operations.

    private static void addEmployees(List<Employee> employeeList) {
        employeeList.add(new Employee(1, "Poornima Katti", 60000.0));
        employeeList.add(new Employee(2, "Sourabh Katti", 70000.0));
        employeeList.add(new Employee(3, "Aditya katti", 55000.0));
    }

    private static void displayEmployeeList(String header, List<Employee> employees) {
        System.out.println(header);
        for (Employee employee : employees) {
            System.out.println(employee);
        }
        System.out.println();
    }

    private static void updateEmployeeSalary(List<Employee> employees, int employeeId, double newSalary) {
        for (Employee employee : employees) {
            if (employeeId == employee.getId()) {
                employee.setSalary(newSalary);
                System.out.println("Salary updated for Employee " + employeeId);
                break;
            }
        }
    }

}
