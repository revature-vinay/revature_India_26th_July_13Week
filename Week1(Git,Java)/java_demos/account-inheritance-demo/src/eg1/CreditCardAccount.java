package eg1;

public class CreditCardAccount extends Account {

	public CreditCardAccount(String accountNumber, double balance, Transaction[] transactions) {
		super(accountNumber, balance, transactions);
	}

	public void withdraw(double transactionAmount) {
		super.withdraw(transactionAmount);
		if (transactionAmount >= 5000) {
			balance += 100;
		}
	}
}
