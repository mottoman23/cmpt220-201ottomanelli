package lab8;

import java.sql.Date;

public class Account {
	private int id;
	protected double balance;
	private static double interestRate;
	private Date dateCreated;

	// Constructors
	/** Creates a default account */
	Account() {
		this(0, 0); 
	}

	/** Creates an account with the specified id and initial balance */
	Account(int id, double balance) {
		this.id = id;
		this.balance = balance;
		interestRate = 0;
		dateCreated = new Date(id);
	}

	// Mutator methods
	/** Set id */
	public void setId(int id) {
		this.id = id;
	}

	/** Set balance */
	public void setBalance(double balance) {
		this.balance = balance;
	}

	/** Set interestRate */
	public void setInterestRate(double interestRate) {
		this.interestRate = interestRate;
	}

	// Accessor methods
	/** Return id */
	public int getId() {
		return id;
	}

	/** Return balance */
	public double getBalance() {
		return balance;
	}

	/** Return interestRate */
	public double getInterestRate() {
		return interestRate;
	}

	/** Return dateCreated */
	public String getDateCreated() {
		return dateCreated.toString();
	}

	/** Return monthly interest rate */
	public double getMonthlyInterestRate() {
		return interestRate / 12;
	}

	// Methods
	/** Return monthly interest */
	public double getMonthlyInterest() {
		return balance * (getMonthlyInterestRate() / 100);
	}

	/** Decrease balance by amount */
	public void withdraw(double amount) {
		balance -= amount;
	}

	/** Increase balance by amount */
	public void deposit(double amount) {
		balance += amount;
	}

	/** Return a String decription of Account class */
	public String toString() {
		return "\nAccount ID: " + id + "\nDate created: " + getDateCreated()
			+ "\nBalance: $" + String.format("%.2f", balance) + 
			"\nMonthly interest: $" + String.format("%.2f", getMonthlyInterest());
	}
}