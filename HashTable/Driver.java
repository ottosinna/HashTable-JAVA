public class Driver {
    public static void main(String[] args) {

        HashTable<String, Integer> hashTable = new HashTable<>(10);

        print("Size: " + hashTable.size());
        print("Is Empty: " + hashTable.isEmpty());
        hashTable.remove("E");
        hashTable.remove("F");

        //new values
        hashTable.put("A", 25);
        hashTable.put("B", 30);
        print("Size]: " + hashTable.size());
        print("Is Empty: " + hashTable.isEmpty());

        //search 
        print("Search 'E': " + hashTable.get("A"));
        print("Search 'A': " + hashTable.get("A"));
        print("Search 'B': " + hashTable.get("B"));

        //add items
        hashTable.put("C", 35);
        hashTable.put("D", 40);
        hashTable.put("E", 45);
        hashTable.put("F", 50);
        print("Size]: " + hashTable.size());
        print("Contains key 'C': " + hashTable.contains("C"));

        //Removing
        hashTable.remove("F");
        print("Size]: " + hashTable.size());
        hashTable.remove("A");
        print("Size]: " + hashTable.size());
        hashTable.remove("G");
        //Remove all
        hashTable.remove("B");
        hashTable.remove("C");
        hashTable.remove("D");
        hashTable.remove("E");
        print("Size]: " + hashTable.size());

        print("Contains key 'C': " + hashTable.contains("C"));

       
    }

    public static void print(String s){
        System.out.println(s);
    }
}