public class Main {
    public static void main(String[] args) {
        // Create and test a Car object
        Car myCar = new Car(120, 40.5, 4);
        myCar.start();
        myCar.displayFuel();
        myCar.honk();

        System.out.println();

        // Create and test a Bicycle object
        Bicycle myBike = new Bicycle(25, 0.0, true);
        myBike.start();
        myBike.displayFuel();
        myBike.ringBell();

        System.out.println();

        // Testing access modifiers and setters
        // Uncommenting below line would cause error due to private access:
        // System.out.println(myCar.fuel); 

        // Proper usage via getters:
        System.out.println("Car speed: " + myCar.getSpeed() + " km/h");
        System.out.println("Bike has bell: " + myBike.getHasBell());
    }
}
