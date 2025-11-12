import java.util.LinkedList;
import java.util.Scanner;

public class reverseLLRecursion {
    
    public int reverse(int data){
        
    }


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
    }
}
