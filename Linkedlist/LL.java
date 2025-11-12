public class LL {

    private int size=0;
    LL(){
        this.size=size;
    }
    Node head;
    class Node{
        String data;
        Node next;
        
        Node(String data){
            this.data= data;
            this .next= null;
        }
        
    }
    //add first
    public  void addFirst(String data) {
        Node newNode= new Node(data);
        
        if(head== null){
            head= newNode;
            size++;
            return;
        }
        else{
            newNode.next= head;
        head= newNode;
        size++;
        }
    }

    //add last
    public void addlast(String data){
        Node newNode= new Node(data);
        if(head==null){
           head= newNode;
           size++;
            return;
        }

        else{
            Node currNode= head;
            while(currNode.next!=null){
            currNode=currNode.next;
        }
        currNode.next= newNode;
        size++;
        }
    }
//print LL
    public void printll(){
        Node currNode= head;
        if(head==null){
        System.out.print("ll is empty.");
        return;
         }
        while(currNode!=null){
            System.out.print(currNode.data+" -> ");
            currNode= currNode.next;
        }
        
        System.out.println("null");
        
    }

//delete first

    public void deleteFirst(){
        if(head==null){
            System.out.print("The ll is empty");
            return;
        }
        
        else{
            head= head.next;
        size--;
        }
    }

//delete last

    public void deleteLast(){
        if(head==null){
            System.out.print("The ll is empty");
            return;
        }
        Node lastNode= head.next;
        Node secondlastNode= head;
        if(head.next==null){
            head=null;
            size--;
            return;
        }

        else{
            while(lastNode.next!=null){
            lastNode=lastNode.next;
            secondlastNode= secondlastNode.next;
        }
        secondlastNode.next=null;
        size--;
        }
    }    

    public int getSize(){
        return size;
    }
    public static void main(String[] args) {
        LL list= new LL();
        list.addFirst("a");
        list.addFirst("is");
        list.addlast("list");
        list.printll();

        list.addFirst("This");
        list.printll();
        list.deleteFirst();
        list.printll();
        list.deleteLast();
        list.printll();

        System.out.print(list.getSize());
    }
}