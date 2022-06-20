package assignment;

public class BankAccount2 {
	String accountHolderName;
	private long accountNumber = 347;
	private double balance;
	private double intrest;

	public BankAccount2(String accountHolderName) {
		this.balance = 0;
		this.accountNumber = accountNumber++;
	}

	public static void PersonalInformation(long accountNumber, double balance, String accountHolderName) {
		System.out.println("Account Holder name:" + accountHolderName);
		System.out.println("Account Number:" + accountNumber);
		System.out.println("Current Balance:" + balance);
	}


	public BankAccount2(String accountHolderName, double balance) {
		this.accountHolderName = accountHolderName;
		this.balance = balance;
		accountNumber++;
		//PersonalInformation(accountNumber, balance, accountHolderName);
	}

	public void withDraw(double withDrawAmount, double fees) {

		double newBalance = balance - withDrawAmount - fees;
		balance = newBalance;
		PersonalInformation(accountNumber, balance, accountHolderName);
		System.out.println("WithDraw Amount:"+ withDrawAmount);

	}

	public void deposit(double deposit) {
		double p, t, r;
		p = balance + deposit;
		t = 5;
		r = 2;
		double intrest = p * t * r / 100;
		double newBalance = balance + deposit + intrest;
		balance = newBalance;
		System.out.println("Intrest after deposit: " + intrest);
		PersonalInformation(accountNumber, balance, accountHolderName);

	}

	public static void main(String[] args) {

		System.out.println("Initial Balance:");
		BankAccount2 obj = new BankAccount2("Khagendra Bhattarai", 400);

		System.out.println("==================");
		System.out.println("Blance after withdraw:");
		obj.withDraw(200, 5);
		System.out.println("====================");

		System.out.println("Balance after deposit:");

		obj.deposit(60);
		System.out.println("++++++++++++++++++++++");
		System.out.println("Initial Balance:");
		BankAccount2 ob = new BankAccount2("Nabin", 400);

		System.out.println("==================");
		System.out.println("Blance after withdraw:");
		ob.withDraw(300, 35);
		System.out.println("====================");

		System.out.println("Balance after deposit:");

		ob.deposit(80);

	}

}
