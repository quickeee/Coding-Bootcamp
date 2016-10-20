public class Insurance {

	public int customersCode;
	private static int counter = 0;
	protected int insuranceCode;
	protected int duration;
	public static Insurance[] insurances = new Insurance[6];

	Insurance(int customersCode, int duration) {
		this.insuranceCode = counter;
		this.customersCode = customersCode;
		this.duration = duration;
		counter += 1;
		insurances[counter - 1] = this;
	}

	public void setDuration(int duration) {
		this.duration = duration;
	}

	public int getCustomersCode() {
		return this.customersCode;
	}

	public int getInsuranceCode() {
		return this.insuranceCode;
	}

	public int getDuration() {
		return this.duration;
	}

	public String toString() {
		return "The customer with id: " + getCustomersCode() + " has an insurance with id: " + getInsuranceCode()
				+ " with duration: " + getDuration() + " and the cost is: " + this.insurance_cost();
	}

	public int insurance_cost() {
		return 100;
	}

	public void printInsurances(Customer[] customers) {
		int i;
		for (i = 0; i <= Insurance.insurances.length; i++) {
			System.out.println(customers[i].toString());
		}
	}

	public void printInsurance(int insuranceCode, Insurance[] insurances) {
		System.out.println(insurances[insuranceCode].toString());
	}
}
