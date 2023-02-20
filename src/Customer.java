package src;

import src.Bank.Bank;
import src.Bank.BankManager;

public class Customer {
  private String name;
  private Bank bank;

  public Customer(String name, int initialVault) {
    this.name = name;
    this.bank = new Bank(initialVault);
  }

  public static void main(String[] args) {
    Customer john = new Customer("John", 2000);
    BankManager bankManager = new BankManager();
    System.out.println(john.name);
    System.out.println(bankManager.readCustomerVault(john.bank));
  }
}
