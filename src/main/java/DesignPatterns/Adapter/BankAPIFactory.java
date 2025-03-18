package DesignPatterns.Adapter;

import DesignPatterns.Adapter.BankAPIAdapter.ICICIBankAdapter;
import DesignPatterns.Adapter.BankAPIAdapter.YesBankAPIAdapter;

public class BankAPIFactory {
    public static BankAPI getBankAPIByBankName(String bankName) {
        BankAPI bankAPI = null;
        if(bankName.equals("ICICI")) {
            bankAPI = new ICICIBankAdapter();
        } else if (bankName.equals("YesBank")) {
            bankAPI = new YesBankAPIAdapter();
        }
        return bankAPI;
    }
}
