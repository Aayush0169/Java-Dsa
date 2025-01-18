import java.util.*;
public class binarYsearcH {
    public static int BinarYsearcH(int nums[],int key){
        int start=0;
        int end=nums.length-1;
        while (start<=end) {
            int mid=(start+end)/2;
            if (nums[mid]==key) {
                return mid;
            }
             else if(nums[mid]<key){
                 start=mid+1;
                }
                else  {
                    end=mid-1;
                    
                }      
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter he value of key you want to search in array: ");
        int key=sc.nextInt();
        int nums[]={8,4,12,15,16,18,20,24};
        int result=BinarYsearcH(nums,key);
        if (result>=0) {
            System.out.println("Key found at index: "+result);
        }
        else{
            System.out.println("couldnt find key!");
        }
        sc.close();
    }
}
