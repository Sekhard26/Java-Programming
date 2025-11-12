import java.util.Stack;
public class reverseAStack {
  
        public static void reverse(Stack<Integer> s, Stack<Integer> s1){
            if(s.isEmpty()){
                return;
            }
            int top= s.pop();
            s1.push(top);
            reverse(s,s1);
            
        }
        public static void main(String[] args) {
            Stack<Integer> s= new Stack<>();
            Stack<Integer> s1= new Stack<>();
            s.push(1);
            s.push(2);
            s.push(3);
            s.push(4);
            System.out.print("Stack 1: ");
            System.out.println(s);
           reverse(s,s1);
            System.out.print("Stack 2: ");
            System.out.println(s1);
            
        }
    }

