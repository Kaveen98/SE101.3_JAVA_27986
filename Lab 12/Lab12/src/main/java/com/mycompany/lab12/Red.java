package com.mycompany.lab12;
import java.lang.Thread;
public class Red extends Thread
{
    boolean flag=true;
     @Override
    public void start()
    {
            try
            {
                Yellow.sleep(15000);
                Green.sleep(7000);
                System.out.println("Red Light");
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
                Thread.sleep(12000);
                flag=false;
            }
            
            catch(Exception e)
            {
                
            }
       }
    
}
