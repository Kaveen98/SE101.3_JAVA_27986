package com.mycompany.lab08ex04;

public class Rectangle extends Shape
{
    protected double w, h;
    
	public Rectangle(double w , double h) 
        {
            this.w = w;
            this.h = h; 
        }
        
        
    @Override
	public double area() 
        {
            return w * h; 
        }

}
