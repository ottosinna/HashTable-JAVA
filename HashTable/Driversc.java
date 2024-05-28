import java.util.Scanner;

public class Driversc {
    public static void main(String[] args) {
        HashTable<Integer, String> table = new HashTable<>(5); // Creating a hash table with size 5
        Scanner scanner = new Scanner(System.in);

        int option = -1;

        while (option != 0) {
            printMenu();
            System.out.print("Enter your option: ");
            option = scanner.nextInt();

            switch (option) {
                case 0:
                    print("Exiting...");
                    break;
                case 1:
                    System.out.print("Enter key (Number): ");
                    int key = scanner.nextInt();
                    System.out.print("Enter value (String): ");
                    String value = scanner.next();
                    table.put(key, value);
                    break;
                case 2:
                    System.out.print("Enter key to get value: ");
                    int getKey = scanner.nextInt();
                    print("Value for key " + getKey + ": " + table.get(getKey));
                    break;
                case 3:
                    System.out.print("Enter key to check: ");
                    int checkKey = scanner.nextInt();
                    print("Contains key " + checkKey + "? " + table.contains(checkKey));
                    break;
                case 4:
                    System.out.print("Enter key to remove: ");
                    int removeKey = scanner.nextInt();
                    table.remove(removeKey);
                    break;
                case 5:
                    print("Is empty? " + table.isEmpty());
                    break;
                case 6:
                    print("Size: " + table.size());
                    break;
            }
        }
        scanner.close();
    }

    private static void printMenu() {
        print("Menu");
        print("0: Exit Application");
        print("1: Put an item into the Hash Table");
        print("2: Get an item from the Hash Table");
        print("3: Check if key exists in the Hash Table");
        print("4: Remove an item from the Hash Table");
        print("5: Check if the Hash Table is empty");
        print("6: Get the size of the Hash Table");
        print("");
    }
    public static void print(String s){
		System.out.println(s);
	}
}
