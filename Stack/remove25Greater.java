public class remove25Greater {
     Node head;
   class Node{
        int data;
        Node next;

         Node(int data){
            this.data= data;
            this.next=null;
        }
    }
        //print the ll;

        public  void add(int data){
            Node newNode= new Node(data);
            if(head==null){
                head= newNode;
                return;
            }

            Node curr= head;
            while(curr.next!=null){
                curr= curr.next;

            }
            curr.next= newNode;

        }
        //remove 25
        public void remove(){
             
            if(head==null){
                return;
            }
            if(head!=null && head.data>=25){
                head=head.next;
                return;
            }

            Node curr= head;
            while(curr.next!=null){
                if(curr.next.data>=25){
                    curr.next=curr.next.next;
                }
                curr= curr.next;
            }

            
        }
        //print

          public  void printll(){
            Node curr= head;

            if(head==null)
            System.out.print("String is empty!");
            while(curr!=null){
                System.out.print(curr.data+" -> ");
                curr= curr.next;
            }
            System.out.println("null");
        }
        public static void main(String[] args) {
           remove25Greater r= new remove25Greater();
           r.add(1);
           r.add(2);
           r.add(3);
           r.add(25);
           r.add(4);
           System.out.print("Before delete");
           r.printll();
            r.remove();
            System.out.print("After delete");
            r.printll();
        }
    }

