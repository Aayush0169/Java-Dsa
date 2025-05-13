package Static;

//outer class
public class outer {
    //inner class(non static)
    public class inner{
        String text2="2nd class";
    }
    public static class inner2{
        String text3="3rd class(static)";
    }
    public static void main(String[] args) {
        //first accessing the inner class(non static)

        outer obj1=new outer();//instatiateing outer class
        inner obj2= obj1.new inner();//instantiating inner class from instance of outer class
        System.out.println(obj2.text2+" non-static");

        //now accessing the inner static class
        inner2 obj3=new inner2();//no need of instance of outer class
        System.out.println(obj3.text3);
    }
}
