import java.util.Arrays;

public class MaxProOfTriplet {

    public static int max(int arr[]) {
        int n=arr.length;
        Arrays.sort(arr);
        int pro1= arr[n-1]* arr[n-2]* arr[n-3];
        int pro2= arr[0]* arr[1]* arr[n-1];

        return Math.max(pro1, pro2);
    }

    public static void main(String[] args) {
        int arr[] = { -10, -3, -5, -6, -20};        
        int mul = max(arr);
        System.out.print(mul);

    }

}
