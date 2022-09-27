public class BinaryTreeBuildCheck {

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

    //preorder print               root-left-right
    public static void preorder(Node root){
        if(root==null){
            return;
        }
        System.out.print(root.data+" ");
        preorder(root.left);
        preorder(root.right);
    }

    // in order print            left-root-right
    public static void inorder(Node root){
        if(root==null){
            return;
        }

        inorder(root.left);
        System.out.print(root.data+" ");
        inorder(root.right);
    }


    //postorder print          left-right-root
    public static void postorder(Node root){
        if(root==null){
            return;
        }

        postorder(root.left);
        postorder(root.right);
        System.out.print(root.data+" ");
    }
    
    public static void main(String[] args) {
        int nodes[]={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        BinaryTree Build=new BinaryTree();
        Node root= Build.BuildTree(nodes);

        // System.out.println(root.data);

        //preorder sequence print
        preorder(root);
        System.out.println();

        //inorder sequence print
        inorder(root);
        System.out.println();

        //postorder sequence print
        postorder(root);
    }
}
