/* Vehicle is a SUPERCLASS (PARENT)
 * Put the most GENERAL attributes + behaviors in this class definitions
 * Java classes can have MULTPLE CHILDREN, but ONLY ONE parent 
 */
public class Vehicle {
    // 1. INSTANCE VARIABLES 
    private int numWheels;
    private double avgSpeed;
    private String color;

    // 2. CONSTRUCTORS
    // Methods to INITIALIZE all variables 
    public Vehicle() {
        this.numWheels = 4;
        this.avgSpeed = 60.0;
        this.color = "Silver";
    }

    // Constructor with formal parameters
    public Vehicle(int numWheels, double avgSpeed, String color) {
        // INITIALIZE to passed arguements
        this.numWheels = numWheels;
        this.avgSpeed = avgSpeed;
        this.color = color;
    }

    // 3. METHODS

    // toString method will get called when you pass an object to a print statement 
    public String toString() {
        return ("Vehicle[numWheels: " + this.numWheels +
        ", avgSpeed: " + this.avgSpeed +
        ", color: " + this.color + "]");
    }

    // ACCESSPR (GETTER) METHODS
    public int getNumWheels() {
        return this.numWheels;
    }

    public double getAvgSpeed() {
        return this.avgSpeed;
    }

    public String getColor() {
        return this.color;
    }

    // Behavior methods (can be OVERRIDDEN in child class)
    public void makeNoise() {
        System.out.println("Vroom Vroom... 💨");
    }
}