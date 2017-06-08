//NAME: AARON HABANA
//DATE: 04/05/2017
//ASSIGNMENT: BST - BST.java
//PURPOSE: To implement a binary search tree


public class Driver {
   
   public static void main(String[] args) {
      
      
      BST<Integer,Integer> bst = new BST<Integer,Integer>();
      
      int[] keysArr = {25,101,10,45,90,110,13,11,40,60,99,105,234,17,20,67,175}; 
      
      //isEmpty
      System.out.println("Is Tree Empty?: " + bst.isEmpty());
      System.out.println("");

      //insert All keys
      for(int i=0; i<keysArr.length;i++){
         int rand = (int)((Math.random()*50)+1);
         bst.insert(keysArr[i], rand);
      }
      
      //printLevels
      bst.printLevel(5);
      //size
      System.out.println("\n\nSize of tree: " + bst.size());
      //levels
      System.out.println("levels: " + bst.levels());
      //isEmpty
      System.out.println("Is Tree Empty?: " + bst.isEmpty());
      //search/contains
      System.out.println("Is 101 a key? " + bst.contains(101));
      System.out.println("");
      //display/printAll
      bst.printAllLevels();
      //delete
      bst.delete(67);
      //size
      System.out.println("\nSize of tree: " + bst.size());
      //levels
      System.out.println("levels: " + bst.levels());
      //contains
      System.out.println("Is 67 a key? " + bst.contains(67));
      System.out.println("");
      //display
      bst.printAllLevels();
      //display level 5
      bst.printLevel(5);
   }
}