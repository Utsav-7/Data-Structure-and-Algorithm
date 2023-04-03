import java.util.*;
public class Heap{
    public static void main(String[] args) {

        //It is only for derived datatype int,float,double,...
        PriorityQueue<Integer> pq=new PriorityQueue<>();
        //PriorityQueue<Integer> pq=new PriorityQueue<>(Comparator.reverseOrder()); //print in descending order
        pq.add(4); //T.C = O(logn)
        pq.add(3);
        pq.add(7);
        pq.add(5);
        pq.add(8);
        pq.add(2);
        pq.add(9);

        while(!pq.isEmpty()){
            System.out.print(pq.peek()+" ");
            pq.remove(); //T.C = O(logn)
        }
        System.out.println();
    }
}