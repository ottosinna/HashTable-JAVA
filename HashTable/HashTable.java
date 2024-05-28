public class HashTable<Key, Value> implements HashTableInterface<Key, Value> {

	private HashItem[] hashTable;
	private int pairs; // number of items (key/value pairs) in the table
	private int size;  // table size (aka array size)

	private static class HashItem {
		public final Object key;
		public Object val;
		
		public HashItem(Object key, Object val) {
			this.key = key;
			this.val = val;
		}
	}
	
	public HashTable(int size) {
		hashTable = new HashItem[size];
		this.size = size;
	}
	
	// hash function
	private int hash(Key k) {
		return (k.hashCode() & 0x7fffffff) % size;
	}
	
	// add item into hash table
	public void put(Key k, Value v) {
		if(k == null || v == null) {
			System.out.println("key or value null, unable to insert item.");
			return;
		}

		// generate index using hash function
		int index = hash(k);
		
		// no support for collisions!
		if(hashTable[index] != null) {
			// Collision!!
			System.out.println("Collision occurred, unable to insert. Try a different key.");
			// the other option is to "overwrite" the value
			// hashTable[index].val = v;
			// return;
		}		
		else if(pairs != size) {
			HashItem item = new HashItem(k, v);
			hashTable[index] = item;
			pairs++;
		}
		else {
			System.out.println("Table is full.");
		}
	}
	
	public void remove(Key k) {
		if(k == null){
			System.out.println("Empty table");
		}
		int index = hash(k);
		if(hashTable[index] != null) { // Collision!!
			System.out.println("Collision occurred, unable to insert. Try a different key.");
			return;
		}
		else if(hashTable[index].key.equals(k)){
			hashTable[index] = null;
			pairs--;
		} else {
			System.out.println("Key not found in the table.");
		}

		/*if(size == 1) {
			k = null;
			size = 0;				
		}
		else {
			size--;			
		}*/
	}
		
	
	public Value get(Key k) {
		if(k == null) {
			System.out.println("Key is null, unable to get.");
			return null;
		}
		
		if(pairs == 0) {
			System.out.println("Table is empty.");
			return null;
		}
		
		int index = hash(k);
		
		if(hashTable[index] != null && hashTable[index].key.equals(k)) {
			return (Value) hashTable[index].val;
		}
		
		System.out.println("get failed! Unable to find key.");
		return null;		
	}
	
	public boolean contains(Key k) {
		if (k == null) {
			System.out.println("Key is null");
			return false;
		}
	
		for (int i = 0; i < hashTable.length; i++) {
			HashItem item = hashTable[i];
			if (item != null && item.key.equals(k)) {
				return true; // Key found in the hash table
			}
		}
	
		return false;
	}
	
	public boolean isEmpty() {
		return pairs == 0;
	}
	
	public int size() {
		return size;
	}
}