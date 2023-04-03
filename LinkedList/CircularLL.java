public class CircularLL{
    public static class Node{     // Node class for create Node
        int data;
        Node next;
        public Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    public static int size;
    public static Node head;
    public static Node tail;

//-------------------add at First------------------------

    public void addFirst(int data)
    {
        //step-1 create a node
        Node newNode=new Node(data);
        if(head==null)    // if no create any node that time head and tail point to newNode
        {
            head=tail=newNode;
            size++;
            return;
        }
        //step-2 assign value of head to newNode
        newNode.next=head;
        //step-3 newNode will be head
        head=newNode;
        size++;
    }

//---------------------add at Last------------------------
    public void addLast(int data)
    {
        //step-1 create a node
        Node newNode=new Node(data);
        if(head==null)
        {
            head=tail=newNode;
            size++;
            return;
        }
        //step-2 
        tail.next=newNode;
        //step-3
        tail=newNode;
        size++;
        tail.next=head;
    }
//--------------------remove from first-----------------------
    public int removeFirst(){
        if(head==null){
            System.out.println("LL is empty");
            return Integer.MIN_VALUE;
        }else if(head==tail){   //size==1
            int val=head.data;
            head=tail=null;
            size=0;
            return val;
        }
        int val=head.data;
        head=head.next;
        size--;
        return val;
    }
//--------------------remove from last-----------------------
public int removeLast(){
    if(head==null){
        System.out.println("LL is empty");
        return Integer.MIN_VALUE;
    }else if(head==tail){   //size==1
        int val=head.data;
        head=tail=null;
        size=0;
        return val;
    }
    //go to prev = size-2
    Node prev=head;
    for(int i=0;i<size-2;i++){
        prev=prev.next;
    }
    int val =prev.next.data; //tail.data
    prev.next=null;
    tail=prev;
    size--;
    tail.next=head;
    return val;
}
//--------------------print LL-----------------------

    public void print(){ 
        if(head==null){
            System.out.println("LL is empty");
            return;
        }
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+"-->");
            temp=temp.next;
        }
        System.out.println("null");
    }
//-------------------------------------------------------
    public static void main(String[] args)
    {
        CircularLL ll=new CircularLL();
        ll.addFirst(2);
        ll.addFirst(1);
        ll.addFirst(0);
        ll.addLast(3);
        ll.addLast(4);
        ll.removeFirst();
        ll.removeLast();
        ll.print();             //print Infinite loop because it is circular
        System.out.println(ll.size);

    }
}