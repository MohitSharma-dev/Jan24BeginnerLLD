package DesignPatterns.Adapter.BankAPIs;

public class ICICIBankAPI {
    public int getBalance(){
        System.out.println("Balance is checked via ICICI Bank");
        return 100;
    }

    public void moneyTransfer(int amount){
        System.out.println("Money transfer via ICICI Bank");
    }
}
