import java.util.*;
public class Length {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int size=sc.nextInt();

        String arr[]= new String[size];
        int tot=0;
        for(int i=0;i<arr.length;i++){
             arr[i]=sc.next();
             tot += arr[i].length();
        }
        System.out.print(tot);

    }
}
