package src.Bank;

public class Bank {
  protected int vault = 0;

  public Bank(int initialVault) {
    this.vault = initialVault;
  }

  protected int getVault() {
    return vault;
  }

  protected void setVault(int vault) {
    this.vault = vault;
  }
}
