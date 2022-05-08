package DataManager;

import Model.Customer;

import java.util.Scanner;

public class Manager {
    private static Customer withdrawMoney(Customer c) {
        Scanner s = new Scanner(System.in);
        System.out.println("amount:");
        int amount = Integer.parseInt(s.nextLine());
        int balance = c.getBalance();
        balance -= amount;
        if (balance < 0) {
            System.out.println("There is not enough money in the account");
        } else {
            c.setBalance(balance);
            System.out.println(c.getBalance());
        }
        return c;
    }

    private static Customer deposit(Customer c) {
        Scanner s = new Scanner(System.in);
        System.out.println("amount:");
        int amount = Integer.parseInt(s.nextLine());
        int balance = c.getBalance();
        balance += amount;
        c.setBalance(balance);
        System.out.println(balance);
        return c;
    }

    private static void viewBalance(Customer c) {
        System.out.println(c.getBalance());
    }

    public Customer selectionMenu(String s, Customer c) {
        switch (s) {
            case "1":
                return withdrawMoney(c);
            case "2":
                return deposit(c);
            case "3":
                viewBalance(c);
                break;
            default:
                break;
        }
        return c;
    }
}

