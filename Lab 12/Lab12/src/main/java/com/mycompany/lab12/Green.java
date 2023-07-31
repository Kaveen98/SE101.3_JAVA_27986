package com.mycompany.lab12;
import java.lang.Thread;
public class Green extends Thread
{
    boolean flag=true;
    @Override
    public void start()
    {
            try
            {
                Yellow.sleep(15000);
                Red.sleep(12000);
                if(Red.flag==true)
                System.out.println("Green Light");
            }
            
            catch(Exception e)
            {
                
            }
    }     
    
    @Override
       public void stop()
       {
           try
            {
                Thread.sleep(7000);
                flag=false;
            }
            
            catch(Exception e)
            {
                
            }
       }
}
