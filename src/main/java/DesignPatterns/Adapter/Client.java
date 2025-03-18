package DesignPatterns.Adapter;

import DesignPatterns.Adapter.BankAPIAdapter.ICICIBankAdapter;
import DesignPatterns.Adapter.BankAPIAdapter.YesBankAPIAdapter;
import DesignPatterns.Adapter.BankAPIs.ICICIBankAPI;

import java.util.Scanner;

public class Client {
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Please enter the bank you want to use! [YesBank / ICICI]");
        String bankName = scanner.nextLine();

        BankAPI bankAPI = BankAPIFactory.getBankAPIByBankName(bankName);

        PhonePe phonePe = new PhonePe(bankAPI);
        phonePe.rechargeFastTag(60);
    }
}
