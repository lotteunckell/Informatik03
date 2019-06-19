package lab_06.aufgabe_fassade;

import lab_06.aufgabe_fassade.eis.Eisverkäufer;

public class Main {
    public static void main(String[] args) {
        Eisverkäufer ev = new Eisverkäufer();
        System.out.println(ev.getIcecream("Kugeleis Premium Himbeere, Softeis Joghurt, Softeis Schoko"));
        System.out.println(ev.pay(0));
        System.out.println(ev.pay(3.0));
        System.out.println(ev.pay(1.7));
    }
}
