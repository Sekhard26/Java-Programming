import java.util.Scanner;
public class MinMax {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int size= sc.nextInt();
        int arr[]= new int[size];

        for(int i=0;i<size;i++){
            arr[i]= sc.nextInt();
        }
        int min= Integer.MAX_VALUE;
        int max= Integer.MIN_VALUE;

        for(int i=0;i<size;i++){
            if(arr[i]>max){
                max= arr[i];
            }
            if(arr[i]<min)
            min=arr[i];
        }
        System.out.print("Max is: "+max+ " min is: "+min);

    }
}
