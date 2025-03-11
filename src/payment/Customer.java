package payment;

import java.util.ArrayList;

public abstract class Customer {

    String name;
    ArrayList<String> paymentHistory;

    public Customer(String name)
    {
        this.name = name;
        paymentHistory = new ArrayList<>();
    }

    public abstract void displayCustomerInfo();

    public void makePayment(PaymentStrategy paymentStrategy, double amount)
    {
        paymentStrategy.pay(amount);

        paymentHistory.add(paymentStrategy.getPaymentDetails());
    }

    public void showPaymentHistory()
    {
        int counter = 1;

        System.out.println(name + "'s Payment History:");

        for(String detailString: paymentHistory)
        {
            System.out.println("Payment number " + counter + " :");
            String[] stringArray = detailString.split(",");
            for(String str: stringArray)
            {
                System.out.println(str);
            }
            counter++;
            System.out.println();
        }
    }
}
