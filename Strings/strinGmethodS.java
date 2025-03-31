public class strinGmethodS {
    public static void main(String[] args) {
        String str="hello ayush ";
        System.out.println("Length of string is: "+str.length());
        System.out.println();
        System.out.println("Charachter at index 7 is: "+str.charAt(7));
        String str1="is here";
        String full=str+str1;
        System.out.println();
        System.out.println("Full String after concation: "+full);
        System.out.println("Updated Length: "+full.length());
        System.out.println("sub string: "+full.substring(6, 11));
        System.out.println("Printing evry letter of first string: ");
       
        for(int i=0;i<str.length();i++){
            System.out.print(str.charAt(i)+" ");
        }

        
    }
}
