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
      


   }
}
