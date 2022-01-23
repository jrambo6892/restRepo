package com.example.entiies;

public class Employee {
    private String empId;
    private String empName;
    private Long salary;

    public String getEmpId() {
        return empId;
    }

    public void setEmpId(String empId) {
        this.empId = empId;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public Long getSalary() {
        return salary;
    }

    public void setSalary(Long salary) {
        this.salary = salary;
    }
    public Employee(){}

    public Employee(String empId, String empName, Long salary) {
        this.empId = empId;
        this.empName = empName;
        this.salary = salary;
    }
}
