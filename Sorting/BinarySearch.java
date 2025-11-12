import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch {

    public static int Binary(int arr[], int key, int si, int ei){
        
        int mid = (si+ei)/2;
         if (si > ei) {
            return -1;  
        }

        if(key== arr[mid]){
            return mid;
        }
        if(key>arr[mid]){
           return Binary(arr, key, mid+1, ei);
        }
        return Binary(arr, key, si, mid-1);
       

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
        Arrays.sort(arr);
        System.out.println("The sorted array is :"+ Arrays.toString(arr));
        System.out.println("The no to find is: ");
        int key= sc.nextInt();

        int result=Binary(arr, key, 0, size-1);
         if (result != -1) {
            System.out.println("The number found at index " + result + " is " + arr[result]);
        } else {
            System.out.println("Number not found!");
        }
    }
}