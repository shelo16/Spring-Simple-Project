package com.tornikeshelia.service;

import org.springframework.stereotype.Service;

@Service
public class EmployeeServiceImpl implements EmployeeService {


    private EmployeeManip employeeManip = new EmployeeManip();


    @Override
    public void addEmployee(Employee employee) {
        employeeManip.addEmployee(employee);
    }

    @Override
    public void deleteEmployee(int id) {
        employeeManip.deleteEmployee(id);
    }

    @Override
    public void updateEmployee(Employee employee) {
        employeeManip.updateEmployee(employee);
    }

    @Override
    public EmployeeManip getData() {
        return employeeManip;
    }

    @Override
    public Employee getEmployee(int id) {
        return employeeManip.getEmployee(id);
    }
}
