package lab_04;

public class BikeDirector {
   private BikeBuilder builder;

   public BikeDirector(BikeBuilder builder) {
        this.builder = builder;
    }

    public void construct(int FrameWeight,String FrameColor, int TireSize, int TireStrength, int gears) {
      IFrame frame = builder.buildFrame(FrameWeight, FrameColor);
      IGearShfit gearShift = builder.buildGearShift(gears);
      ITire tire = builder.buildTires(TireSize, TireStrength);
       builder.buildBike(tire, frame, gearShift);
    }
}
