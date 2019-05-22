package lab_04;

public class Main {
    public static void main(String[] args){
        MountainbikeBuilder mb = new MountainbikeBuilder();
        BikeDirector director = new BikeDirector(mb);
        director.construct(10, "blue", 2, 4, 15);
        System.out.println(mb.getResult());

        RacerBuilder rb = new RacerBuilder();
        BikeDirector director2 = new BikeDirector(rb);
        director2.construct(5, "red", 1, 2, 20);
        System.out.println(rb.getResult());
    }
}
