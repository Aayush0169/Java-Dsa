public class SB{
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Hello World");
        sb.insert(5, ",");
        System.out.println(sb); 

        sb.delete(2, 3);
        System.out.println(sb);
        
    }
}
