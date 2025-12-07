import java.util.ArrayList;
import java.util.List;

public class bsicFunctions {

    static void reverseArrayList(ArrayList<Integer> arr){
        if (arr.size()==0) {
            System.out.println("ArrayList is empty");
        }
        for(int i=arr.size()-1;i>=0;i--){
            System.out.print(arr.get(i)+" ");
        }
    }
    static void maximum(ArrayList <Integer> arr){
        int max=arr.get(0);
        for(int i=arr.size()-1;i>=0;i--){
            if (arr.get(i)>=max) {
                max=arr.get(i);
            }
        }
    System.out.println(max);
    }
    public static void main(String[] args) {
    ArrayList<Integer> numbers = new ArrayList<>(List.of(5, 10, 45, 20, 60));
    maximum(numbers);
}
}
