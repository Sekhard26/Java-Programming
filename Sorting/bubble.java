import java.util.Scanner;
public class bubble {
    public static void sort(int a[]){
     int temp=0;
    for(int i=0;i<a.length-1;i++){
        for(int j=0;j<a.length-i-1;j++){
            if(a[j]>a[j+1]){
            temp=a[j];
            a[j]=a[j+1];
            a[j+1]=temp;
          }
        }
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
        System.out.print("The unsorted array is: ");
        print(arr);
    }
}
