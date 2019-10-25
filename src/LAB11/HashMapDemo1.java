package LAB11;

import java.util.*;

public class HashMapDemo1 {
    public static void main(String[] args) {
        HashMap<String, ArrayList<Integer>> map = new HashMap<>();
//        Set<String> keys = map.keySet();
//        for (String key : keys) {
//            System.out.println(keys);
//        }

        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add(i);
        }
        for (int i = 1; i < 10; i++) {
            map.put("" + i, list);
        }
        System.out.println(map);
//        System.out.println(map.toString());

//        Collection<ArrayList<Integer>> values = map.values();
        Set<Map.Entry<String, ArrayList<Integer>>> finalSet = map.entrySet();
//        System.out.println(finalSet.toString());
        for (Map.Entry<String, ArrayList<Integer>> stringArrayListEntry : finalSet) {
            System.out.println(stringArrayListEntry.getKey());
            System.out.println(stringArrayListEntry.getValue());
        }
    }
}