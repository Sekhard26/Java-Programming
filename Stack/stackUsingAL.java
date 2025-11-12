import java.util.ArrayList;

public class stackUsingAL {
   
    public static class Stack{
        //is empty
       static ArrayList<Integer> list= new ArrayList<>();
                public static boolean isEmpty(){
            if(list.size()==0){
            return true;
        }
        return false;
    }
    //push operation
        public static void push(int a){
           list.add(a);

        }

        //pop operation
        public static int pop(){
            if(isEmpty()){
                return -1;
            }
            int top= list.get(list.size()-1);
            list.remove(list.size()-1);
            return top;
        }
        //peek operation
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