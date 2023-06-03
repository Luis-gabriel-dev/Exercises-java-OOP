package entities;

public class AccountBank {

	private int number;
	public String holder;
	private double balance;

//default construct
	public AccountBank() {
	}

//custom constructor
	public AccountBank(int Number, String Holder, double initialDepositValue) {
		this.number = Number;
		this.holder = Holder;
		deposit(initialDepositValue);
	}

	public AccountBank(int number, String holder) {
		this.number = number;
		this.holder = holder;
	}

//get to private Holder
	public String getHolder() {
		return holder;
	}

//set to private Holder
	public void setHolder(String holder) {
		this.holder = holder;
	}

	public double getBalance() {
		return balance;
	}

	public void deposit(double amount) {
		balance += amount;
	}

	public void withdraw(double amount) {
		balance -= amount + 5.0;
	}

	public String toString() {
		return "Account " + number + ", Holder: " + holder + ", Balance: $ " + String.format("%.2f", balance);
	}

}
