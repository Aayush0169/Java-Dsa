public class primE {
    public static boolean prime(int n){
        if (n==2) {
            return true;
        }
        else{
        for(int i=2;i<=Math.sqrt(n);i++){
         if (n %i==0) {
            return false;
         }
        }
        return true;
    }
}
public static void printPrime(int x){
    if (x<=1) {
        System.out.println("Invalid number!");
    }
    else if (x==2) {
        prime(x);
    }
    System.out.println("The prime numbers under "+x+" are: ");
    for(int i=2;i<=x;i++){
        if (prime(i)==true) {
            System.out.println(i);
        }
    }
}
    public static void main(String[] args) {
        // boolean result=prime(4);
        // System.out.println(result);
        printPrime(10);
    }
}
