class Numerics {

    public static void print(int n){
        if (n==6) {
            return;
        }
        System.out.print(n+" ");
        print(n+1);
    }
    
    public static void decresing(int n){
        System.out.print(n+" ");
        if (n<=0) {
            return;
        }
        decresing(n-1);
    }

    public static int factorial(int n){
        if (n==0) {
            return 1;
        }
        int fact=n*factorial(n-1);
        return fact;
    }

    public static int sumOfN(int n){
        if (n==0) {
            return 0;
        }
        int fact=n+sumOfN(n-1);
        return fact;
    }

    public static int fibo(int n){
        if(n<2){
            return n;
        }
        return fibo(n-1)+fibo(n-2);
    }


    public static void main(String[] args) {
        print(1);
        System.out.println();
        System.out.println("Fiboniacci is: "+fibo(30));
        decresing(20);
        System.out.println();
        System.out.println("Sumof: "+sumOfN(5));
        System.out.println("Factorial: "+factorial(7));
       
    }
}