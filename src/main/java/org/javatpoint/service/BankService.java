package org.javatpoint.service;

import org.springframework.stereotype.Service;

/**
 * @author Brad Shih on 2023/7/3
 * @project aop-before-advice-example
 */
@Service
public class BankService {
    public void displayBalance(String accNum)
    {
        System.out.println("Inside displayBalance() method");
        if(accNum.equals("12345"))
        {
            System.out.println("Total balance: 10,000");
        }
        else
        {
            System.out.println("Sorry! wrong account number.");
        }
    }
}
