package Basic;
public class car {
    int year;
    String model;
    final String brand="BMW"; // does not allow to change this value

    public car(int year,  String model) {
        this.year = year;
        this.model = model;
        System.out.println("Year: " + this.year + ", Brand: " + this.brand + ", Model: " + this.model);
    }

    public static void main(String[] args) {
        car one = new car(2006, "x4");
        one.year=2010;//changing value
      //  one.brand="audi";  //can't be changed 
      System.out.println("year: "+one.year+" brand "+one.brand+" model: "+one.model);
    }
}