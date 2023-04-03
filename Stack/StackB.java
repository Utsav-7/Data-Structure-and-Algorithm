public class StackB{   // Last in First out LIFO
    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    static class Stack{
        static Node head=null;
        public static boolean isEmpty(){  //here we check the stack is empty or not condn:head==null
            return head==null;
        }
        //push for stack
        public static void push(int data){  //add first of linkedlist
            Node newNode =new Node(data);
            if(isEmpty()){
                head=newNode;
                return;
            }
            newNode.next=head;   //here we take head as top of stack
            head=newNode;
        }
        //pop for stack
        public static int pop(){   //remove first of linkedlist
            if(isEmpty()){
                System.out.println("Stack is empty");
                return -1;
            }
            int top=head.data;
            head=head.next;
            return top;
        }
        //peek for stack
        public static int peek(){
            if(isEmpty()){
                System.out.println("Stack is empty");
                return -1;
            }
            return head.data;
        }
    }
    public static void main(String[] args){
        Stack s=new Stack();
        s.push(1);
        s.push(2);
        s.push(3);
        while(!s.isEmpty()){
            System.out.println(s.peek());
            s.pop();
        }
    }
}