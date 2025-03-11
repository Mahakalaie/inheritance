package payment;

public class RegularCustomer extends Customer{

    public RegularCustomer(String name)
    {
        super(name);
    }

    @Override
    public void displayCustomerInfo()
    {
        System.out.println("Customer's Name:\t" + name);
        System.out.println("Customer's Plan:\tRegular Plan");
        System.out.println();
    }
}
