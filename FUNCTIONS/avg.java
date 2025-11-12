import java.util.*;

public class avg {
        static int AVG(int a, int b, int c){
            int average= (a+b+c)/3;
            return average;
        }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the 1st no: ");
        int a = sc.nextInt();
        System.out.print("Enter the 2nd no: ");
        int b = sc.nextInt();
        System.out.print("Enter the 3rd no: ");
        int c = sc.nextInt();

        System.out.print("The average is: "+AVG(a,b,c));
    }
}
