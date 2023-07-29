package com.mycompany.practical05ex05;

public class CheckingAccount extends BankAccount
{
    private static final double SAVINGS_INTEREST_RATE = 0.02;
        
        @Override
        public void calculateInterest(){
            double Interest = getBalance()*SAVINGS_INTEREST_RATE;
            System.out.println("The interest is: "+Interest);
        }
}
