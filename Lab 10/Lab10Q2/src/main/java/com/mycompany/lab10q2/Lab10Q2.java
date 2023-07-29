package com.mycompany.lab10q2;

public class Lab10Q2 
{
    public static void main(String[] args) 
    {
        int no1=10 , no2=2 , ans ;
        int[] arr = new int[5];
        
        try
        {
            ans=no1/no2;
            System.out.println("Answer is: "+ans);
            arr[7]=25;
            System.out.println("Last element is "+arr[5]);
        }

        catch(ArithmeticException e)
        {
            System.out.println("Number divide by zero error ");
        }
        
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println("Array index error ");
        }
    }
}
