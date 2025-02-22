public class selectionSort {
    public static void SelectionSort(int array[]){//ascending order
        int len=array.length;
        for(int i=0;i<len;i++){
            int min=i;
            for(int j=i+1;j<len;j++){
                if (array[min]>array[j]) {
                    min=j;
                }
            }
            //swapping
            int temp=array[min];
            array[min]=array[i];
            array[i]=temp;
        }
    }
    public static void SelectionSort1(int array[]){//dexcending order
        int len=array.length;
        for(int i=0;i<len;i++){
            int min=i;
            for(int j=i+1;j<len;j++){
                if (array[min]<array[j]) {
                    min=j;
                }
            }
            //swapping
            int temp=array[min];
            array[min]=array[i];
            array[i]=temp;
        }
    }
    public static void main(String[] args) {

        int choice=bubbleSorting.choice();
          //array input
          int arr[]=bubbleSorting.arrInput();
        if (choice==1) {
            SelectionSort(arr);
            //printing
            bubbleSorting.printArr(arr);
        }
        else if (choice==2) {
            SelectionSort1(arr);
            bubbleSorting.printArr(arr);
        }
        else{
            System.out.println("Invalid Input");
        }
    }
}
