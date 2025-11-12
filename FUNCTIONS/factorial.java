import java.util.Scanner;

public class factorial {
    public static int fact(int a){
        int mul=1;
        for(int i=1;i<=a;i++){
             mul= mul*i;
            }
            return mul;
    }


    public static void main(String[] args) {
         Scanner sc= new Scanner(System.in);
        int a= sc.nextInt();
        // int b= sc.nextInt();

        int mul= fact(a);
        System.out.println(mul);

    }
}
