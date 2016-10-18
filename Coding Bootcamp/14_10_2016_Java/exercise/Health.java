public class Health extends Insurance
{

    protected int expense;

    Health(int expense, int customersCode, int duration)
    {
        super(customersCode, duration);
        this.expense = expense;
    }
    public void setExpense(int expense)
    {
        this.expense = expense;
    }
    public int getExpense()
    {
        return this.expense;
    }
    public int insurance_cost(Customer [] customers)
    {
        if (customers[customersCode].getSex().equals("male"))
        {
            return super.insurance_cost() + 50 + 7 * (2016 - customers[this.customersCode].getYearOfBirth());
        }
        else
        {
            return super.insurance_cost() + 7 * (2016 - customers[customersCode].getYearOfBirth());
        }
    }
    public String toString(Customer[] customers)
    {
        return "The customer with id: " + getCustomersCode() + " has a health insurance with insurance id: " + getInsuranceCode() + " ,duration: " + getDuration() + " and the cost is: " +insurance_cost(customers);
    }
}
