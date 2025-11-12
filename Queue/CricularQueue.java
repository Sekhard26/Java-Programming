public class CricularQueue {
    public static class Queue{
        static int arr[];
        static int size, front=-1,rear=-1;
            Queue(int n){
                this.size=n;
                arr= new int[n];
            }

            //is Empty
            public static boolean isEmpty(){
                return rear==-1 &&front==-1;
            }

            //add
            public static void add(int data){
                if((rear+1)%size==front){
                    System.out.print("Queue is full.");
                    return;
                }
                //single element
                if(front==-1){
                front=0;
            }
                rear= (rear+1)%size;
                arr[rear]= data;
            }

            //dequeue

            public static int remove(){
                if(isEmpty()){
                    return -1;
                }

                int result= arr[front];
                //single element
                if(front==rear){
                    rear=front=-1;
                    
                }else{
                    front= (front+1)%size;
                }
                return front;
            }

            //peek

            public static int peek(){
                if(isEmpty()){
                    return -1;
                }
               
                return arr[front];

            }

    }
    public static void main(String[] args) {

        Queue q= new Queue(5);
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);

        System.out.println(q.remove()+" is removed");
        q.add(6);
        System.out.println(q.remove()+" is removed");
        q.add(7);
        while (!q.isEmpty()) {
        System.out.println(q.peek()+ " ");
        q.remove();
        }
        

        
        


        
    }
}
