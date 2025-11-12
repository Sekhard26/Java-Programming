public class no1_5 {
    public static int r(int a){
        if(a>5) 
        return 5;
        System.out.print(a);
        return r(a+1);


    }
    public static void main(String[] args) {
        int a=1;
        r(a);
    }
}