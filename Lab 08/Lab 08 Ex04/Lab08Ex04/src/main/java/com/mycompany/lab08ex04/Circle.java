package com.mycompany.lab08ex04;

public class Circle extends Shape
{
        protected double r;
	protected static final double PI =3.1415926535;
        
	public Circle(double r) 
            {
                this.r = r;
            }
        
	public double area() 
            {
                return PI * r * r;
            }
}
