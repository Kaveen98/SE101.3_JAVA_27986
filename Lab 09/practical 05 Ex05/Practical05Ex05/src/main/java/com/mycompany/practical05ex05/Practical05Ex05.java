package com.mycompany.practical05ex05;

public class Practical05Ex05 {

    public static void main(String[] args) 
    {
        SavingsAccount s1 = new SavingsAccount();
        s1.setBalance(200000);
        s1.calculateInterest();
        
        CheckingAccount c1 = new CheckingAccount();
        c1.setBalance(20000000);
        c1.calculateInterest();
    }
}
