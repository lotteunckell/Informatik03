package lab_06.aufgabe_dekorierer;

abstract class Topping implements Eis {

  public Eis eis;

  public Topping(Eis eis) {
    this.eis = eis;
  }
}
