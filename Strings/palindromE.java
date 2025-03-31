import java.util.Scanner;

public class palindromE {
    static boolean check(String str){
        int j=str.length()-1;
        for(int i=0;i<str.length()/2;){
            if (str.charAt(i)==str.charAt(j)) {
                i++;
                j--;
            }
            else {
                return false; 
        } }      
        return true;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string you want to check if it is palindrome: ");
        String str=sc.nextLine();
        System.out.println(check(str));
        sc.close();
    }
}
