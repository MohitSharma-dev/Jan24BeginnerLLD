package DesignPatterns.Adapter.BankAPIAdapter;

import DesignPatterns.Adapter.BankAPI;
import DesignPatterns.Adapter.BankAPIs.ICICIBankAPI;

public class ICICIBankAdapter implements BankAPI {
    private ICICIBankAPI iciciBankAPI = new ICICIBankAPI();
    @Override
    public int checkBalance() {
        return iciciBankAPI.getBalance();
    }

    @Override
    public void transfer(int amount) {
        iciciBankAPI.moneyTransfer(50);
    }
}
