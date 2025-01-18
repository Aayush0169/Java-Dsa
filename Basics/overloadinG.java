public class overloadinG {
    public static float sum(float a,float b){
        return a+b;
    }
    public static float sum(float a,float b,float c){
        return a+b+c;
    }
    public static int sum(int a,int b){
        return a+b;
    }
    public static int sum(int a,int b,int c){
        return a+b+c;
    }

    public static void main(String[] args) {
        int res=sum(12,15,85 );
        System.out.println(res);
    }
}
