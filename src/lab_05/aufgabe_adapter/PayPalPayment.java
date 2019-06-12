package lab_05.aufgabe_adapter;

public class PayPalPayment {
    private String username;
    private String password;
    private int amount;
    private String recipient;
    private boolean loggeIn;

    public PayPalPayment() {
        username = "Someone";
        password = "aPassword42!";
    }

    public boolean logIn(String username, String password) {
        return username.equals(this.username) && password.equals(this.password);
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public void setRecipient(String recipient) {
        this.recipient = recipient;
    }

    public void confirm() {
        System.out.println("Your Payment of " + amount + " Euros via PayPal to " + recipient + " was received!");
    }
}
