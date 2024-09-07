package main;

import java.util.Scanner;



public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
       
        System.out.println("----- Receipt -----");
        Reciept rc = new Reciept();
        rc.getReceipt(input);
        
  
        System.out.println("----- Salary -----");
        Salary salaryManager = new Salary();
        salaryManager.getSalary(input);
        
       
        System.out.println("----- Account -----");
        Account accountManager = new Account();
        accountManager.addAccounts(input);
        
        input.close();
    }
}