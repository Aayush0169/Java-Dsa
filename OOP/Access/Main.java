package Access;

public class Main {
    public static void main(String[] args) {
        A obj=new A(23,"hello");
        System.out.println(obj.getNum());

        A obj2=new A(new int[]{12,45,75});
        System.out.println(obj2.getNum());
    }
}
