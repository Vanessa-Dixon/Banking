package com.company;

public class Main {

    public static void main(String[] args) {

        Bank bank = new Bank("Bank of Sooners");
        bank.addBranch("Adelaide");

        bank.addCustomer("Adelaide","Vanessa", 1.75 );
        bank.addCustomer("Adelaide","Derek", 18500.02 );
        bank.addCustomer("Adelaide","John", 1752.00 );

        bank.addBranch("Georgia");
        bank.addCustomer("Georgia", "Ben", 2.00);

        bank.addCustomerTransaction("Georgia", "Ben", 5.00);

        bank.listCustomers("Adelaide", false);
    }
}
