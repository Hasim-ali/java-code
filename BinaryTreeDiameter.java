public class BinaryTreeDiameter {
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

    public static int Diameter(Node root){
        if(root==null){
            return 0;
        }

        int diam1=Diameter(root.left);
        int diam2=Diameter(root.right);
        int diam3=hightOfnode(root.left)+hightOfnode(root.right)+1;

        return Math.max(diam3,Math.max(diam1,diam2));
    }

    static class Treeinfo{
        int ht;
        int diam;
        Treeinfo(int ht,int diam){
            this.ht=ht;
            this.diam=diam;
        }
    }

    public static Treeinfo diameter2(Node root){

        if(root==null){
            return new Treeinfo(0,0);
        }

        Treeinfo left=diameter2(root.left);
        Treeinfo right=diameter2(root.right);

        int myhight=Math.max(left.ht,right.ht)+1;

        int diam1=left.diam;
        int diam2=right.diam;
        int diam3=left.diam+right.diam+1;

        int mydiam=Math.max(Math.max(diam1,diam2),diam3);

        Treeinfo myinfo=new Treeinfo(myhight, mydiam);

        return myinfo;
    }

    public static void main(String[] args) {
        int nodes[]={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        BinaryTree build=new BinaryTree();
        Node root=build.BuildTree(nodes);

        System.out.println(diameter2(root).diam);

    }
}
