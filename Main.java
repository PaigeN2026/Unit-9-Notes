import java.util.ArrayList;

public class Main {

   public static void main(String []args) {
      // Use the default/no-arg constructors 
      Vehicle v1 = new Vehicle();
      Car c1 = new Car();
      // Use the parameterized constructors
      Vehicle v2 = new Vehicle(3, 10.0, "White");
      Car c2 = new Car(4, 65.0, "Banana", 5, "Nissan");
      
      // Test toString methods
      System.out.println(v1);
      System.out.println(v2);
      System.out.println("-------");
      System.out.println(c1);
      System.out.println(c2);

      // Test behaviors methods
      v1.makeNoise();
      c1.makeNoise();
      
      // POLYMORPHISM example:
      // all classes in a hierarchy can be treated as instances of the TOP (most super) type

      Vehicle v3 = new Vehicle();
      Vehicle c3 = new Car(); // Car IS-A type of Vehicle
      // Car bad = new Vehicle(); DOES NOT WORK!!
      Vehicle scoot = new Scooter();
      Vehicle moto = new Motorcycle();
      Vehicle convertible = new Convertible();

      // POLYMORPHISM example:
      // Can store any subclass in a superclass-type collections
      ArrayList<Vehicle> vehicleList = new ArrayList<Vehicle>();
      vehicleList.add(v1);
      vehicleList.add(v2);
      vehicleList.add(v3);
      vehicleList.add(c1);
      vehicleList.add(c2);
      vehicleList.add(c3);
      vehicleList.add(moto);
      vehicleList.add(scoot);
      System.out.println(vehicleList);






      


   }
}
