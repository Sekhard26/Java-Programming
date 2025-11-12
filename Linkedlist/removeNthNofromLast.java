public class removeNthNofromLast {
    Node head;
    class Node{
        int data;
        Node next;

        Node(int data){
            this.data= data;
            this.next=null;
        }
    }
    int size=0;
    //add the elements from last
    public void add(int data){
        Node newNode= new Node(data);
        
        if(head==null){
            head= newNode;
            size++;
            return;
        }

        Node curr= head;
        while(curr.next!=null){
            curr=curr.next;
        }
        curr.next= newNode;
        size++;

    }

    //remove the nth node from last
    public Node remove(int n) {
        if(head.next==null){
            return null;
        }

        int idx= size-n;
        Node curr=head;
        
        if(size==n){
            head= head.next;
            return head;
        }

        Node prev= head;
        int i=1;
        while(i<idx){
            prev= prev.next;
            i++;
        }
        prev.next= prev.next.next;
        return head;
    }

    //print LL
    public void printll(){
        Node curr= head;
        while (curr!=null) {
            System.out.print(curr.data+" -> ");
            curr= curr.next;
        
        }
        System.out.println("null");
    }
    public static void main(String[] args) {
        removeNthNofromLast list= new removeNthNofromLast();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);

        System.out.print("Original LL: ");
        list.printll();

        list.remove(2);

        System.out.print("Deleted LL: ");
        list.printll();

    }
}
