package Polymorphism;

class Parent {
    void show() {
        System.out.println("Parent method");
    }
    
}

class Child extends Parent {
    void display() {
        System.out.println("Child display");
    }
}

public class Main {
    public static void main(String[] args) {
        Parent obj = new Child(); // ✅ Upcasting: Child object stored in Parent reference
        obj.show(); // Calls overridden method from Child
        //obj.display();// Error: Parent reference can't access Child-specific methods
    }
}

