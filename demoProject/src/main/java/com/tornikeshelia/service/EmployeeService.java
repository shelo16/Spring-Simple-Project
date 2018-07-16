package com.tornikeshelia.service;

public interface EmployeeService {


    void addEmployee(Employee employee);
    void deleteEmployee(int id);
    void updateEmployee(Employee employee);
    Employee getEmployee(int id);
    EmployeeManip getData();
}
