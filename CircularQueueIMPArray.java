public class CircularQueueIMPArray {
    static class queue{
        static int arr[];
        static int size;
        static int rear=-1;
        static int front=-1;
        queue(int n){
            arr=new int [n];
            this.size=n;
        }

        public static boolean isEmpty(){
            return rear==-1 && front==-1;
        }

        public static boolean isFull(){
            return (rear+1)%size==front;
        }

        public static void add(int data){
            if(isFull()){
                System.out.println("queue is full");
                return;
            }
            if(front==-1){
                front=0;
            }

            rear=(rear+1)%size;
            arr[rear]=data;
        }

        public static int remove(){
            if(isEmpty()){
                System.out.println("Queue is empty");
                return -1;
            }

            int top= arr[0];

            if(rear==front){
                rear=front=-1;
            } else{
                front=(front+1)%size;
            }
            return top;
        }

        public static int peek(){
            if(isEmpty()){
                System.out.println("Queue is empty");
                return-1;
            }

            return arr[front];
        }
    }

    public static void main(String[] args) {
        queue q=new queue(5);

        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);

        while(!q.isEmpty()){
            System.out.println(q.peek());
            q.remove();
        }

        q.add(5);
        q.add(6);
        while(!q.isEmpty()){
            System.out.println(q.peek());
            q.remove();
        }
    }
}
