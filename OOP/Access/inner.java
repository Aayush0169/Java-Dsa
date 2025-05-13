package Access;

public class inner {
    public static void main(String[] args) {
        GetSet obj=new GetSet("Random String",5);
        System.out.println(obj.getName()+obj.getNumber());
        obj.setNumber(78);
        System.out.println(obj.getNumber());
    }
    
}
