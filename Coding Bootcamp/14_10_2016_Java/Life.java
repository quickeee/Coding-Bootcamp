public class Life extends Insurance {

    int amount;

    Life(int amount, int customersCode, int duration)
    {
        super(customersCode, duration);
        this.amount = amount;
    }

    public void setAmount(int amount)
    {
        this.amount = amount;
    }

    public int getAmount()
    {
        return this.amount;
    }
    public int insurance_cost(Customer [] customers)
    {
        return super.insurance_cost() + 5 * (2016 - customers[this.customersCode].getYearOfBirth());
    }
    public String toString(Customer[] customers)
    {
        return "The customer with id: " + getCustomersCode() + " has a life insurance with insurance id: " + getInsuranceCode() + " ,duration: " + getDuration() + " and the cost is: " +insurance_cost(customers);
    }
}
