package lab8;

public class SavingsAccount extends Account {
		
		/** Construct a default CheckingAccount object */
		public SavingsAccount() {
			super();
		}

		/** Construct a SavingsAccount with specified id, balance */
		public SavingsAccount(int id, double balance) {
			super();
		}

		/** Decrease balance by amount */
		public void withdraw(double amount) {
			if (amount < getBalance()) {
				setBalance(getBalance() - amount);
			}
			else
				System.out.println(
					"Error! Savings account overdrawn transtaction rejected");
		}

		public void setBalance(double d) {
			this.balance = balance;
			
		}

		public double getBalance() {
			// TODO Auto-generated method stub
			return 0;
		}

		public void setInterestRate(double d) {
			// TODO Auto-generated method stub
			
		}

		public void deposit(int i) {
			// TODO Auto-generated method stub
			
		}
	}