import java.util.ArrayList;

public class ArrayLists {
    public static void main(String[] args) {
        ArrayList<Integer> arrList=new ArrayList<>();
        //adding elements:
        arrList.add(5);
        arrList.add(10);
        arrList.add(15);
        arrList.add(20);
        System.out.println("ArrayList after adding elements: "+arrList);

        //get/retriving the value from the index:
        System.out.println("Element at index 2: "+arrList.get(2));
        
        //removing an element:
        System.out.println("Removing the element at index 2: "+arrList.remove(2));
        System.out.println("ArrayList: "+arrList);

        //setting a new element:
        arrList.set(2,19);
        System.out.println("After setting a new element at index 2: ");
        System.out.println(arrList);

        //check if contains:
        System.out.println("checkig if it contains 10: "+arrList.contains(10));
        System.out.println("checkig if it contains 15: "+arrList.contains(15));

        //size:
        System.out.println("Size: "+arrList.size());
        

    }
}