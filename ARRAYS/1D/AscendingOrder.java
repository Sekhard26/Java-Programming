import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class AscendingOrder {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int size= sc.nextInt();
        int arr[]= new int[size];

        for(int i=0;i<size;i++){
            arr[i]= sc.nextInt();
        }
        Arrays.sort(arr);
        for(int i=0;i<arr.length;i++){
            
                System.out.print(arr[i]);
            
        }
    }
}
