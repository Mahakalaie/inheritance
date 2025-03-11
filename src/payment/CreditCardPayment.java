package payment;

public class CreditCardPayment implements PaymentStrategy {

    String cardNumber;
    String cardHolderName;

    public CreditCardPayment(String cardNumber, String cardHolderName)
    {
        this.cardNumber = cardNumber;
        this.cardHolderName = cardHolderName;
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
        return "CreditCardPayment" + "," + cardNumber + "," + cardHolderName;
    }
}

