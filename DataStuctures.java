import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class DataStuctures {
    public static void printIterable(Collection<Integer> coll) {
        for (int num : coll) {
            System.out.println(num);
        }
    }
    public static void main(String[] args) {
        // Collection is the root interface for collections like: List, Set, Queue
            // No ordering guarantee
            // No index access
            // No duplicate rules
        
        // ArrayList is ordered
        Collection<Integer> coll = new ArrayList<Integer>();
        
        coll.add(4);
        coll.add(6);
        coll.add(7);
        coll.add(9);
        
        DataStuctures.printIterable(coll);

        // You use List Interface when your logic depends on order or position.
        List<Integer> list = new ArrayList<Integer>();
        list.add(3);
        list.add(6);
        list.add(9);

        // index access
        System.out.println(list.get(2));
        System.out.println(list.indexOf(3));
        
        // No duplicate, unordered
        Set<Integer> set = new HashSet<Integer>();
        // No duplicate, sorted order
        Set<Integer> set1 = new TreeSet<Integer>();
       
        set.add(8);
        set.add(7);
        set.add(3);
        set.add(3);
        
        set1.add(9);
        set1.add(2);
        set1.add(1);
        set1.add(1);

        System.out.println(set);
        System.out.println(set.contains(3));

        DataStuctures.printIterable(set);
        DataStuctures.printIterable(set1);

        System.out.println("\n");

        // Interator
        Iterator<Integer> iter = list.iterator();
        while(iter.hasNext()){
            System.out.println(iter.next());
        }

        // Map is not part of the Collection hierarchy because it stores key–value pairs, not individual elements.
        // if using multiple threads then it is better to use Hashtable, it is synchronized.
        Map<String, Integer> studMarks = new HashMap<>(); // unordered 
        
        studMarks.put("Vedant", 78);
        studMarks.put("Raju", 45);
        studMarks.put("Rinki",67);
        
        System.out.println(studMarks);


    }
}
