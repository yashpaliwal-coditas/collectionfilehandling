package collectionsassignement.daytwo;
import java.util.NavigableMap;
import java.util.TreeMap;
public class ExampleNavigableMap {
    public static void main(String[] args) {
        NavigableMap<String, Integer> navMap = new TreeMap<>();
        navMap.put("apple", 1);
        navMap.put("banana", 2);
        navMap.put("cherry", 3);
        navMap.put("date", 4);
        navMap.put("elderberry", 5);
        String firstKey = navMap.firstKey();
        System.out.println("First key: " + firstKey);
        // Find the last entry in the map
        String lastKey = navMap.lastKey();
        System.out.println("Last key: " + lastKey);
        // Find the entry with the closest key that is less than "cherry"
        String lowerKey = navMap.lowerKey("cherry");
        System.out.println("Lower key: " + lowerKey);
        // Find the entry with the closest key that is less than or equal to "cherry"
        String floorKey = navMap.floorKey("cherry");
        System.out.println("Floor key: " + floorKey);
        // Find the entry with the closest key that is greater than or equal to "cherry"
        String ceilingKey = navMap.ceilingKey("cherry");
        System.out.println("Ceiling key: " + ceilingKey);
        // Find the entry with the closest key that is greater than "cherry"
        String higherKey = navMap.higherKey("cherry");
        System.out.println("Higher key: " + higherKey);
        // Get a submap of the entries with keys between "banana" (inclusive) and "elderberry" (exclusive)
        NavigableMap<String, Integer> subMap = navMap.subMap("banana", false, "elderberry", false);
        System.out.println("Submap: " + subMap);
    }
}
//First key: apple
//Last key: elderberry
//Lower key: banana
//Floor key: cherry
//Ceiling key: cherry
//Higher key: date
//Submap: {cherry=3, date=4}
//
//Process finished with exit code 0