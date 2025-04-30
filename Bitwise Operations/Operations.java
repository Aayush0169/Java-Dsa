public class Operations {
    static int getBitAtIndex(int n, int i) {
        if (i < 0 || i >= Integer.SIZE) {
            throw new IllegalArgumentException("Bit index out of range!");
        }
        return (n & (1 << i)) == 0 ? 0 : 1;
    }
    static int setBitAtIndex(int n , int i){
        return n|(1<<i);
    }

    static int clearBitAtIndex(int n , int i){
        int bitMask= ~(1<<i);
        return n&bitMask;
    }
    
    static int updateBitAtIndex(int n , int i,int newBit){
        if (newBit>1||newBit<0) {
            return -1;
        }
        else if (newBit==0) {
            int bitMask= ~(1<<i);
            return n&bitMask;
        }
        else{
            return n|(1<<i);
        }
        
    }
    
    static int clearLastIbits(int n , int i){
        int bitMask= (-1)<<i;
        return n&bitMask;
    }

    static int clearBitsInRange(int n , int i, int j){
        int a=(-1)<<(j+1);
        int b=(1<<i)-1;
        int bitMask=a|b;
        return n&bitMask;
    }

    static int count1s(int n){
        int count = 0;
        while (n>0) {
            if ((n&1)==1) {
                count++;
            }
            n=n>>1;
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(count1s(39));
    }
}
