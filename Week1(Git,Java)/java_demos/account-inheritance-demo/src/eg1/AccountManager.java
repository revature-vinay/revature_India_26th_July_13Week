package eg1;

public class AccountManager {

	public static void main(String[] args) {
		String accountNumber = "01302343794";
		double balance = 5000;
		
		System.out.println("Account Statement of " + accountNumber);
		System.out.println("Initial Balance: " + balance);
		
		System.out.println();
		System.out.println("--------------------------");
		System.out.println("Type  Transaction  Balance");
		System.out.println("--------------------------");
		
		/*char transactionType = 'W';
		double transactionAmount = 2000;
		balance = balance - transactionAmount;
		System.out.printf("%4c %12.2f %8.2f\n", transactionType, transactionAmount, balance);

		transactionType = 'D';
		transactionAmount = 20000;
		balance = balance + transactionAmount;
		System.out.printf("%4c %12.2f %8.2f\n", transactionType, transactionAmount, balance);

		transactionType = 'D';
		transactionAmount = 500;
		balance = balance + transactionAmount;
		System.out.printf("%4c %12.2f %8.2f\n", transactionType, transactionAmount, balance);

		transactionType = 'W';
		transactionAmount = 15000;
		balance = balance - transactionAmount;
		System.out.printf("%4c %12.2f %8.2f\n", transactionType, transactionAmount, balance);

		transactionType = 'W';
		transactionAmount = 10000;
		balance = balance - transactionAmount;
		System.out.printf("%4c %12.2f %8.2f\n", transactionType, transactionAmount, balance);*/
		balance = transaction('W', 2000, balance);
		balance = transaction('D', 20000, balance);
		balance = transaction('D', 500, balance);
		balance = transaction('W', 15000, balance);
		balance = transaction('W', 10000, balance);
		
		System.out.println("--------------------------");
	}
	
	public static double transaction(char transactionType, double transactionAmount, double balance) {
		if (transactionType == 'D') {
			balance += transactionAmount;
		}
		
		if (transactionType == 'W') {
			if (balance - transactionAmount >= 0) {
				balance -= transactionAmount;
			}
		}
		
		System.out.printf("%4c %12.2f %8.2f\n", transactionType, transactionAmount, balance);
		return balance;
	}

}
