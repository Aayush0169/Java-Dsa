import java.util.Scanner;

public class reversE1 {
    public static void arrReverse(int arr[]){
        int length=arr.length;
        int revrseArr[]=new int[arr.length];
        for(int i=0;i<length;i++){
            revrseArr[i] = arr[length - 1 - i];
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
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int size=sc.nextInt();
        int arr[]=new int[size];

        System.out.println("Enter values of array:");
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Your array: ");
        System.out.print("[");
        for(int i=0;i<size;i++){
            System.out.print(arr[i]);
            if (i<(size-1)) {
                System.out.print(",");
                
            }
        }
        System.out.println("]");

        System.out.println("Reversed Array: ");
        arrReverse(arr);
        sc.close();

}
    }
