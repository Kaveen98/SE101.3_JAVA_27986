package com.mycompany.practical05q2;

public class Politician implements Speaker
{
    @Override
    public void speak(String phrase)
    {
	System.out.println(i+" Politician: "+phrase);
    }
}
