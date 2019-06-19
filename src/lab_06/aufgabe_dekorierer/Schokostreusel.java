package lab_06.aufgabe_dekorierer;

public class Schokostreusel extends Topping {

  public Schokostreusel(Eis eis) {
    super(eis);
  }

  public double calcPrice() {
    return eis.calcPrice() + 0.50;
  }
}
