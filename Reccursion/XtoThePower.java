public class XtoThePower {
    public static int sq(int a, int n) {
        if(n==0) return 1;
        if(a==0)return 0;
        return a*sq(a, n-1);
        
    }
    public static void main(String[] args) {
        int a=3,n=2;
        System.out.print(sq(a, n));
    }
}