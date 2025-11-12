import java.util.*;
public class RemoveNoGreaterThan25 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the size of LL: ");
        int n=sc.nextInt();
        LinkedList<Integer> list= new LinkedList<Integer>();
        System.out.print("Enter the LL: ");
        for(int i=1;i<=n;i++){
            int val= sc.nextInt();
            list.add(val);
        }
        for(int i=0;i<list.size();i++){
            System.out.print(list.get(i)+" -> ");
        }
        System.out.println("null");
        for(int i=0;i<list.size();i++){
            if(list.get(i)>25){
                list.remove(i);
            }
             System.out.print(list.get(i)+" -> ");
        }
        System.out.println("null");
        }

}
