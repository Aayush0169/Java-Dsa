// Q: FInd all possible subsets of a string
public class setSubsets {

    public static void findSubSets(String str){
        findSubSets(str," ",0);
    }

    public static void findSubSets(String str, String ans,int i){
        //base case
        if (i==str.length()) {
            if (ans.length()==0) {
                System.out.println("null");
            }
            System.out.print(ans+" ");
            return;
        }

        //recursion
        findSubSets(str, ans+str.charAt(i), i+1);
        findSubSets(str, ans, i+1);

    }
    public static void main(String[] args) {
        String str="abcd";
        findSubSets(str);
    }
}
