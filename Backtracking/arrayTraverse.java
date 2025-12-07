// Q: First assign the array's index with natural numbers ins ascednig order the subtract the values with 2 
//     and make the final values in array

public class arrayTraverse{
    public static void changeArray(int array[],int val,int index){
        //base case
        if (index==array.length) {
            printArray(array);
            System.out.println();
            return;
        }
        //recursion case
        array[index]=val;
        changeArray(array, val+1, index+1);
        array[index]=array[index]-2;//backtracking logic
    }
    public static void printArray(int array[]){
        for (int i : array) {
            System.out.print(i+" ");
        }
    }
    public static void main(String[] args) {
        int array[]=new int[5];
        System.out.println("Base Output:");
        changeArray(array, 1, 0);
        System.out.println("FInal Output:");
        printArray(array);
    }
}