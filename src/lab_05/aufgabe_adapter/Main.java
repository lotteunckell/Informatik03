package lab_05.aufgabe_adapter;

public class Main {
    public static void main(String[] args) {
        IPayment payment = new WebshopPayment();
        payment.pay(12);
        payment = new PayPalAdapter();
        payment.pay(13);
    }
}
