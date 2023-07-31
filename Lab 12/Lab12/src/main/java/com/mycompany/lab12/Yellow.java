package com.mycompany.lab12;
import java.lang.Thread;
public class Yellow extends Thread
{
    boolean flag=true;
     @Override
    public void start()
    {
            try
            {
                Red.sleep(12000);
                Green.sleep(7000);
                System.out.println("Yellow Light");
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
                Thread.sleep(15000);
                flag=false;
            }
            
            catch(Exception e)
            {
                
            }
       }
}
