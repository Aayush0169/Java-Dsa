public class pairs {
    int total=0;
    public static void revrse(int arr[]){
        for(int i=0;i<arr.length;i++){
            int curr=arr[i];
            for(int j=i+1;j<arr.length;j++){
                System.out.print("("+curr+","+arr[j]+")");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int nums[]={2,5,4,3,6,9,8};
        revrse(nums);
    }
}
