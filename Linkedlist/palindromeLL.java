import java.util.*;
public class palindromeLL {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            int val= sc.nextInt();
            list.add(val);
        }
        
        System.out.print("The original list is: ");
        for(int i=0;i<list.size();i++){
            System.out.print(list.get(i)+" -> ");
            
        }
        System.out.println("null");
        
            Integer arr[]= list.toArray(new Integer[0]); 
            System.out.println(Arrays.toString(arr));

             System.out.print("The reversed list is: ");
        for(int i=list.size()-1;i>=0;i--){
            System.out.print(list.get(i)+" -> ");
            
        }
        System.out.println("null");
        
            Integer arr1[]= list.toArray(new Integer[n--]); 
            System.out.print(Arrays.toString(arr1));
        
    }
}