public class removeDuplicates {
public static void rmeove(String a, int i, StringBuilder sb, boolean seen[]) {
    char curr= a.charAt(i);
    
    if(i==a.length()-1){
        System.out.print(sb.toString());
        return;
    }
    
    if(seen[curr-'a']==false){
    sb.append(curr);
    seen[curr -'a']=true; 
    }
    rmeove(a, i+1, sb, seen);
}


    public static void main(String[] args) {
        String a= "abbccda";
        rmeove(a, 0, new StringBuilder(), new boolean[26]);
    }
}