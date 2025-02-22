public class InsertioNsort {
    public static void InsertioNsort1(int arr[]){//ascending order
        int len = arr.length;
    
            for (int i = 1; i < len; i++) {
                int curr = arr[i];
                int prev = i - 1;
    
                while (prev >= 0 && arr[prev] > curr) {
                    // Shift the element to the right
                    arr[prev + 1] = arr[prev];
                    prev--;
                }
                // Insert the current element in the correct position
                arr[prev + 1] = curr;
    }
}
public static void InsertioNsort2(int arr[]){//descending  order
    int len = arr.length;

        for (int i = 1; i < len; i++) {
            int curr = arr[i];
            int prev = i - 1;

            while (prev >= 0 && arr[prev] < curr) {
                // Shift the element to the right
                arr[prev + 1] = arr[prev];
                prev--;
            }
            // Insert the current element in the correct position
            arr[prev + 1] = curr;
}
}
public static void main(String[] args) { 
    //choice of sorting
    int choice=bubbleSorting.choice();

      //array input
      int arr[]=bubbleSorting.arrInput();
    if (choice==1) {
        InsertioNsort1(arr);
        //printing
        bubbleSorting.printArr(arr);
    }

    else if (choice==2) {
        InsertioNsort2(arr);
        bubbleSorting.printArr(arr);
    }

    else{
        System.out.println("Invalid Input");
    }
}
}
