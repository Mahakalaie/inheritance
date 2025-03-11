package payment;

public class BitcoinPayment implements PaymentStrategy{

    String walletAddress;

    public BitcoinPayment(String walletAddress)
    {
        this.walletAddress = walletAddress;
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
        return "BitcoinPayment" + "," + walletAddress;
    }
}
