public class factorial {
    public static int factorial(int f){
        int factorial=1;
        for(int i=1;i<=f;i++){
            factorial*=i;  
        }
        return factorial;
    }
    public static void main(String[] args) {
        int factorial=factorial(2);
        System.out.println(factorial);
    }
}
