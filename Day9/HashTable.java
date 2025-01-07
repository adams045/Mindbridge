import java.util.Hashtable;
import java.util.Map;

public class HashTable{
    public static void main(String[] args) {
        Hashtable<String,String> hashTable = new Hashtable<>();
        hashTable.put("John", "987654321");
        hashTable.put("Bob", "123456789");
        hashTable.put("Alice", "784323110");

        for (Map.Entry<String, String> entry : hashTable.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

        String removeName = "Bob";
        if (hashTable.containsKey(removeName)) {
            hashTable.remove(removeName);
            System.out.println("\nAfter removing " + removeName + ":");
            System.out.println();
        } else {
            System.out.println("\nContact " + removeName + " not found.");
        }

        for (Map.Entry<String, String> entry : hashTable.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}