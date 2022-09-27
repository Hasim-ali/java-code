public class BinaryTreeNodeCount {
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
    
        public static int countnode(Node root){
            if(root==null){
                return 0;
            }
            int leftnode=countnode(root.left);
            int rightnode=countnode(root.right);

            return leftnode+rightnode+1;
        }


        public static void main(String[] args) {
        int nodes[]={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        BinaryTree Build=new BinaryTree();
        Node root=Build.BuildTree(nodes);

        System.out.println(countnode(root));
        }
}
