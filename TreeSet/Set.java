//NAME: AARON HABANA
//DATE: 02/07/2017
//ASSIGNMENT: Sort.java
//PURPOSE: implement set data structure using java generic types

import java.util.Iterator;
import java.util.TreeSet;

public class Set<T extends Comparable<T>> implements Iterable<T> {
   
   private TreeSet <T> set = new TreeSet<T>();
   private int size;
   
   
   /*
   * Add input to this set. (only if it doesn't exist)
   *
   * @params - input is they key to add
   * @throws - illegal argument exception if input is null
   * @returns - n/a
   ************************************************/
   public void add(T key) { 
      if(key==null) {
         throw new IllegalArgumentException("Illegal Argument Exception");
      }
      else{
         set.add(key); 
      }  
   }
   
   /*
   * remove input from this set (if it exists)
   *
   * @params - input is they key to remove
   * @throws - illegal argument exception if input is null
   * @returns - n/a
   ************************************************/
   
   public void remove(T key) {
      if(key==null) {
         throw new IllegalArgumentException("Illegal Argument Exception");
      }
      else {
         set.remove(key);
      }
   }
   
   /*
   * Check if input exists in this set
   *
   * @params - input is they key to check
   * @throws - illegal argument exception if input is null
   * @returns - true if the set contains this input, false otherwise
   ************************************************/ 
   public boolean contains(T key) {
      
      if(key == null) {
         throw new IllegalArgumentException("Please enter a valid key");
      
      }
    
      return set.contains(key);
      
   }
   
    /*
    * check if this set size is 0
    *
    * @params - none
    * @throws - n/a
    * @returns - true if the size is 0, false otherwise
    ************************************************/
   public boolean isEmpty() {
      
      int empty = set.size();
      
      if(empty == 0){
         return true;
      }
      return false;
   } 

    /*
    * returns the size (number of elements) of this set
    *
    * @params - none
    * @throws - n/a
    * @returns - return the number of elements in this set
    ******************************************************/
   public int size() {
   
      return set.size();
   }
   
   /*
   * Remove all elements from this set
   *
   * @params - none
   * @throws - n/a
   * @returns - n/a
   ************************************************/
   public void clear() {
   
      set.clear();
   }
   
   /*
   * @Override method to return an iterator for all the elements of this set
   *
   * @params - none
   * @throws - n/a
   * @returns - set.iterator();
   ************************************************/ 
   @Override
   public Iterator<T> iterator() {
   
      return set.iterator();
   }
   
} //end of class (Set)