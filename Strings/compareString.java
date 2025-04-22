public class compareString{
    public static void biggestString(String[]fruits){
        String largest=fruits[0];
        for(int j=0;j<fruits.length;j++){
            if (largest.compareToIgnoreCase(fruits[j])<0){
                largest=fruits[j];
            }
        }
        System.out.println(largest);   
    }    public static void main(String[] args) {
        String[] fruits={"apple","mango","grapes"};
         biggestString(fruits);       
        }
    }
