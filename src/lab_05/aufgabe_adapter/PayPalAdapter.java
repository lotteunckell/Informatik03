package lab_05.aufgabe_adapter;

public class PayPalAdapter implements IPayment {
    PayPalPayment payment;

    @Override
    public void pay(int amount) {
        payment = new PayPalPayment();
        if (payment.logIn("Someone", "aPassword42!")) {
            payment.setAmount(amount);
            payment.setRecipient("someoneelse@paypal.com");
            payment.confirm();
        }
    }
}
