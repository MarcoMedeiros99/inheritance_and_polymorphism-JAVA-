package entities;

public class Account {

	private Integer number;
	private String name;
	protected Double balance;
	
	public Account() {
	}

	public Account(Integer number, String name, Double balance) {
		this.number = number;
		this.name = name;
		this.balance = balance;
	}

	public Integer getNumber() {
		return number;
	}

	public String getName() {
		return name;
	}

	public Double getBalance() {
		return balance;
	}

	public void setNumber(Integer number) {
		this.number = number;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void withdraw(Double amount) {
		balance -= amount;
	}
	
	public void deposit(Double amount) {
		balance += amount;
	}
	
	
	
	
}
