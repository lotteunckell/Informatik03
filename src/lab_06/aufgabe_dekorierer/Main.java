package lab_06.aufgabe_dekorierer;

public class Main {

  public static void main(String[] args) {
    Eis eis1 = new Schokostreusel(new Sahne(new Softeis()));
    System.out.println("Softeis with Sahne and Schokostreusel: " + eis1.calcPrice() + " Euros");
    System.out.println("KugeleisStandard with Mandelsplitter: " + new Mandelsplitter(new KugeleisStandard()).calcPrice() + " Euros");
    System.out.println("KugeleisPremium with Schokostreusel: " + new Schokostreusel(new KugeleisPremium()).calcPrice() + " Euros");
    System.out.println("Wassereis: " + new Wassereis().calcPrice() + " Euros");
  }
}
