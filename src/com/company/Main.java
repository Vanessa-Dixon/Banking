package com.company;

public class Main {

    public static void main(String[] args) {

        Bank bank = new Bank("Bank of Sooners");
        bank.addBranch("Adelaide");

        bank.addCustomer("Adelaide","Vanessa", 1.75 );
        bank.addCustomer("Adelaide","Derek", 18500.02 );
        bank.addCustomer("Adelaide","John", 1752.00 );

//        bank.addBranch("Georgia");
//        bank.addCustomer("Georgia", "Vanessa", 2.00);

        bank.addCustomerTransaction("Adelaide", "Derek", 5.00);
        bank.addCustomerTransaction("Adelaide", "John", 44.10);

        bank.listCustomers("Adelaide", false);

        if(!bank.addCustomerTransaction("Malborn", "Brain", 5.10)) {
            System.out.println("Error Melbourne branch");
        };
    }


}
