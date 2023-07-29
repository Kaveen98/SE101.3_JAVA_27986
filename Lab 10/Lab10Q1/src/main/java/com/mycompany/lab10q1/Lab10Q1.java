package com.mycompany.lab10q1;
import java.util.Scanner;
public class Lab10Q1 
{
    public static void main(String[] args) 
    {
       int no1 , no2 , ans ;
        Scanner sc = new Scanner(System.in);
        
        try
        {
            System.out.println("Enter first number: ");
            no1=sc.nextInt();
            System.out.println("Enter second number: ");
            no2=sc.nextInt();
            ans=no1/no2;
            System.out.println("Answer is: "+ans);
        }

        catch(ArithmeticException e)
        {
            System.out.println("Number divide by zero error ");
        }
    }
 }
        
