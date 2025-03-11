package payment;

public class PayPalPayment implements PaymentStrategy {

    String email;

    public PayPalPayment(String email)
    {
        this.email = email;
    }

    @Override
    public void pay(double amount)
    {
        String paymentDetails = getPaymentDetails();
        String[] stringArray = paymentDetails.split(",");

        System.out.println("Payment:");
        System.out.println("Paid Amount: " + amount);
        System.out.println("Method and Details of payment:");
        for(String str: stringArray)
        {
            System.out.println("\t" + str);
        }
        System.out.println();
    }

    @Override
    public String getPaymentDetails()
    {
        return "PayPalPayment" + "," + email;
    }
}
