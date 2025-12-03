public class Array {
    public  static boolean ascendingSorted(int[] array, int index){
        if (index==array.length-1) {
            return true;
        }
        if (array[index]>array[index+1]) {
            return false;
        }
        return ascendingSorted(array, index+1);
    }

    public static int firstOccurence(int[] array, int index,int key){
        if (index==array.length) {
            return -1;
        }
        if (array[index]==key) {
            return index;
        }
        return firstOccurence(array, index+1,key);
    }

    public static int lastOccurence(int[] array, int index,int key){
        if (array[index]==key) {
            return index;
        }
        if (index==-1) {
            return -1;
        }
        return lastOccurence(array, index-1,key);
    }

   
    public static void main(String[] args) {
   int[] arr={2,5,6,9,8,7,4,5};
    
try {
    System.out.println(lastOccurence(arr, 7, 5));

} catch (Exception e) {
System.out.println(e.getLocalizedMessage());
}

    }
}
