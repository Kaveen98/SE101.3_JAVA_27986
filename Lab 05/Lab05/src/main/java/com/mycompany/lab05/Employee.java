package com.mycompany.lab05;

public class Employee 
{
    private int empID ;
    private String empName , empDesignation ;
    
    public void setData (int empID , String empName , String empDesignation)
    {
        this.empID=empID ;
        this.empName=empName ;
        this.empDesignation=empDesignation ;
    }
    
    public int getID()
    {
        return empID ;
    }
    
    public String getName()
    {
        return empName ;
    }
    
    public String getDes()
    {
        return empDesignation ;
    }
    
   
}
