//NAME: AARON HABANA
//DATE: 02/07/2017
//ASSIGNMENT: Driver.java
//PURPOSE: To implement set Data structure using generic java types

import java.util.Iterator;
import java.util.TreeSet;

public class Driver {

   public static void main(String[] args) {
   
      //for size
      int size;
      int size2;
      
      //variables for testing
      boolean contains1;
      boolean contains2;
      boolean contains3;
      boolean contains4;
      
      //add 5 elements to a set of user type/class
      Set<Test> set = new Set<Test>();
      set.add(new Test(1));
      set.add(new Test(2));
      set.add(new Test(3));
      set.add(new Test(4));
      set.add(new Test(5));
       
      //add 5 elements to String type
      Set<String> set2 = new Set<String>();
      set2.add("Apples");
      set2.add("Bananas");
      set2.add("Carrots");
      set2.add("Doritos");
      set2.add("Elephants");
          
      //print set size for set#1
      size = set.size();
      System.out.println("Size of <Test> is: " + size);
      //print set size set#2
      size2 = set.size();
      System.out.println("Size of <String> is: " + size2 + "\n");
      
      //iterator for <Test>
      for(Iterator<Test> i = set.iterator();i.hasNext();) {
         Test tst = i.next();
         int k1 = tst.getKey();
         int v1 = tst.getVal();
         System.out.println("Key: " + k1 + "\nVal: " + v1 +"\n");
      }
      
      //iterator for <String>
      for(Iterator<String> i = set2.iterator();i.hasNext();) {
         String tst2 = i.next();
         System.out.println(tst2);
      }
      
      //check for existing key(s)
      contains1 = set2.contains("Bananas");
      System.out.println("\nDoes 'Bananas' exist in <String>? " + contains1);
      
      contains2 = set2.contains("Dorito");
      System.out.println("Does 'Dorito' exist in <String>? " + contains2);
      
      contains3 = set.contains(new Test(1));
      System.out.println("Does '1' exist in <Test>? " + contains3);
      
      contains4= set.contains(new Test(452));
      System.out.println("Does '452' exist in <Test>? " + contains4 + "\n");
     
      //remove 3 existing elements from each set
      set.remove(new Test(2));
      set.remove(new Test(3));
      set.remove(new Test(4));
      set2.remove("Apples");
      set2.remove("Elephants");
      set2.remove("Carrots");
      
      //remove a non-existing element
      set.remove(new Test(612));
      set2.remove("Zebra");
      
      //print size of <Test> after removing
      size = set.size();
      System.out.println("Size of <Test> is: " + size);
      //print size of <String> after removing
      size2 = set.size();
      System.out.println("Size of <String> is: " + size2 + "\n");
      
      //clear the set
      set.clear();
      set2.clear();
      
      //print size of <Test> after clearing
      size = set.size();
      System.out.println("Size of <Test> is: " + size);
      //print size of <String> after clearing
      size2 = set.size();
      System.out.println("Size of <String> is: " + size2 + "\n");     
      
   }//end of main
}//end of class (Driver)