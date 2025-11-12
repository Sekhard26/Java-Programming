public class permutationOfString {
    public static void permutation(String a, String perm, int idx) {
        if(a.length()==0){
            System.out.println(perm);
            return;
        }
        for(int i=0;i<a.length();i++){
            char curr= a.charAt(i);
            String newString= a.substring(0, i)+a.substring(i+1);
            permutation(newString, perm+curr, idx);
        }
        
    }
    public static void main(String[] args) {
        String a= "ABC";
        permutation(a, "", 0);
    }
}