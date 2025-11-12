public class preOrder {

    static class Node{
        int data;
        Node right,left;

         Node(int data){
            this.data= data;
            this.right=null;
            this.left=null;
        }
    }

    static class Pre{
        static int idx=-1;
        public static Node build(int arr[]){
            idx++;
            if(arr[idx]==-1){
                return null;
            }

            Node newNode = new Node(arr[idx]);
            newNode.left=build(arr);
            newNode.right= build(arr);
            return newNode;

        }
    }

    public static void preOrderTraverse(Node root){
        if(root==null)
        return ;

        System.out.print(root.data+" ");
        preOrderTraverse(root.left);
        preOrderTraverse(root.right);

       
    }
    public static void main(String[] args) {
         int arr[]={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};

         Pre tree= new Pre();
         Node root= tree.build(arr);
         preOrderTraverse(root);
        
    }
}
