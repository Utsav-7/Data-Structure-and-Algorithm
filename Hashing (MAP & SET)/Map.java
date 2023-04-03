import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.TreeMap;
import java.util.*;

public class Map{
    public static void main(String[] args) {
        //create
        HashMap<String,Integer> hm=new HashMap<>();
        // LinkedHashMap<String,Integer> hm=new LinkedHashMap<>();
        // TreeMap<String,Integer> hm=new TreeMap<>();

        //Insert T.C = O(1)
        hm.put("India",135);
        hm.put("China",125);
        hm.put("USA",50);
        hm.put("Nepal",5);

        //Iteration
        Set<String> keys=h.keySet();
        System.out.println(keys);

        for(String k:keys){
            System.out.print("Key: "+k+" Value: "+hm.get(k));
        }

        System.out.println(hm);  //print map

        //get --> T.C = O(1)
        int popu=hm.get("India");
        System.out.println(popu);

        //contains key
        System.out.println(hm.containsKey("India"));
        System.out.println(hm.containsKey("Brazil"));

        //remove
        System.out.println(hm.remove("China"));
        System.out.println(hm);

        //size
        System.out.println(hm.size());

        //IsEmpty
        System.out.println(hm.isEmpty());

        //clear
        System.out.println(hm.clear());
    }
}



/* HashMap ---> print in random order       (insert,remove,search,put,get,containsKey,remove)--->T.C = O(1)
   LinkedHashMap---> print in inserted order(insert,remove,search,put,get,containsKey,remove)--->T.C = O(1)
   
   TreeMap ----> print in ascending order with respect to key   (put,get,remove)---> T.C = O(logn)
 */
