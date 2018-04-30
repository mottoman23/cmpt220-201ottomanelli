package lab8;

public class CheckingAccount extends Account {
		// Data fields
		private double overdraftLimit;

		/** Construct a default CheckingAccount object */
		public CheckingAccount() {
			super();
			overdraftLimit = -20;
		}

		/** Construct a CheckingAccout with specified id, balance and overdraftLimit */
		public CheckingAccount(int id, double balance, double overdraftLimit) {
			super();
			this.overdraftLimit = overdraftLimit;
		}

		/** Set a new overdraft limit */
		public void setOverdraftLimit(double overdraftLimit) {
			this.overdraftLimit = overdraftLimit;
		}

		/** Return overdraft limit */
		public double getOverdraftLimit() {
			return overdraftLimit;
		}

		/** Decrease balance by amount */
		public void withdraw(double amount) {
			if (getBalance() - amount > overdraftLimit) {
				setBalance(getBalance() - amount);
			}
			else
				System.out.println("Error! Amount exceeds overdraft limit.");
		}

		public void setBalance(double d) {
			// TODO Auto-generated method stub
			
		}

		public double getBalance() {
			// TODO Auto-generated method stub
			return 0;
		}

		/** Return a String decription of CheckingAccount class */
		public String toString() {
			return super.toString() + "\nOverdraft limit: $" + 
			String.format("%.2f", overdraftLimit);
		}

		public void setInterestRate(double d) {
			// TODO Auto-generated method stub
			
		}

		public void deposit(int i) {
			// TODO Auto-generated method stub

		}
	}