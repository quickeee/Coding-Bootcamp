public class Life extends Insurance {

	int amount;

	Life(int amount, int customersCode, int duration) {
		super(customersCode, duration);
		this.amount = amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

	public int getAmount() {
		return this.amount;
	}

	public int insurance_cost() {
		return super.insurance_cost() + 5 * (2016 - Customer.customers[this.customersCode].getYearOfBirth());
	}

	public String toString() {
		return "The customer with id: " + getCustomersCode() + " has a life insurance with id: " + getInsuranceCode()
				+ " with duration: " + getDuration() + " and the cost is: " + this.insurance_cost();
	}
}
