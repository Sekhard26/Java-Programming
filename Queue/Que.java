public class Que {
    public static class Queue{
    static int arr[];
    static int size;
        static int rear= -1;
    Queue(int n){
        this.size= n;
         arr= new int[n];
    }

    //is Empty
    public static boolean isEmpty(){
        if(rear ==-1)
        return true;
        return false;
    }

    //add
    public static void add(int data){
        if(rear==size-1){
            System.out.print("Queue is full.");
            return;
        }

        rear++;
        arr[rear]= data;
    }

    //remove

    public static int remove(){
        if(isEmpty()){
            return -1;
        }

        int front=arr[0];
        for(int i=0;i<rear;i++){
            arr[i]= arr[i+1];
        }
        rear--;
        return front;

    }

    //peek
    public static int peek(){
        if(isEmpty()){
            return -1;
        }

        int front= arr[0];
        return front;
    }

}

    public static void main(String[] args) {

        Queue q= new Queue(5);
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        System.out.print("front -> [ ");
        while (!q.isEmpty()) {
        System.out.print(q.peek()+ " ");
        q.remove();
        }
        System.out.print("] <- back");


        
    }
}