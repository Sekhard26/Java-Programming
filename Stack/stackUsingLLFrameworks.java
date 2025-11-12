import java.util.LinkedList;

public class stackUsingLLFrameworks {
    public static class Stack{
       static  LinkedList<Integer> list= new LinkedList<>();

        public static boolean isEmpty(){
            return list.size()==0;
        }

        //add list
        public static void push(int a){
            list.add(a);
        }

        //pop list
        public static int pop(){
            if(isEmpty()){
                return -1;
            }
            int top= list.get(list.size()-1);
            list.remove(list.size()-1);
            return top;
        }

        //peek list
         public static int peek(){
            if(isEmpty()){
                return -1;
            }
            int top= list.get(list.size()-1);
            return top;
        }
    }
    public static void main(String[] args) {
        Stack s= new Stack();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        s.push(5);

        while(!s.isEmpty()){
            System.out.println(s.peek());
            s.pop();

        }
    }
}
