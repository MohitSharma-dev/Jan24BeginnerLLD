package DesignPatterns.Adapter;

public class BillPayment {
    public void payBill(int amount, BankAPI bankAPI){
        if(amount <= bankAPI.checkBalance()){
            System.out.println("Successfully paid bill!");
        } else {
            System.out.println("Insufficient funds!");
        }
    }
}
