public class Health extends Insurance {

	protected int expense;

	Health(int expense, int customersCode, int duration) {
		super(customersCode, duration);
		this.expense = expense;
		this.cost = insurance_cost();
	}

	public void setExpense(int expense) {
		this.expense = expense;
	}

	public int getExpense() {
		return this.expense;
	}

	public int insurance_cost() {
		if (TestInsurance.customers[customersCode].getSex().equals("male")) {
			return super.insurance_cost() + 50
					+ 7 * (2016 - TestInsurance.customers[this.customersCode].getYearOfBirth());
		} else {
			return super.insurance_cost() + 7 * (2016 - TestInsurance.customers[customersCode].getYearOfBirth());
		}
	}

	public String toString() {
		return "The customer with id: " + getCustomersCode() + " has a health insurance with id: " + getInsuranceCode()
				+ " with duration: " + getDuration() + " and the cost is: " + cost;
	}
}
