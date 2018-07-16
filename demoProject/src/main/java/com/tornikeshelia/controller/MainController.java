package com.tornikeshelia.controller;

import com.tornikeshelia.service.Employee;
import com.tornikeshelia.service.EmployeeManip;
import com.tornikeshelia.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MainController {

    private EmployeeService employeeService;

    @Autowired
    public MainController(EmployeeService employeeService) {
        this.employeeService= employeeService;
    }

    @ModelAttribute
    public EmployeeManip employeeManipulation(){
        return employeeService.getData();
    }


    @GetMapping("/home")
    public String homePage(Model model){
        return "home";
    }

    @GetMapping("/addEmployee")
    public String addEmployee(Model model){
        Employee employee = new Employee("", "", 0, "");
        model.addAttribute("employee", employee);
        return "addEmployee";
    }

    @PostMapping("/addEmployee")
    public String postAddEmployee(@ModelAttribute("employee")Employee employee){
        employeeService.addEmployee(employee);
        return "redirect:/" + "home";
    }

    @GetMapping("/editEmployee")
    public String editEmployee(@RequestParam(required = false)int id, Model model){
        Employee employee = employeeService.getEmployee(id);
        model.addAttribute("editEmployee", employee);
        return "editEmployee";
    }

    @PostMapping("/editEmployee")
    public String postEditEmployee(@ModelAttribute("editEmployee")Employee employee){
        employeeService.updateEmployee(employee);
        return "redirect:/" + "home";
    }

    @GetMapping("/deleteEmployee")
    public String deleteEmployee(@RequestParam(required = false)int id){
        employeeService.deleteEmployee(id);
        return "redirect:/" + "home";
    }


}
