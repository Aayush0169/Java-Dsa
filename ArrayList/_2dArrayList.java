import java.util.ArrayList;

public class _2dArrayList {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> list=new ArrayList<>();
        ArrayList<Integer> list1=new ArrayList<>();
        list1.add(2);
        list1.add(4);
        list1.add(6);
        list1.add(8);
        list.add(list1);
        ArrayList<Integer> list2=new ArrayList<>();
        list2.add(8);
        list2.add(6);
        list2.add(4);
        list2.add(2);
        list.add(list2);
        ArrayList<Integer> list3=new ArrayList<>();
        list3.add(8);
        list3.add(16);
        list3.add(24);
        list3.add(32);
        list.add(list3);
        ArrayList<Integer> list4=new ArrayList<>();
        list4.add(32);
        list4.add(24);
        list4.add(16);
        list4.add(8);
        list.add(list4);

        // printing 2d arraylist
        for(int i=0;i<list.size();i++){
            for(int j=0;j<list.get(i).size();j++){
                System.out.print(list.get(i).get(j)+" ");
            }
            System.out.println();
        }
        ArrayList<ArrayList<Integer>> main=new ArrayList<>();
        ArrayList<Integer> one=new ArrayList<>();
        ArrayList<Integer> two=new ArrayList<>();
        ArrayList<Integer> three=new ArrayList<>();
        for(int i=1;i<6;i++){
            one.add(i);
            two.add(i*3);
            three.add(i*5);
        }
        main.add(one);
        main.add(two);
        main.add(three);
        System.out.println(main);
    }
}
