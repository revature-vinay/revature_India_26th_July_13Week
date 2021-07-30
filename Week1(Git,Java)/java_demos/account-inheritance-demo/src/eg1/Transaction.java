package eg1;

public class Transaction {
	private char type;
	private double amount;

	public Transaction(char type, double amount) {
		this.type = type;
		this.amount = amount;
	}
	
	public void printTransaction(double balance) {
		System.out.printf("%4c %12.2f %8.2f\n", type, amount, balance);
	}
	
	public char getType() {
		return type;
	}

	public double getAmount() {
		return amount;
	}

	public static void main(String args[]) {
		/*Transaction transaction1 = new Transaction('W', 2000);
		Transaction transaction2 = new Transaction('D', 20000);
		Transaction transaction3 = new Transaction('D', 500);
		Transaction transaction4 = new Transaction('W', 15000);
		Transaction transaction5 = new Transaction('W', 10000);
		
		int[] age = { 10, 20, 25, 23 };
		Transaction[] transactions = new Transaction[5];
		transactions[0] = transaction1;
		transactions[1] = transaction2;
		transactions[2] = transaction3;
		transactions[3] = transaction4;
		transactions[4] = transaction5;*/
		
		Transaction[] transactions = {
				new Transaction('W', 2000),
				new Transaction('D', 20000),
				new Transaction('D', 500),
				new Transaction('W', 15000),
				new Transaction('W', 10000)
		};
		for (Transaction transaction : transactions) {
			transaction.printTransaction(5000);
		}
		
		// array
		// loops
	}
}
