import GUI.Gui;
import DataManager.Manager;
import Model.Customer;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String e = "n";
        Scanner r = new Scanner(System.in);
        Customer c1 = new Customer();
        c1.setBalance(0);
        c1.setName("test");
        c1.setSurName("test");
        do{
            Gui gui = new Gui();
            Manager manager = new Manager();
            String choiceMenu;

            choiceMenu = gui.menuStart();
            c1 = manager.selectionMenu(choiceMenu,c1);
            gui.exit();
            e = r.nextLine();
        }while (e.equals("n"));
    }
}