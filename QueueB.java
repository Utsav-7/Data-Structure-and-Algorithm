public class QueueB{        //First in First out (FIFO) && add last remove first
    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    static class Queue{
        static Node head=null;
        static Node tail=null;

        public static boolean isEmpty(){
            return head==null && tail==null;
        }
        //add
        public static void add(int data){  //addLast of linkedlist
            Node newNode=new Node(data);
            if(head==null){
                head=tail=newNode;
                return;
            }
            tail.next=newNode;
            tail=newNode;
        }

        //remove
        public int remove(){    //remove first of linkedlist
            if(isEmpty()){
                System.out.println("Queue is empty");
                return -1;
            }
            int front=head.data;
            //single element
            if(head==tail){     //size==1
                head=tail=null;
            }else{
                head=head.next;
            }
            return front;
        }
        //peek
        public static int peek(){
            if(isEmpty()){
                System.out.println("Stack is empty");
                return -1;
            }
            return head.data;
        }
    }
    public static void main(String[] args){
        Queue s=new Queue();
        s.add(1);
        s.add(2);
        s.add(3);
        while(!s.isEmpty()){
            System.out.println(s.peek());
            s.remove();
        }
    }
}