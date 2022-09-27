import java.util.*;
public class BinaryTreeLevelOrder {
    static class Node{
        int data;
        Node left;
        Node right;

        Node(int data){
            this.data=data;
            this.left=null;
            this.right=null;
        }
    }

    static class BinaryTree{
        static int idx=-1;
        public static Node BuildTree(int [] nodes){
            idx++;
            if(nodes[idx]==-1){
                return null;
            }

            Node newnode=new Node(nodes[idx]);
            newnode.left=BuildTree(nodes);
            newnode.right=BuildTree(nodes);

            return newnode;
        }
    }
                                                                   //levelorder 

    public static void levelorder(Node root){
        if(root==null){
            return;
        }

        Queue<Node> q=new LinkedList<>();
        q.add(root);
        q.add(null);

        while(!q.isEmpty()){
            Node currnnode=q.remove();
            if(currnnode==null){
                System.out.println();
                if(q.isEmpty()){
                    break;
                } else{
                    q.add(null);
                }
            } else{
                System.out.print(currnnode.data+" ");
                if(currnnode.left!=null){
                    q.add(currnnode.left);
                }
                if(currnnode.right!=null){
                    q.add(currnnode.right);
                }

            }
        }
    }

    public static void main(String[] args) {
        int nodes[]={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        BinaryTree Build=new BinaryTree();
        Node root=Build.BuildTree(nodes);

        levelorder(root);
    }
}
