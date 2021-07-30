package eg1;

public class Account {
	
	protected String accountNumber;
	protected double balance;
	protected char type; // S - Savings Account; C - Credit Card Account; FD; RD; Demat Account
	protected Transaction[] transactions;
	
	public Account() {
		
	}
	
	public Account(String accountNumber, double balance, Transaction[] transactions) {
		this.accountNumber = accountNumber;
		this.balance = balance;
		this.type = type;
		this.transactions = transactions;
	}
	
	public void deposit(double transactionAmount) {
		balance += transactionAmount;
		/*if (type == 'S' && transactionAmount == 10000) {
			balance += 150;
		}*/
	}
	
	public void withdraw(double transactionAmount) {
		if (balance - transactionAmount >= 0) {
			balance -= transactionAmount;
		}
		/*if (type == 'C' && transactionAmount >= 5000) {
			balance += 100;
		}*/
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
				new Transaction('D', 10000)
		};
		Account savingsAccount = new SavingsAccount("01302343794", 5000, transactions);
		//savingsAccount.printStatement();

		System.out.println();
		Transaction[] cardTransactions = {
				new Transaction('W', 2000),
				new Transaction('D', 2000),
				new Transaction('W', 5000)
		};
		Account creditCardAccount = new CreditCardAccount("5544 3322 1100 9988", 20000, cardTransactions);
		//creditCardAccount.printStatement();
		
		Account[] accounts = { savingsAccount, creditCardAccount };
		for (Account account : accounts) {
			account.printStatement();
		}
	}

}
