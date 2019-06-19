package ca.uwo.csd.cs2212.USERNAME;

public class BankAccount2 {

  private double balance;

  public BankAccount2(double balance) {
    this.balance = balance;
  }

  public double debit(double amount) {
    if (balance < amount) {
      amount = balance;
    }

    balance -= amount;
    return amount;
  }

}
