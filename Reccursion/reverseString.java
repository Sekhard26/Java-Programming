public class reverseString {
    public static void str(String a, int n) {
        if(n==0){
            System.out.print(a.charAt(n));
            return;
        }
        System.out.print(a.charAt(n));
         str(a, (n-1));
        
    }
    public static void main(String[] args) {
        String a= "abcd";
        int n= a.length();
        str(a, n-1);;
    }
    
}
