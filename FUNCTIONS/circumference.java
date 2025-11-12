import java.util.Scanner;

public class circumference {
   

    static double rad(int r){
        double c= Math.PI*r*2;
        return c;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the radius: ");
        int a= sc.nextInt();
        
        System.out.print("The circumference no is "+rad(a));
    }
}

