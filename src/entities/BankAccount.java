package entities;

public class BankAccount {

	private int number;
	private String name;
	private double deposit;

	public BankAccount(int number, String name, double initialDeposit) {
		this.number = number;
		this.name = name;
		deposit(initialDeposit);
	}

	public BankAccount(int number, String name) {
		this.number = number;
		this.name = name;
	}

	public int getNumber() {
		return number;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getDeposit() {
		return deposit;
	}

	public void deposit(double amount) {
		this.deposit += amount;
	}

	public void withdraw(double amount) {
		this.deposit -= amount + 5;
	}

	@Override
	public String toString() {
		return "Account "
				+ getNumber()
				+ ", Holder: "
				+ getName()
				+ ", Balance: $ "
				+ String.format("%.2f", getDeposit());
	}

}
