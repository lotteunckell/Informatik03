package lab_06.aufgabe_dekorierer;

public class Sahne extends Topping {

  public Sahne(Eis eis) {
    super(eis);
  }

  public double calcPrice() {
    return eis.calcPrice() + 1.00;
  }
}
