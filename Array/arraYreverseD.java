public class arraYreverseD {
    public static void revrse(int arr[]){
int first=0;
int last=arr.length-1;
while (last>first) {
    int temp;
    temp=arr[first];
    arr[first]=arr[last];
    arr[last]=temp;
    first++;
    last--;

}
        
    }
    public static void main(String[] args) {
        int arr[]={0,2,25,4,65,35,69,96,45,87};
        revrse(arr);
        
        System.out.print("["); 
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]);
            if (i<arr.length-1) {
                System.out.print(","); 
            }
        }
        System.out.print("]"); 
        
    }
}
