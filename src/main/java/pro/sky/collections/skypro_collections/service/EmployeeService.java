package pro.sky.collections.skypro_collections.service;


import org.springframework.stereotype.Service;
import pro.sky.collections.skypro_collections.Employee;

import java.util.ArrayList;
import java.util.List;

@Service
public class EmployeeService {
    private final List<Employee> employees = new ArrayList<>();

    public Employee add(String firstName, String lastName) {
        Employee newEmployee = new Employee(firstName, lastName);
        employees.add(newEmployee);
        return newEmployee;
    }

    public Employee find(String firstName, String lastName) {
        return null;
    }

    public Employee remove(String firstName, String lastName) {
        return null;
    }

    public List<Employee> getAll() {
        return null;
    }

}
