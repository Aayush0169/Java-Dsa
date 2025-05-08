package Static;
//calling a non static method from mai
public class nonStatic {
    void non_static(){
        System.out.println("success: a non static method");
    }
    public static void main(String[] args) {
        nonStatic obj=new nonStatic();
        obj.non_static();
    }
}
