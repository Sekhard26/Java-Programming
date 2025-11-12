public class fibonnaci {
    public static int fib(int a) {
        if(a==1)
         return 1;
        else if(a==0)
         return 0;
        return fib(a-1)+fib(a-2);
    }
    public static void main(String[] args) {
        int a=5;
        for(int i=0;i<a;i++){
            System.out.print(fib(i));
        }
    }
}
 