package GUI;

import java.util.Scanner;

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

    public String menuStart () {
        greeting();
        return menu();

    }
}