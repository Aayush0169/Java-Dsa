package Inheritence;

public class Shapes extends Shape {
    int depth;
    public Shapes(int length, int width, int depth){
        super(length,width);
        this.depth=depth;
    }
    Shapes(){
        System.out.println("This is default Constructor");
    }
    public static void main(String[] args) {
        Shape  s1= new Shapes(5,15,8);
        System.out.println(s1.area);
        
    }
}
