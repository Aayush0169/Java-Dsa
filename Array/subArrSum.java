public class subArrSum {
    public static void subarr (int arr[]){
        int maxsum=arr[0];
        for(int i=0;i<arr.length;i++){
            for(int j=i;j<arr.length;j++){
                int sum=0;
                for(int k=i;k<=j;k++){
                    sum+=arr[k];
                    if (maxsum<=sum) {
                        maxsum=sum;
                    }
                }
                System.out.println(sum);                
            }
        }
        System.out.println("Largest sum is: "+maxsum);
    }
    public static void main(String[] args) {
        int arr[]={10,20,30,40};
        subarr(arr);

    }
}

