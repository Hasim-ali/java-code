public class BinaryTreeHight {
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

    public static int hightOfnode(Node root){
        if(root==null){
            return 0;
        }

        int lefthight=hightOfnode(root.left);
        int righthight=hightOfnode(root.right);

        int treeHight=Math.max(lefthight,righthight)+1;

        return treeHight;
    }

    public static void main(String[] args) {
        int nodes[]={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        BinaryTree build=new BinaryTree();
        Node root=build.BuildTree(nodes);

        System.out.println(hightOfnode(root));

    }
}
