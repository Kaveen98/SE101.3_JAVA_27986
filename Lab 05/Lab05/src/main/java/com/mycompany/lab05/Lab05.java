package com.mycompany.lab05;

public class Lab05 {

    public static void main(String[] args) 
    {
        Employee emp1 = new Employee() ;
        Employee emp2 = new Employee() ;
        
        emp1.setData(001, "Bogdan", "Data Scientist");
        emp2.setData(002, "Bird", "Software Engineer");
        
        System.out.println("Emp ID: "+emp1.getID());
        System.out.println("Emp Name: "+emp1.getName());
        System.out.println("Emp Designation: "+emp1.getDes());
        
        System.out.println();
        
        System.out.println("Emp ID: "+emp2.getID());
        System.out.println("Emp Name: "+emp2.getName());
        System.out.println("Emp Designation: "+emp2.getDes());
        
    }
}
