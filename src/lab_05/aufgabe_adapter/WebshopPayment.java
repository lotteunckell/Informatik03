package lab_05.aufgabe_adapter;

public class WebshopPayment implements IPayment {

    @Override
    public void pay(int amount) {
        System.out.println("Your Payment of " + amount + " Euros via direct withdrawal from your account was received!");
    }
}
