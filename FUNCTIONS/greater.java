import java.util.Scanner;
public class greater{

    static int big(int a, int b){
        int c= (a>b)?a:b;
        return c;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the 2 nos: ");
        int a= sc.nextInt();
        int b= sc.nextInt();
        System.out.print("The greater no is "+big(a, b));
    }
}