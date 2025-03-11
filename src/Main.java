import payment.*;

public class Main {
    public static void main(String[] args)
    {
        //Creating Customers
        RegularCustomer customer1 = new RegularCustomer("Ilia Mohammadi");
        RegularCustomer customer2 = new RegularCustomer("Maryam Majidi");
        PremiumCustomer customer3 = new PremiumCustomer("Mahak Alaie");

        //Creating Payment Methods
        CreditCardPayment creditCardPayment = new CreditCardPayment("6219854651749586", "Mahak Alaie");
        PayPalPayment payPalPayment = new PayPalPayment("Mahak123@gmail.com");
        BitcoinPayment bitcoinPayment = new BitcoinPayment("bc1Q3er44yopb679");

        //Showing Customers' Names and Plans
        customer1.displayCustomerInfo();
        customer2.displayCustomerInfo();
        customer3.displayCustomerInfo();

        //Making Payments
        customer1.makePayment(creditCardPayment, 100000);
        customer1.makePayment(payPalPayment, 200000);
        customer2.makePayment(bitcoinPayment, 300000);
        customer2.makePayment(creditCardPayment, 750000);
        customer3.makePayment(payPalPayment, 450000);
        customer3.makePayment(bitcoinPayment, 900000);

        //Showing History of Payments
        customer1.showPaymentHistory();
        customer2.showPaymentHistory();
        customer3.showPaymentHistory();
    }
}