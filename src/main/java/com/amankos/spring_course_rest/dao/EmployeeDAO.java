package com.amankos.spring_course_rest.dao;

import com.amankos.spring_course_rest.entities.Employee;

import java.util.List;

public interface EmployeeDAO {
    public List<Employee> getEmployees();

    public void saveEmployee(Employee employee);

    public Employee getEmployee(int id);

    public void deleteEmployee(int id);
}
