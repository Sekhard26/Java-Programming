import java.util.Stack;
public class pushAtTheBottomOfStack {
    public static void pushAtEnd(int data, Stack<Integer> s){
       if(s.isEmpty()){
        s.push(data);
        return;
       }

       int top= s.peek();
       s.pop();
       pushAtEnd(data, s);
       s.push(top);
    }
    public static void main(String[] args) {
        Stack<Integer> s= new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);
        pushAtEnd(4, s);
        while (!s.isEmpty()) {
            System.out.println(s.pop());
        }

    }
}
