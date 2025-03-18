package DesignPatterns.Adapter;

import DesignPatterns.Adapter.BankAPIAdapter.ICICIBankAdapter;
import DesignPatterns.Adapter.BankAPIAdapter.YesBankAPIAdapter;

public class PhonePe {
    private BankAPI bankAPI;
    private FastTagRecharge fastTagRecharge;
    private BillPayment billPayment;

    public PhonePe(BankAPI bankAPI){
        this.bankAPI = bankAPI;
        fastTagRecharge = new FastTagRecharge();
        billPayment = new BillPayment();
    }

    public void rechargeFastTag(int amount){
        fastTagRecharge.recharge(50, bankAPI);
    }

    public void payBill(int amount){
        billPayment.payBill(amount, bankAPI);
    }
}
