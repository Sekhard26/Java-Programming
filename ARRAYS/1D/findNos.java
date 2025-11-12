import java.util.Scanner;
public class findNos {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the size: ");
        int size= sc.nextInt();
        int nos[]= new int[size];

        System.out.print("Enter the nos: ");
        //input

        for(int i=0;i<size;i++){
            nos[i]= sc.nextInt();
        }
        System.out.print("Enter the no to find: ");
        int a= sc.nextInt();
        //output

        for(int i=0;i<size;i++){
            if(nos[i]==a)
            System.out.println("find and the index no is "+i);
            else
            System.out.print("Invalid no.");
        }
    }
}
