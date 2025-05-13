package SingleTon;
class Singleton {
    // Step 1: Create a private static instance variable
    private static Singleton instance;

    // Step 2: Private constructor prevents direct object creation
    private Singleton() {
        System.out.println("Singleton instance created!");
    }

    // Step 3: Provide a static method to get the only instance
    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton(); // Create only if not already created
        }
        return instance; // Return existing instance
    }
}

public class Main {
    public static void main(String[] args) {
        Singleton obj1 = Singleton.getInstance(); // Creates the first (and only) instance
        Singleton obj2 = Singleton.getInstance(); // Returns the same instance

        // Checking if both objects refer to the same instance
        System.out.println(obj1 == obj2); // Output: true
    }
}
