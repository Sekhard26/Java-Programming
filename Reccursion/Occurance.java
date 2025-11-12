public class Occurance {
    public static int first = -1;
    public static int last = -1;
    public static void occur(String a, int idx, char element) {
        char current =a.charAt(idx);
        
        if(idx==a.length()-1){
            System.out.println(first);
            System.out.println(last);
            return;
        }
        if(current==element){
            if(first==-1){
                first=idx;
            }else{
                last=idx;
            }
        }
        occur(a, idx+1, element);

    }
    public static void main(String[] args) {
        String a="abaacdaae";
        occur(a, 0, 'a');
    }
}