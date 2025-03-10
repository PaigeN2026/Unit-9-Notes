/* Car is a SUBCLASS (CHILD)
 * that INHERITS from Vehicle
 * "Car IS-A type of Vehicle"
 */
public class Car extends Vehicle {
    // 1. INSTANCE VARIABLES 
    // Attributes that are SPECIFIC to a Car, but not all Vehicles
    private int numSeats;
    private String brand;

    // Constructors are NOT inherited!!
    public Car() {
        super(); // CALL to the superclass
        this.numSeats = 5;
        this.brand = "Toyota";
    }

    public Car(int numWheels, double avgSpeed, String color, int numSeats, String brand) {
        // Must call super() FIRST before setting up other variables 
        super(numWheels, avgSpeed, color);
        this.numSeats = numSeats;
        this.brand = brand;
    }
    // Example of OVERRIDING a parent class method
    public String toString() {
        return ("Car[numWheels: " + this.getNumWheels() +
        ", avgSpeed: " + this.getAvgSpeed() +
        ", color: " + this.getColor() + 
        ", numSeats: " + this.numSeats +
        ", brand: " + this.brand + "]");
    }

    // OVERRIDE parent method 
    public void makeNoise() {
        // Use super.method() to call the parent's method FIRST
        super.makeNoise();
        // Then add on to that behavior
        System.out.print("Beep beep... 💨");
    }
}