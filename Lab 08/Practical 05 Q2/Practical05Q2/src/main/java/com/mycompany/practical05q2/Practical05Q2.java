package com.mycompany.practical05q2;

public class Practical05Q2 
{
    public static void main(String[] args) 
    {
        Speaker speaker1 = new Priest();
        speaker1.speak("Bless you!");
        
        Speaker speaker2 = new Politician();
        speaker2.speak("Vote me!");
        
        Speaker speaker3 = new Lecturer();
        speaker3.speak("Today we are going to learn JAVA");
    }
}
