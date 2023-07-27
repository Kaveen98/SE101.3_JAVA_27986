package com.mycompany.employeetest;

public class EmployeeTest 
{
    public static void main(String[] args) 
    {
        Employee emp1 = new Employee() ;
        emp1.setName("Nick");
        emp1.setAge(20);
        emp1.setSalary(10000);
        
        String name = emp1.getname();
        int age = emp1.getage();
        double salary = emp1.getsal();
        
        System.out.println("Name: "+name);
        System.out.println("Age: "+age);
        System.out.println("Salary: "+salary);
    }
}
