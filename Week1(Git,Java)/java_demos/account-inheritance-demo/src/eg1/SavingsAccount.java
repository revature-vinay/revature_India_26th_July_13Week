package eg1;

public class SavingsAccount extends Account {

	public SavingsAccount(String accountNumber, double balance, Transaction[] transactions) {
		super(accountNumber, balance, transactions);
	}

	public void deposit(double transactionAmount) {
		super.deposit(transactionAmount);
		if (transactionAmount == 10000) {
			balance += 150;
		}
	}
}
