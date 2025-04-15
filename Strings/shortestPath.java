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
            else (direction=='N'){
                x++;
            }
        }
    } 
}