import java.util.ArrayList;
import java.util.Collections;

public class lists {
    public static void main(String[] args) {
        ArrayList<Integer> list= new ArrayList<>();
        //to add elements
        list.add(0);
        list.add(2);
        list.add(3);
        System.out.println(list);

        //to get the elements form the arraylist
        int get= list.get(0);
        System.out.println(get);

        //ot add elements in between
          list.add(1,1);
        System.out.println(list);

        //to set the elemwnts in place of other
        list.set(0, 5);
        System.out.println(list);

        //to delete
        list.remove(1);
        System.out.println(list);

        //use of loops
        for (int i=0;i<list.size();i++){
            System.out.println(list.get(i));
        }
        
        //to sort the elements
        Collections.sort(list);
        System.out.print(list);
    }
}
