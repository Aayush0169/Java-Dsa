package Polymorphism;

public class Triangle extends Shapes {
    @Override
    public void area(){
        System.out.println("Area of Triangle");
    }

    public static void main(String[] args) {
        Shapes shape= new Shapes();
        Shapes circle = new Circle();
        Triangle triangle=new Triangle();
        
        triangle.area();
        circle.area();
        shape.area();
    }
}
