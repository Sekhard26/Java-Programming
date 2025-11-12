public class sumOfNatural { 
    public static void s(int i, int a, int sum){
        if(i==a){
            sum+=i;
            System.out.print(sum);
            return;
        }
        sum+=i;
        s(i+1, a, sum);
    }
    public static void main(String[] args) {
        int a=5;
        s(1, a, 0);
  }    
}
