
package entities;

public class businessAcount extends Account {

	private Double loanLimit;

	public businessAcount() {
	}

	public businessAcount(Integer number, String name, Double balance, Double loanLimit) {
		super(number, name, balance);
		this.loanLimit = loanLimit;
	}

	public Double getLoanLimit() {
		return loanLimit;
	}

	public void setLoanLimit(Double loanLimit) {
		this.loanLimit = loanLimit;
	}

	public void loan(Double amount) {
		if (amount <= loanLimit) {
			balance += amount - 10.00;
		}
	}

}
