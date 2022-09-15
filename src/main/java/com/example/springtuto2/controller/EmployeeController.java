package com.example.springtuto2.controller;

import com.example.springtuto2.model.Employee;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;

@Controller
public class EmployeeController {

    private ArrayList<Employee> employees = new ArrayList<>();
    private Employee employee = new Employee();

    @GetMapping("/employee")
    public String showEmployee(Model model){
        model.addAttribute("employeeList",Employee.findAll());
        return "employee";
    }

}
