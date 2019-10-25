package LAB11;
import java.util.*;

class HashMapDemo {
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>();
        for (int i = 0; i < 10; i++) {
            map.put((i + 1), "Student " + (i + 1));
        }
        map.put(3, "Student 300"); // update value at third position
        System.out.println(map);
        Set<Map.Entry<Integer, String>> keySet = map.entrySet();
        for (Map.Entry<Integer, String> val : keySet) {
            System.out.print("Key: " + val.getKey() + " AND ");
            System.out.println("Value: " + val.getValue());
        }

        System.out.println(" size of map is : " + map.size());
        System.out.println(" keys sets are " + map.keySet());
        System.out.println("values set are " + map.values());
    }
}