package lab8;

public class Problem11_3 {
	public static void main(String[] args) {
		Account account = new Account(1122, 20000);
		SavingsAccount savings = new SavingsAccount(1001, 20000);
		CheckingAccount checking = new CheckingAccount(1004, 20000, -20);
		// Set annual interest rate of 4.5%
		account.setInterestRate(4.5);
		savings.setInterestRate(4.5);
		checking.setInterestRate(4.5);

		// Withdraw $2,500
		account.withdraw(2500);
		savings.withdraw(2500);
		checking.withdraw(2500);

		// Deposit $3,000
		account.deposit(3000);
		savings.deposit(3000);
		checking.deposit(3000);

		// Invoke toString methods
		System.out.println(account.toString());
		System.out.println(savings.toString());
		System.out.println(checking.toString());
	}
}