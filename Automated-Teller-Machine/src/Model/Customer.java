package Model;

public class Customer {
    private String Name;
    private String SurName;
    private int Balance;

    public String getName(){
        return this.Name;
    }

    public String getSurName(){
        return this.SurName;
    }

    public int getBalance(){
        return this.Balance;
    }

    public void setName(String name){
        Name = name;
    }

    public void setSurName(String surName){
        SurName = surName;
    }

    public void setBalance(int balance) {
        Balance = balance;
    }
}
