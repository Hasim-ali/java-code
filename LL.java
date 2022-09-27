public class LL {
    Node head;
    private int size;

    LL(){
        this.size=0;
    }

    class Node{
        int data;
        Node next;

        Node(int data){
            this.data=data;
            this.next=null;
            size++;
        }
    }

    //add first

    public void AddFirst(int data){
        Node newNode=new Node(data);
        if(head==null){
            head=newNode;
            return;
        }

        newNode.next=head;
        head=newNode; 
    }

    // add last

    public void AddLast(int data){
        Node newNode=new Node(data);
        if(head==null){
            head=newNode;
            return;
        }

        Node currNode = head;
        while(currNode.next!=null){
            currNode=currNode.next;
        }

        currNode.next=newNode;
    }

    //print list

    public void PrintList(){
        if(head==null){
            System.out.println("List is empty");
            return;
        }

        Node currNode = head;
        while(currNode!=null){
            System.out.print(currNode.data +"->");
            currNode=currNode.next;
        }
        System.out.println("NULL");
    }

    //delete first

    public void DeleteFirst(){
        if(head==null){
          System.out.println("list is empty");
          return;
        }
        size--;
        head=head.next;
      }
  
      //delete last
  
      public void DeleteLast(){
        if(head==null){
          System.out.println("list is empty");
          return;
        }
        size--;
        if(head.next==null){
          head=null;
          return;
        }
  
        Node secondLast=head;
        Node LastNode=head.next;
        while(LastNode.next!=null){
          LastNode=LastNode.next;
          secondLast=secondLast.next;
        }
        secondLast.next=null;
      }
  
      // get the size of the linklist
      
      public int getsize(){
        return size;
      }

      //reverse the link lsit

      public void reverseIterate(){
        if(head==null || head.next==null){
            return;
        }

        Node prvNode=head;
        Node currNode=head.next;
        while(currNode!=null){
            Node nextNode=currNode.next;
            currNode.next=prvNode;

            // update
            prvNode=currNode;
            currNode=nextNode;
        }
        head.next=null;
        head=prvNode;
      }

      //using recurtion reverse the link list

      public Node reverseRecursive(Node head){
        if(head==null || head.next==null){
            return head;
        }
        Node newHead=reverseRecursive(head.next);
        head.next.next=head;
        head.next=null;

        return newHead;
      }
  

    public static void main(String[] args) {
        LL List=new LL();
        List.AddFirst(1);
        List.AddLast(2);
        List.AddLast(3);
        List.AddLast(4);
        List.PrintList();
        List.reverseIterate();
        List.PrintList();

        List.head=List.reverseRecursive(List.head);
        List.PrintList();

    }
}
