package com.tornikeshelia.service;

import org.springframework.lang.NonNull;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;


public class EmployeeManip {

    private static int idValue = 1;

    Employee employee = new Employee("","",0,"");

    List<Employee> employeeList = new ArrayList<>();

    public EmployeeManip(){

        addEmployee(new Employee("Tornike","Shelia",21,"Just Learning Spring"));

    }

    public void addEmployee(Employee employee){
        employee.setId(idValue);
        employeeList.add(employee);
        idValue++;
    }

    public List<Employee> getEmployeeList() {
        return employeeList;
    }

    public void deleteEmployee(int id){
        ListIterator<Employee> iterator = employeeList.listIterator();
        while (iterator.hasNext()){
            Employee employee = iterator.next();
            if (employee.getId() == id){
                iterator.remove();
                break;
            }
        }
    }

    public void updateEmployee(@NonNull Employee employee){
        ListIterator<Employee> iterator = employeeList.listIterator();

        while (iterator.hasNext()){
            Employee employee1 = iterator.next();

            if (employee1.equals(employee)){
                iterator.set(employee);
                break;
            }
        }
    }

    public Employee getEmployee(int id){
        for (Employee employee : employeeList){
            if (employee.getId() == id){
                return employee;
            }
        }
        return null;
    }

}
