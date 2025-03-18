package DesignPatterns.Adapter.BankAPIAdapter;

import DesignPatterns.Adapter.BankAPI;
import DesignPatterns.Adapter.BankAPIs.YesBankAPI;

public class YesBankAPIAdapter implements BankAPI {
    private YesBankAPI yesBankAPI = new YesBankAPI();
    @Override
    public int checkBalance() {
        return yesBankAPI.balanceCheck();
    }

    @Override
    public void transfer(int amount) {
        yesBankAPI.transferMoney(amount);
    }
}
