import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class Set {
    public static void main(String[] args) {
        HashSet<Integer> set=new HashSet<>();
        // LinkedHashSet<Integer> set=new LinkedHashSet<>();
        // TreeSet<Integer> set=new TreeSet<>();
        
        //add
        set.add(1);
        set.add(4);
        set.add(3);
        set.add(1);
        set.add(2);
        set.add(5);
        set.add(4);

        System.out.println(set);

        //Iteration using 1)Iterator 2)Enhanced for loop
        
        //Method-1: Iterator
        Iterator it=set.iterator();
        while(it.hasNext()){
            System.out.print(it.next()+ " ");
        }
        System.out.println();

        //Method-2: Enhanced for loop
        for(Integer num:set){
            System.out.print(num+" ");
        }
        System.out.println();


        //remove
        System.out.println(set.remove(2));

        //contains
        System.out.println(set.contains(2));

        //size
        System.out.println(set.size());

        //isEmpty()
        System.out.println(set.isEmpty());
    }
}


/* HashSet ---> print in random order       
   LinkedHashSet---> print in inserted order
   
   TreeSet ----> print in ascending order
 */