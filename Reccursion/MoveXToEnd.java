public class MoveXToEnd {
    public static String move(String a, int idx, int c, StringBuilder sb) {
        char curr= a.charAt(idx);
        if(idx==a.length()-1){
            for(int i=0;i<c;i++){
                sb.append('x');
            }
            return sb.toString();
        }
        if(curr=='x'){
            
           return  move(a, idx+1, c+1, sb);
        }
        else{
            sb.append(curr);
            return move(a, idx+1, c, sb);
        }
        
    }
    public static void main(String[] args) {
        String a= "axbcxxd";
        System.out.println(move(a, 0, 0, new StringBuilder()));
    }
}
