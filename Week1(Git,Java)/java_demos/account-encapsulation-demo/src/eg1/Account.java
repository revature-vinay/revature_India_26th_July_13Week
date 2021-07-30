package eg1;

public class Account {
	
	private String accountNumber;
	private double balance;
	private Transaction[] transactions;
	
	public Account(String accountNumber, double balance, Transaction[] transactions) {
		this.accountNumber = accountNumber;
		this.balance = balance;
		this.transactions = transactions;
	}
	
	public void deposit(double transactionAmount) {
		balance += transactionAmount;
	}
	
	public void withdraw(double transactionAmount) {
		if (balance - transactionAmount >= 0) {
			balance -= transactionAmount;
		}
	}
	
	public void printStatement() {
		System.out.println("Account Statement of " + accountNumber);
		System.out.println("Initial Balance: " + balance);
		
		System.out.println();
		System.out.println("--------------------------");
		System.out.println("Type  Transaction  Balance");
		System.out.println("--------------------------");
		
		for (Transaction transaction : transactions) {
			if (transaction.getType() == 'D') {
				deposit(transaction.getAmount());
			}
			if (transaction.getType() == 'W') {
				withdraw(transaction.getAmount());
			}
			transaction.printTransaction(balance);
		}
		System.out.println("--------------------------");
	}
	
	public static void main(String args[]) {
		Transaction[] transactions = {
				new Transaction('W', 2000),
				new Transaction('D', 20000),
				new Transaction('D', 500),
				new Transaction('W', 15000),
				new Transaction('W', 10000)
		};
		Account account = new Account("01302343794", 5000, transactions);
		account.printStatement();
	}

}
