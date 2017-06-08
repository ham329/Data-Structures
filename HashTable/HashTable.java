//NAME: Aaron Habana
//DATE: 04/12/2017
//ASSIGNMENT: HashTable - HashTable.java
//Purpose: To implement hash table data structure

public class HashTable<Key, Value> {

   private HashItem[] hashTable;
   private final int tableSize = 31;
   private int pairs;
   private int size;
   private int ctr;
   
   private static class HashItem {
   
      private final Object key;
      private Object val;
      
      public HashItem(Object key, Object val) {
         this.key = key;
         this.val = val;
      
      } 
   }
   
   public HashTable(int size) {
      this.size = 5;
      this.ctr = 0;
      hashTable = new HashItem[size];
      System.out.println("\nInitialized an array size of: " + size+"\n");
      
   }
   
   public boolean isEmpty() {
      return size() == 0;
   }
   
   public int getSize() {
      return size;
   }
   public int size(){
      return ctr;
   }
   public void setSize(int size) {
      this.size = size;
   }
   
   public Object get(Key key) {
     
      int idx = hash(key);
      if(hashTable[idx] == null) {
         System.out.println("key["+key+"] does not exist");
         return "Key does not exist";
      }
      return hashTable[idx].val;
   }
   
   public void put(Key key, Value value) {
      int index = hash(key);
      if(index > getSize()){
         setSize(index);  
      }
      
      if(hashTable[index] != null) {
         index++;
         hashTable[index] = new HashItem(key, value);
         System.out.println("Key already exists, moving to next available slot: " + index);
         ctr++;
      }
      if(hashTable[index] == null){
         hashTable[index] = new HashItem(key, value);
         ctr++;
      }
      System.out.println("["+key + ", " + value + "] has been placed in HashTable["+index+"]");
      
      
   }
   
   
   public void remove(Key key) {
      if(key==null) {
         System.out.println("Please Enter a valid key");
      }
      int val = hash(key);
      if(hashTable[val] != null) {
         hashTable[val] = null;
         System.out.println("The key ["+key+"] has been removed");
         ctr--;
      }
      else{
         System.out.println("The key ["+key+"] does not exist");
      }
   
   }
   
   public boolean contains(Key key) {
      int val = hash(key);
      if(hashTable[val] != null) {
         System.out.println("The Key ["+key+"] Exists");
         return true;
      }
         System.out.println("The Key ["+key+"] Does Not Exist");
      return false;
   }  
   
   
   private int hash(Key key) {
      int m = getSize();
      int hash =(key.hashCode() & 0x7FFFFFFF) % m;
      return hash;
   }
   
   public void clear(){
      for(int i = 0; i<hashTable.length; i++) {
         hashTable[i] = null;
         ctr = 0;
      }
      
   }
   
}