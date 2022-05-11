import DataManager.CustomerManager;
import GUI.Gui;
import DataManager.Manager;
import Model.Customer;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String e = "n";
        Scanner r = new Scanner(System.in);
        do{
            Customer c1 = new Customer();
            Gui gui = new Gui();
            Manager manager = new Manager();
            String choiceMenu;

            choiceMenu = gui.loginMenu();
            if (choiceMenu.equals("1")){
                boolean control = false;
                do {
                    List<String> user = new ArrayList<String>();
                    String name;
                    String surname;

                    user = gui.login();
                    name = user.get(0);
                    surname = user.get(1);
                    control = CustomerManager.loginControl(name,surname);
                    if (control){
                        user.clear();
                        user = CustomerManager.getUserData(name,surname);
                        c1.setName(user.get(0));
                        c1.setSurName(user.get(1));
                        c1.setBalance(Integer.parseInt(user.get(2)));
                        user.clear();
                    } else {
                        user.clear();
                    }
                }while (control != true);
            } else {
                c1 = gui.register();
            }
            choiceMenu = gui.menuStart();
            c1 = manager.selectionMenu(choiceMenu,c1);
            gui.exit();
            e = r.nextLine();
        }while (e.equals("n"));
    }
}