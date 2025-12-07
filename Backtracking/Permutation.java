//Q: to find all possible premuatations of a string
public class Permutation {

    public static void findPermutations(String str) {
        findPermutations(str, "");
    }

    private static void findPermutations(String str, String ans) {
        // base case
        if (str.length() == 0) {
            System.out.print(ans+" ");
            return;
        }

        // recursion
        for (int i = 0; i < str.length(); i++) {
            char current = str.charAt(i);
            
            String str2 = str.substring(0, i) + str.substring(i + 1);
            
            findPermutations(str2, ans + current);
        }
    }

    public static void main(String[] args) {
        String str = "abc";
        
        findPermutations(str); 
    }
}
