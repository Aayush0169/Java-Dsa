public class mathQs {
    static void OddEven(int n){

        int bitMask=1;
        if((n&bitMask)==0){
            System.out.println("Number is even!");
        }
        else{
            System.out.println("Number is odd!");
        }
    }
    
    static void isPowerOf2(int x){
        if (((x-1)&x)==0) {
           System.out.println(x+" is power of 2"); 
        }
        else{
            System.out.println(x+" is not power of 2"); 
        }
    }


    static int expo(int number,int power){
        int answer=1;
        while (power>0) {
            if ((power&1)!=0) {
                answer*=number;
            }
            number*=number;
            power=power>>1;
        }
        return answer;
    }

        public static void main(String[] args) {
        int n=5;
        // isPowerOf2(n);
        System.out.println(expo(2, 25));
    }
}
