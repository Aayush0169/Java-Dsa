public class pairs {
    int total=0;
    public static void pairS(int arr[]){
        int count=0;
        for(int i=0;i<arr.length;i++){
            int curr=arr[i];
            for(int j=i+1;j<arr.length;j++){
                System.out.print("("+curr+","+arr[j]+")");
                count++;
            }
            System.out.println();
        }
        System.out.print("Total numbers of pairs: "+count);
    }
    public static void main(String[] args) {
        int nums[]={2,5,4,3,6,9,8};
        System.out.println("Pairs in the array:");
        pairS(nums);
    }
}
