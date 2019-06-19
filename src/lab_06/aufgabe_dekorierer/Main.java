package lab_06.aufgabe_dekorierer;

public class Main {

  public static void main(String[] args) {
    Eis eis1 = new Schokostreusel(new Sahne(new Softeis()));
    System.out.println(eis1.calcPrice());
    System.out.println(new Mandelsplitter(new Kugeleis()).calcPrice());
  }
}
