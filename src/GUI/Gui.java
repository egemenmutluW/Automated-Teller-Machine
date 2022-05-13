package GUI;

import Data.data;
import Model.Customer;

import java.util.*;

public class Gui {
    private static void greeting() {
        System.out.println("---Automated Teller Machine---");
    }
    private static String menu() {
        String choice;
        Scanner s = new Scanner(System.in);

        System.out.println("[1] withdraw money");
        System.out.println("[2] deposit");
        System.out.println("[3] view balance");
        System.out.println("Enter the transaction number you want to make :");
        choice = s.nextLine();
        return  choice;
    }

    public void exit(){
        System.out.println("[E/n] exit");
    }

    public void backtoMenu(){
        System.out.println("[E/b] back");
    }

    public String menuStart () {
        greeting();
        return menu();
    }

    public String loginMenu () {
        String choice;
        Scanner s = new Scanner(System.in);

        System.out.println("[1] login");
        System.out.println("[2] register");
        System.out.println("Enter the transaction number you want to make :");
        choice = s.nextLine();

        return choice;
    }

    public Customer register() {
        System.out.println("--- Register ---");
        Scanner s = new Scanner(System.in);
        Customer c = new Customer();

        System.out.println("Name:");
        c.setName(s.nextLine());
        System.out.println("Surname:");
        c.setSurName(s.nextLine());
        System.out.println("Balance:");
        c.setBalance(Integer.parseInt(s.nextLine()));
        data.customerList.add(c);
        return c;
    }

    public List<String> login() {
        System.out.println("--- Login ---");
        Scanner s = new Scanner(System.in);
        String name;
        String surname;
        List<String> user = new ArrayList<String>();

        System.out.println("Name:");
        name = s.nextLine();
        System.out.println("Surname:");
        surname = s.nextLine();

        user.add(name);
        user.add(surname);

        return user;
    }
}