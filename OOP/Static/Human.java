package Static;

public class Human {
    String name;
    static int count;

    public Human(String name){
        this.name=name;
        Human.count+=1;
    }
    public static void main(String[] args) {
        Human ob1=new Human("Ayush");

        Human ob=new Human("Namami");
    
        // System.out.println(ayush.count);
    
        
    }
}

