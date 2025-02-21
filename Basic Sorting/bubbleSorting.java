import java.util.*;
public class bubbleSorting {
    //method for taking choice as input
    public static int choice(){
          Scanner sc=new Scanner(System.in);
        System.out.println("Enter 1 for sorting in Ascending order 2 for Descending order: ");
        int num= sc.nextInt();
        return num;
      }

    //method for taing array as input
    public static int[] arrInput(){
                //taking array as input
                Scanner sc=new Scanner(System.in);
                System.out.println("Enter the length of array: ");
                int len=sc.nextInt();
                int arr[]=new int[len];
        
                System.out.println("Enter values for the array: ");
                for(int i=0;i<len;i++){
                    arr[i]=sc.nextInt();
                }
                sc.close();
                return arr;
                
    }

    //method for printing the array
    public static void printArr( int arr[]){
        int len=arr.length;
        System.out.println("Here is your sorted array: ");
        System.out.print("[");
        for(int i=0;i<len;i++){  
            System.out.print(arr[i]);
            if(i<len-1){
                System.out.print(",");
            }
        }
        System.out.print("]");
    }


    public static void bubbleSort(int arr[]){
                //sorting the array
                for(int turn=0;turn<arr.length-1;turn++){
                    for(int j=0;j<arr.length-1-turn;j++){
        
                        if (arr[j]>arr[j+1]) {
                            int temp=arr[j];
                            arr[j]=arr[j+1];
                            arr[j+1]=temp;
                        }
        
                    }
                }
    }
    public static void bubbleSort1(int arr[]){
        //sorting the array
        for(int turn=0;turn<arr.length-1;turn++){
            for(int j=0;j<arr.length-1-turn;j++){

                if (arr[j]<arr[j+1]) {
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }

            }
        }
}
public static void main(String[] args) {
    // taking choice
    int num = choice();
    // array input
    int arr[] = arrInput();
    if (num == 1) {
        bubbleSort(arr);
        printArr(arr);
    } else if (num == 2) {
        bubbleSort1(arr);
        printArr(arr);
    } else {
        System.out.println("Wrong Input!");
    }
}

}