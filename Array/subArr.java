public class subArr {
    public static void subarr (int arr[]){
        for(int i=0;i<arr.length;i++){
            for(int j=i;j<arr.length;j++){

                System.out.print("[");
                for(int k=i;k<=j;k++){
                    System.out.print(arr[k]); 
                }
                
                System.out.println("]");
                System.out.println();

        }}
    }
    public static void main(String[] args) {
        int arr[]={10,20,30,40};
        subarr(arr);

    }
}
