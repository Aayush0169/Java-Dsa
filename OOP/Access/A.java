package Access;

public class A {
    private int num;//making variable private 
    String str;
     int[] numbers;
    
     public int getNum() {
         return num;//a public method to show the variable indirectly
     }

     //constructors
    A(int num,String str,int[] numbers){
        this.num=num;
        this.str=str;
        this.numbers=numbers;
    }
    A(int num,String str){
        this.num=num;
        this.str=str;
    }
    A(int[] numbers){
        this.numbers=numbers;
        for (int i : numbers) {
            System.out.print(i+" ");
        }
    }
}
