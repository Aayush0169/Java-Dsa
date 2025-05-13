package Access;

public class GetSet {
    private String name;
    private int number;

    public GetSet(String name, int number){
        this.number=number;
        this.name=name;
    }

    public int getNumber(){
        return this.number;
    }

    public String getName(){
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setNumber(int number) {
        this.number = number;
    }


}
