package Basic;
//creating class
public class Student {
    //instance variables(variables defined inside a class )
    int rollNo;
    String name;
    float marks;

    //constructor overloading
    public Student(){};

    public Student(int roll, String name, float marks){
        this.rollNo=roll;
        this.name=name;
        this.marks=marks;
    }
    public Student(int roll,String name){
        this(roll, name,89);
    }
}


class init{
    public static void main(String[] args) {//various methods of instancing objects
        System.out.println("Student 1: ");
        Student one=new Student();
        one.name="Namami";
        one.rollNo=411;
        one.marks=89.5f;
        System.out.println("name is: "+one.name+" roll no: "+one.rollNo+", and total marks: "+one.marks);
        System.out.println();

        Student ayush=new Student(400,"Ayush",88.5f);
        Student two=ayush;//creating another refrence for same object;
        two.rollNo=405;//setting value
        System.out.println("Student 2: ");
        System.out.println("name is: "+ayush.name+" roll no: "+ayush.rollNo+", and total marks: "+ayush.marks);
        System.out.println();

        System.out.println("Student 3: ");
        Student khushi=new Student(605, "Khushi");
        System.out.println("name is: "+khushi.name+" roll no: "+khushi.rollNo+", and total marks: "+khushi.marks);

        System.out.println(one);
    }
}
