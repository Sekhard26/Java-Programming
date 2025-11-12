import java.util.Scanner;
public class selection {

    public static void sort(int arr[]){
        for(int i=0;i<arr.length-1;i++){
            int small=i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[small]>arr[j]){
                    small=j;
                }
            }
            int temp= arr[small];
            arr[small]=arr[i];
            arr[i]=temp;
        }
    }

     public static void print(int arr[]){
    for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+ " ");
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
        System.out.print("The unsorted array is: ");
        print(arr);
        System.out.println();
        sort(arr);
        System.out.print("The sorted array is: ");
        print(arr);
    }
}


