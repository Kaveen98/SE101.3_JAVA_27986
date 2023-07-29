package com.mycompany.practical05q2;

public class Lecturer implements Speaker 
    {
        @Override
	public void speak(String phrase)
        {
            System.out.println(i+" Lecturer: "+phrase);
	}
}
