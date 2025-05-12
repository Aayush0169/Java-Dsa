package Inheritence;

public class Shape {
    int length;
   private int width;
   int area;
  
    public Shape(){
        System.out.println("This is a default constructor from main class!");
    }
public Shape (int length){
    System.out.println("This is a square");
    this.length=length;
    this.width=length;
    this.area=length*width;
}

public Shape (int length,int width){
    System.out.println("This is a rectangle");
    this.length=length;
    this.width=width;
    this.area=length*width;
}
public Shape (Shape s){
    this.length=s.length;
    this.width=s.width;
    this.area=s.area;
}

}


