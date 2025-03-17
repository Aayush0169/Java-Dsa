public class butterfly {
    public static void butterflyStar(int lines){
        int total_lines=lines;
        int stars=1;
        int spaces=2*lines-2;
        int curr_line=1;
        while (curr_line<=total_lines) {
            //printing stars
            for(int i=1;i<=stars;i++){
                System.out.print("*");
                
            }
            //printing spaces
            for(int i=0;i<=spaces;i++){
                
                System.out.print(" ");
            }
            
            //printing stars
            
            for(int i=1;i<=stars;i++){
                System.out.print("*");
            }
            //next line
            System.out.println();
            stars++;
            spaces-=2;
            curr_line++;
            

        }
    }
    public static void main(String[] args) {
        butterflyStar(7);
    }
}
