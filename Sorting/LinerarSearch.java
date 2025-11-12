import java.util.Arrays;
import java.util.Scanner;

public class LinerarSearch {

    public static void  Serach(int arr[], int n) {
        if(arr.length==0){
            return;
        }
        for(int i=0;i<arr.length;i++){
        if(arr[i]==n){
            System.out.print("The no "+n+ " is found at index "+i);
            return;
        }
    }

}
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the size: ");
        int size= sc.nextInt();
        int arr[]= new int[size];
        for(int i=0;i<size;i++){
            arr[i]= sc.nextInt();
        }
        System.out.print("The array is :");
        for(int i=0;i<size;i++){
           System.out.print(+arr[i]+" ");
        }
        
        System.out.println("The no to find is: ");
        int key= sc.nextInt();

        Serach(arr, key);
         
    }
}
