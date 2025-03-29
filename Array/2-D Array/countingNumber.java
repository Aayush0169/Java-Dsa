public class countingNumber {
    static short countKey(int matrix[][],int key){
        short counter=0;
        for (int val[] : matrix) {
            for (int value : val) {
                if (value==key) {
                   counter++; 
                }
            }
        }
        return counter;
    }
    public static void main(String[] args) {
        int matrix[][]={
            {12,45,8,5},
            {5,5,6,8,12}
        };
        int key=5;
        System.out.println(countKey(matrix, key));
    }
}
