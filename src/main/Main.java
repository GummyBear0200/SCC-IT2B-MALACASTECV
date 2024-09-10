package main;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean running = true;

        while (running) {
            System.out.println("\nChoose an option:");
            System.out.println("1. Receipt");
            System.out.println("2. Salary");
            System.out.println("3. Account Management");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            int choice = input.nextInt();
            input.nextLine(); // Consume the newline character

            if (choice == 1) {
                System.out.println("----- Receipt -----");
                Reciept rc = new Reciept();
                rc.getReceipt(input);
            } else if (choice == 2) {
                System.out.println("----- Salary -----");
                Salary salaryManager = new Salary();
                salaryManager.getSalary(input);
            } else if (choice == 3) {
                System.out.println("----- Account -----");
                Account accountManager = new Account();
                accountManager.addAccounts(input);
            } else if (choice == 4) {
                running = false; // Exit the loop
            } else {
                System.out.println("Invalid option. Please try again.");
            }
        }

        input.close();
    }
}