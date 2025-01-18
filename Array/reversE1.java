public class reversE1 {
    public static void main(String[] args) {
        int arr1[]={5,2,1,4,8,3};
        int length=arr1.length;
        int revrseArr[]=new int[arr1.length];
        for(int i=0;i<length;i++){
            revrseArr[i] = arr1[length - 1 - i];
        }
        System.out.print("[");
        for(int i=0;i<length;i++){
            System.out.print(revrseArr[i]);
            if (i<(length-1)) {
                System.out.print(",");
                
            }
        }
        System.out.print("]");
    }
}
