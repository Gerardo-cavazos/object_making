public class Vehicle {
    protected int speed; // Accessible to subclasses
    private double fuel; // Only accessible within Vehicle

    public Vehicle(int speed, double fuel) {
        this.speed = speed;
        this.fuel = fuel;
    }

    public void start() {
        System.out.println("The vehicle has started.");
    }

    public void stop() {
        System.out.println("The vehicle has stopped.");
    }

    public final void displayFuel() {
        System.out.println("Fuel level: " + fuel + " liters");
    }

    // Getter and Setter for speed
    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    // Getter and Setter for fuel
    public double getFuel() {
        return fuel;
    }

    public void setFuel(double fuel) {
        this.fuel = fuel;
    }
}
