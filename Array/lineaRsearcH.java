import java.util.*;
public class lineaRsearcH {
    public static int linearSearch(int array[],int key){
        for(int i=0;i<array.length;i++){
            if (array[i]==key) {
                return i;
                
            } 
        }
        return -1; 
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number you want to search: ");
        int key=sc.nextInt();
        int numbers[]= {2,4,6,8,10,12,14,16,18,20,22,24,26,28,30};
        int result=linearSearch(numbers,key);
        
        if (result>=0) {
            System.out.println("Value founf @ "+result+" index");
        }
        else{
            System.out.println("Value not found!");
        }
        sc.close();
    }
}
