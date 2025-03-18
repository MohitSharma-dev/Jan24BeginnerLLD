package DesignPatterns.Adapter.BankAPIs;

public class YesBankAPI {
    public int balanceCheck(){
        System.out.println("Checking the balance via Yes Bank");
        return 100;
    }

    public void transferMoney(int amount){
        System.out.println("Money has been transferred via Yes Bank");
    }
}
