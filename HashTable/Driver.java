//Name: Aaron Habana
//Date: 04/12/2016
//App: HashTables - Driver.java
//Purpose: to implement hashtables



class Driver {
   public static void main(String[] args) {
      
      /*
      HashTable<String,Integer> ht = new HashTable<String,Integer>();
      
      //size
      System.out.println("Size of HashTable is: " + ht.size());
      
      //isEmpty();
      System.out.println("Is table empty? " + ht.isEmpty()+"\n");
      
      //remove non-existing key
      ht.remove("cake");
      
      //remove non-existing key
      ht.remove("Racecar");
      System.out.println("");
      //get a non-existing key
      ht.get("Apples");
      
      //add two new key/value
      ht.put("Apples",1453);
      ht.put("Carrots",10);
      
      
      //get an existing key
      System.out.println("\nValue of key[Apples]: " + ht.get("Apples"));
      
      
      //get size
      System.out.println("\nSize of HashTable is: " + ht.size());
   
      //isEmpty();
      System.out.println("Is table empty? " + ht.isEmpty()+"\n");
      
      
      //search for a non-existing key
      ht.contains("cashews");
      //search for an existing key
      ht.contains("Apples");
      ht.contains("Carrots");
      
      System.out.println("");
      //add 4 new key/values
      ht.put("Grapefruit",36);
      ht.put("Snakes",123232);
      ht.put("Snakes",123232);
      ht.put("Person",94);
      //size
      System.out.println("\nSize of HashTable is: " + ht.size()+"\n");

      //remove existing key
      ht.remove("Person");
      //size
      System.out.println("Size of HashTable is: " + ht.size() +"\n");
      //remove another existing key
      ht.remove("Grapefruit");
      
      //size
      System.out.println("Size of HashTable is: " + ht.size() +"\n");
      
      //remove non-existing key
      ht.remove("Person");

      ht.clear();
      //size
      System.out.println("Size of HashTable is: " + ht.size() +"\n");
      //isEmpty()
      System.out.println("Is table empty? " + ht.isEmpty()+"\n");
   
   */
   
     HashTable<String,Integer> ht = new HashTable<String,Integer>(5);
      System.out.println("Size: " + ht.size());
      System.out.println("Empty: " + ht.isEmpty());
      ht.remove("bla");
      ht.remove("blaaaaaaaaaaaaa");
      ht.get("bla");
      ht.put("bla", 45);
      ht.put("blaa", 46);
      System.out.println("Size: " + ht.size());
      System.out.println("Empty: " + ht.isEmpty());
      String tmp = "blah";
      System.out.println("Contains: " + tmp + "? " + ht.contains(tmp));
      tmp = "bla";
      System.out.println("Contains: " + tmp + "? " + ht.contains(tmp));
      tmp = "blaa";
      System.out.println("Contains: " + tmp + "? " + ht.contains(tmp));
      ht.put("blaaa", 47);
      ht.put("blaaaa", 48);
      ht.put("blaaaaa", 49);  //collision with bla
      ht.put("blaaaaaa", 50); //collision with blaa
      System.out.println("Size: " + ht.size());
      ht.remove("bla");
      System.out.println("Size: " + ht.size());
      ht.remove("blaa");
      System.out.println("Size: " + ht.size());
      ht.remove("bl");
      System.out.println("Size: " + ht.size());
      ht.remove("blaaa");
      ht.remove("blaaaa");
      System.out.println("Size: " + ht.size());
      System.out.println("Empty: " + ht.isEmpty());
      ht.remove("bkjdhfjkdhfjkdhf");
   }
}