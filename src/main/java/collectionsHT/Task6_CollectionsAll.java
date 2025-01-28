package collectionsHT;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.TreeMap;
import java.util.TreeSet;

public class Task6_CollectionsAll {

	public static void main(String[] args) {
		
		ArrayList<String> list = new ArrayList<>();
        list.add("Apple");
        list.add("Banana");
        list.add("Cherry");
        
        System.out.println(list);
        
        
        LinkedList<String> list1 = new LinkedList<>();
        list1.add("Apple");
        list1.add("Banana");
        list1.add("Cherry");
        
        System.out.println(list1);
        
        HashMap<String, Integer> map = new HashMap<>();
        map.put("Apple", 1);
        map.put("Banana", 2);
        map.put("Cherry", 3);
        
        System.out.println(map);
        
        LinkedHashMap<String, Integer> map1 = new LinkedHashMap<>();
        map1.put("Apple", 1);
        map1.put("Banana", 2);
        map1.put("Cherry", 3);

        System.out.println(map1);
        
        
        HashSet<String> hashset = new HashSet<>();
        hashset.add("Apple");
        hashset.add("Banana");
        hashset.add("Cherry");
        
        System.out.println(hashset);
        
        LinkedHashSet<String> linkedhashset = new LinkedHashSet<>();
        linkedhashset.add("Apple");
        linkedhashset.add("Banana");
        linkedhashset.add("Cherry");

        System.out.println(linkedhashset);
        
        TreeSet<String> treeset = new TreeSet<>();
        treeset.add("Apple");
        treeset.add("Banana");
        treeset.add("Cherry");
        
        System.out.println(treeset);
        
        
        TreeMap<String, Integer> treemap = new TreeMap<>();
        treemap.put("Apple", 1);
        treemap.put("Banana", 2);
        treemap.put("Cherry", 3);
        
        System.out.println(treemap);

	}

}
