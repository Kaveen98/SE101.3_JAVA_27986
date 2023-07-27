package com.mycompany.employeetest;

public class Employee 
{
     private String name ;
    private int age ;
    private double salary ;
    
    public String getname()
    {
        return name ;
    }
    
    public int getage()
    {
        return age ;
    }
    
    public double getsal()
    {
        return salary ;
    }
    
    public void setName(String name )
    {
        this.name=name;
    }
    
    public void setAge(int age)
    {
        this.age=age;
    }
    
    public void setSalary(double salary)
    {
        this.salary=salary;
    }
    
}
