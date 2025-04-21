public class subString {
    static String subStr(String s){
        String sub="";
        short start=5;
        short end=8;
        while (start<end) {
            sub+=s.charAt(start);
            start++;
        }
        return sub;
    }
    public static void main(String[] args) {
        String s="hello ayush";
        System.out.println(subStr(s));
    }
}
