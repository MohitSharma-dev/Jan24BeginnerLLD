package DesignPatterns.Adapter;

public class FastTagRecharge {
    public void recharge(int amount, BankAPI bankAPI){
        if(amount <= bankAPI.checkBalance()){
            System.out.println("Successfully recharged !");
        } else {
            System.out.println("Insufficient funds!");
        }
    }
}
