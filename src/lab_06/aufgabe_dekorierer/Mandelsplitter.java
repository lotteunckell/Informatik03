package lab_06.aufgabe_dekorierer;

public class Mandelsplitter extends Topping {

  public Mandelsplitter(Eis eis) {
    super(eis);
  }

  public double calcPrice() {
    return eis.calcPrice() + 0.60;
  }
}
