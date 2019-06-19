package lab_06.aufgabe_fassade.eis;


import java.text.DecimalFormat;

public class Eisverkäufer {
    int premium, standard, soft, wasser;
    double total;

    public Eisverkäufer() {
        clearBalance();
    }

    public String getIcecream(String order) {
        getNumbers(order);
        String result = "Here you go: \n";
        if (premium > 0) {
            KugeleisPremium kp = new KugeleisPremium();
            result += premium + " times Kugeleis Premium\n";
            total += premium * kp.calcPrice();
        }
        if (standard > 0) {
            KugeleisStandard ks = new KugeleisStandard();
            result += standard + " times Kugeleis Standard\n";
            total += standard * ks.calcPrice();
        }
        if (soft > 0) {
            Softeis s = new Softeis();
            result += soft + " times Softeis\n";
            total += soft * s.calcPrice();
        }
        if (wasser > 0) {
            Wassereis w = new Wassereis();
            result += wasser + " times Wassereis\n";
            total += wasser * w.calcPrice();
        }
        result += "Your total is: " + total + " Euros.";
        return result;
    }

    public String pay(double given) {
        if (given == total) {
            clearBalance();
            return "Thank you! Have a nice day.";
        }
        if (given < total) {
            total -= given;
            total = (float)((int)( total *100.0))/100.0;
            return "I'm sorry, that was not enough. You are still " + total + " short.";
        }
        clearBalance();
        return "Thank you! Here is your change: " + (given-total) + "\nHave a nice day.";
    }

    private void clearBalance() {
        premium = 0;
        standard = 0;
        soft = 0;
        wasser = 0;
        total = 0;
    }

    private void getNumbers(String order) {
        String[] ice = order.strip().toLowerCase().split(", ");
        for (String i : ice) {
            if (i.contains("premium")) premium++;
            if (i.contains("standard")) standard++;
            if (i.contains("soft")) soft++;
            if (i.contains("wasser")) wasser++;
        }
    }

}
