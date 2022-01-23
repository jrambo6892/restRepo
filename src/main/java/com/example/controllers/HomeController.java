package com.example.controllers;

import com.example.entiies.Employee;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.UUID;

@RestController
@RequestMapping(value = "/api")
public class HomeController {
    @GetMapping(value = "hello")
    public ResponseEntity<String> hello(){
        return new ResponseEntity<>("Hello World From Spring-Boot!!!", HttpStatus.OK);
    }
    @GetMapping(value = "/emps")
    public ResponseEntity<ArrayList<Employee>> getEmployee(){
        ArrayList<Employee> employees = new ArrayList<>();
        employees.add(new Employee(UUID.randomUUID().toString(),"smith",10000l));
        employees.add(new Employee(UUID.randomUUID().toString(),"lorry",10000l));
        employees.add(new Employee(UUID.randomUUID().toString(),"flinch",10000l));
        return new ResponseEntity<>(employees,HttpStatus.OK);
    }

}
