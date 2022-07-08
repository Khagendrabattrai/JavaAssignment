package assignment;

public class BankAccount2 {
	String accountHolderName;
	private static int accountNumber = 347;
	private double balance;

	public BankAccount2(String accountHolderName) {
		this.accountHolderName = accountHolderName;
		this.balance = 0;
		accountNumber++;
	}

	public BankAccount2(String accountHolderName, double balance) {
		this.accountHolderName = accountHolderName;
		this.balance = balance;
		accountNumber++;
	}

	public void displayInformation() {
		System.out.println("Account Holder name:" + accountHolderName);
		System.out.println("Account Number:" + accountNumber);
		System.out.println("Current Balance:" + balance);
	}

	public void withDraw(double withDrawAmount) {
		balance = balance - withDrawAmount;
		displayInformation();
		System.out.println("WithDraw Amount:" + withDrawAmount);
	}

	public void withDraw(double withDrawAmount, double fees) {
		balance = balance - withDrawAmount - fees;
		displayInformation();
		System.out.println("WithDraw Amount:" + withDrawAmount);
	}

	public void deposit(double deposit) {
		double newBalance = balance + deposit;
		balance = newBalance;
		displayInformation();
	}

	public void deposit(double deposit, double interest) {
		double newBalance = balance + deposit + ((balance * interest) / 100);
		balance = newBalance;
		displayInformation();
	}

	public static void main(String[] args) {
		System.out.println("Initial Balance:");
		BankAccount2 obj = new BankAccount2("Khagendra Bhattarai", 200);

		System.out.println("==================");
		System.out.println("Blance after withdraw:");
		obj.withDraw(200, 5);
		System.out.println("====================");

		System.out.println("Balance after deposit:");

		obj.deposit(60);
		System.out.println("++++++++++++++++++++++");
		System.out.println("Initial Balance:");
		BankAccount2 ob = new BankAccount2("Nabin", 600);

		System.out.println("==================");
		System.out.println("Blance after withdraw:");
		ob.withDraw(300, 35);
		System.out.println("====================");

		System.out.println("Balance after deposit:");

		ob.deposit(80);

	}

}
