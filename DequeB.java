import java.util.*;
import java.util.LinkedList;
public class DequeB{  //add last remove first && add first remove last
    public static void main(String[] args){
        Deque<Integer> deque=new LinkedList<>();
        deque.addFirst(1);
        deque.addFirst(2);
        deque.addLast(3);
        deque.addLast(4);
        System.out.println(deque);
        deque.removeFirst();
        deque.removeLast();
        System.out.println(deque);

    }
}