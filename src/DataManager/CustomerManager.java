package DataManager;

import Data.data;
import Model.Customer;

import java.util.ArrayList;
import java.util.List;

public class CustomerManager {
    public static boolean loginControl(String name, String surname){
        boolean control = false;

        for (Customer c:data.customerList) {
            if (c.getName().equals(name) && c.getSurName().equals(surname) ){
                System.out.println("Hello " + name);
                control = true;
                break;
            }
        }
        return control;
    }

    public static List<String> getUserData(String name, String surname){
        List<String> user = new ArrayList<String>();

        for (Customer c :data.customerList) {
            if (c.getName().equals(name) && c.getSurName().equals(surname) ){
                user.add(name);
                user.add(c.getName());
                user.add(String.valueOf(c.getBalance()));
            }
        }
        return user;
    }

    public static void updateUser(Customer c){
        for (Customer user :data.customerList) {
            if (user.getName().equals(c.getName()) && user.getSurName().equals(c.getSurName()) ){
                user.setName(c.getName());
                user.setSurName(c.getSurName());
                user.setBalance(c.getBalance());
            }
        }
    }

}
