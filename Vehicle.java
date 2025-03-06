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

}