package LAB09;
//linklist question
import java.util.ArrayList;
public class MyCollectionDemo {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        System.out.println("Size before init:  "  + list.size());
        list.add(Integer.valueOf(1));
        System.out.println("Size after init  " + list.size());

        for(int i=0; i<10; i++)
        {
            list.add(i + 1);
        }
        list.add(3,99);
        System.out.println(list);
        System.out.println("size after init " + list.size());
        System.out.println(list.remove(Integer.valueOf(99)));
        System.out.println(list);
        System.out.println(list.size());
        System.out.println(list.get(5)); // gives the index element at position 5 and list is same as it is
        System.out.println(list);
    }

}

