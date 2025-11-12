public class nos {
    public static int no(int a){
        if (a<=0){
            return 1;
        }
        System.out.print(a);
         return no(a-1);
    }
    public static void main(String[] args) {
        int a=5;
        no(a);
    }
}
