class StringQs{
    public static int shortestPath(String path){
        int x=0;
        int y=0;
        for(int i=0;i<path.length();i++){
            char direction=path.charAt(i);
            //south
            if(direction=='S'){
                y--;
            }
            else if(direction=='N'){
                y++;
            }
            else if(direction=='w'){
                x--;
            }
            else {
                x++;
            }
        }
        int result=(int)Math.sqrt((x*x)+(y*y));
        return result;
    } 
    public static void main(String[] args) {
        String path="WWENSENNEW";
        System.out.println(shortestPath(path));
    }
}