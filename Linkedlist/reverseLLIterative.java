import java.util.*;
public class reverseLLIterative {
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
        System.out.println("Reversed LL is: ");
        for(int i=list.size()-1;i>=0;i--){
            System.out.print(list.get(i)+" -> ");
        }
        System.out.println("null");
    }
}
