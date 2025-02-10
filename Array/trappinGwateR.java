import java.util.*;
public class trappinGwateR {
    public static void trappedWater(int height[]){

        //calculating the left max height (of array)
        int length=height.length;
        int leftMax[]=new int[length];
        leftMax[0]=height[0];
        for(int i=0;i<length;i++){
            leftMax[i]=Math.max(height[i],leftMax[i-1]);
        }
        
        //calculating the right max height (of array)
        int rightMax[]=new int [length];
    }
}
