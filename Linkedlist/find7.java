import java.util.*;
public class find7 {
    public static void main(String[] args) {
        LinkedList<Integer> list= new LinkedList<Integer>();
        list.addLast(1);
        list.addLast(5);
        list.addLast(7);
        list.addLast(3);
        list.addLast(8);
        list.addLast(2);
        list.addLast(3);

       int val=7;
       for(int i=0;i<list.size();i++){
        System.out.print(list.get(i)+" -> ");
       }
       System.out.println("null");
       for(int i=0;i<list.size();i++){
        if(list.get(i)==val){
            System.out.print(val +" found at index "+i);
        }
       }
    }
}