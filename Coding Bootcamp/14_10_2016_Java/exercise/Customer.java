public class Customer {
	private static int counter = 0;
	public final int customersCode;
	private String name;
	private int yearOfBirth;
	private String sex;

	public Customer(String name, int yearOfBirth, String sex) {
		this.name = name;
		this.yearOfBirth = yearOfBirth;
		this.sex = sex;
		this.customersCode = counter;
		counter += 1;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setYearOfBirth(int yearOfBirth) {
		this.yearOfBirth = yearOfBirth;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public String getName() {
		return this.name;
	}

	public int getCustomersCode() {
		return this.customersCode;
	}

	public int getYearOfBirth() {
		return this.yearOfBirth;
	}

	public String getSex() {
		return this.sex;
	}

	public String toString() {
		return ("Customer's name: " + getName() + " Customer's code: " + getCustomersCode()
				+ " Customer's year of birth: " + getYearOfBirth() + " Customer's sex: " + getSex());
	}
}
