package Inheritence;

public class Main extends Shapes{ 
    int main;
    int sqr;

    Main(){
        super(1,2,3);
        System.out.println("Calling super (parent's) constructor");
    }
    Main(int main){
        this.main=main;
    }
   
    public static void main(String[] args) {
        Shape s1=new Shape(5,8);
        Shape s2=new Shape(s1);
        System.out.println(s2.area);

        // Shape s3= new Main(5,6);
        // System.out.println(s3.sqr);
    }
}
