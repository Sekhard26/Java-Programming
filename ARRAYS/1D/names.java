import java.util.Scanner;
public class names {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int size = sc.nextInt();
        System.out.print("Enter the names: ");
        String n[]= new String[size];

        for(int i=0;i<size;i++){
            n[i]= sc.next();
        }

        for(int i=0;i<size;i++){
            System.out.print(n[i]);
        }
    }
}
