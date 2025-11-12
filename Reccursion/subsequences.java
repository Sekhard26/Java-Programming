public class subsequences {
    public static void sub(String a, int i, String newString) {
      if(i==a.length()){
        System.out.print(newString);
        return;
      }
        char curr= a.charAt(i);
        sub(a, i+1, newString+curr);

        sub(a, i+1, newString);
    }
    public static void main(String[] args) {
        String a= "aaa";
        sub(a, 0, " ");
    }
}
