import java.util.LinkedList;
import java.util.Queue;

public class LevelOrder {

    static class Node{
        int data;
        Node right,left;

         Node(int data){
            this.data= data;
            this.right=null;
            this.left=null;
        }
    }

    static class Tree{
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

    public static void levelOrderTraverse(Node root){
        Queue  q= new LinkedList<>();
        q.add(root);
        q.add(null);
        if(root==null){
            return;
        }
        while (!q.isEmpty()) {
            
            
        }
        
    }
    public static void main(String[] args) {
         int arr[]={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};

         Tree tree= new Tree();
         Node root= tree.build(arr);
       levelOrderTraverse(root);
        
    }
}
