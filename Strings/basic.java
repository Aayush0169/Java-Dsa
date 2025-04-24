public class basic {
    public static void main(String[] args) {
        String a="hi";
        String b= "hi";
        String c=new String("hi");
        String alphabet="";
        System.out.println('v'+0);

        for(int i=0;i<26;i++) {
            char ch = (char)('a'+i);
            System.out.print(ch+" ");
            alphabet+=ch;
        }
        System.out.println();
       System.out.println(alphabet);
       System.out.println();
       System.out.println(a==b);
       System.out.println(b==c);
    }
}
