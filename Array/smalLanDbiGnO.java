import java.util.*;
public class smalLanDbiGnO {
    //Function wil return lagest number
    public static int largestnumber(int n[]){
        int largest=n[0];
        for(int i=0;i<n.length;i++){
            if (n[i]>=largest) {
                largest=n[i];
            }
        }
        return largest;
    }
    //Function wil return smallest number
    public static int smallestNumber(int n[]){
        int smallest=n[0];
        for(int i=0;i<n.length;i++){
            if (n[i]<=smallest) {
                smallest=n[i];
            }
        }
        return smallest;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Size of the array: ");
        int x=sc.nextInt();
        int nums[]=new int[x];
        for(int i=0;i<x;i++){
            System.out.println("Enter value for index "+i+": ");
            nums[i]=sc.nextInt();
        }
        System.out.println("Your array: ");
        for(int j=0;j<x;j++){
            System.out.print(nums[j]);
        }
        int largestno=largestnumber(nums);
        int smallestno=smallestNumber(nums);
        System.out.println("\n The largest number from array is: "+largestno+"\nand smallest number is: "+smallestno);
        sc.close(); 
    }
}
