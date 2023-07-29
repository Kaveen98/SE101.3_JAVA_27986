package com.mycompany.practical05ex05;

public abstract class BankAccount 
{
    private String accountNumber ;
    private double balance ;
    
    public void setAccountNumber(String accountNumber)
    {
        this.accountNumber=accountNumber;
        this.balance=balance;
    }
    
     public void setBalance(double balance)
    {
        this.balance=balance;
    }
    
    public String getAccountNumber()
    {
        return accountNumber;
    }
    
    public double getBalance()
    {
        return balance;
    }
    
    public abstract void calculateInterest();
    
}
