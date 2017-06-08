//NAME: AARON HABANA
//DATE: 04/05/2017
//ASSIGNMENT: BST - BST.java
//PURPOSE: To implement a binary search tree


import java.util.NoSuchElementException;

public class BST<Key extends Comparable<Key>, Value> {

   private Node root;

   private class Node {
   
      private final Key key;  //sorted by key
      private Value val;   //associated data
      private Node left;   //left subtree
      private Node right;  //right subtrees
      private int size; //number of nodes in subtree
   
      public Node(Key key, Value val, int size) {
         this.key = key;
         this.val = val;
         this.size = size;
      }
   } // end of private Node class

   
   /*
   *
   *        size  
   *
   */
   
   public boolean isEmpty() {
      return size() == 0;
   }
   
   public int size() {
      return size(root);
   }
   
   private int size(Node n) {
      if(n==null) {
         return 0;
      }
      return n.size;
   }
   
   /*
   *
   *     contains/search
   *
   */
   
   
   public boolean contains(Key key) {
      if(key==null) {
         throw new IllegalArgumentException();
      }
      return get(key) != null;
   }
   
   private Value get(Key key) {
      return get(root, key);
   }
   private Value get(Node n, Key k) {
      if(n==null) {
         return null;
      }
      int cmp = k.compareTo(n.key);
      if(cmp<0) {
         get(n.left,k); 
      }
      else if( cmp>0) {
         get(n.right,k);
      }
      
      return n.val; // this might bug out (needs to be in an elseif)
   }
   
   /*
   *
   *
   *     Insert/Put
   *
   *
   */
   
   
   public void insert(Key k, Value v) {
      if(k==null || v==null) {
         throw new IllegalArgumentException();
      }
      root = insert(root,k,v);
   }
   
   public Node insert(Node n, Key k, Value v) {
      if(n==null) {
         return new Node(k,v,1);
      }
      int cmp = k.compareTo(n.key);
      if(cmp<0){
         n.left = insert(n.left,k,v);
      }
      else if(cmp>0) {
         n.right = insert(n.right, k, v);
      }
      else{
         n.val = v;
      }
      n.size = 1 + size(n.left) + size(n.right);
      return n;
   }
   
   
   
   /*
   *
   *     Remove/Delete
   *
   */
   
   public void delete(Key k) {
      if(k==null) {
         throw new IllegalArgumentException();
      }
      root = delete(root, k);
   }
   
   
   private Node delete(Node n, Key k) {
      if(n==null) {
         return null;
      }
      int c = k.compareTo(n.key);
      if(c<0) {
         n.left = delete(n.left, k);
      }
      else if(c>0) {
         n.right = delete(n.right,k);
      }
      else {
         if(n.right ==null) {
            return n.left;
         }
         if(n.left==null) {
            return n.right;
         }
         
         Node tmp = n;
         n = min(tmp.right);
         n.right=deleteMin(tmp.right);
         n.left=tmp.left;
      }
      return n; //this might be wrong. needed a return 
   }
   
   private Node min(Node n) {
      if(n.left == null) {
         return n;
      }
      return min(n.left);
   }
   
   private Node deleteMin(Node n) {
      if(n.left == null) {
         return n.right;
      }
      n.left = deleteMin(n.left);
      n.size = 1 + size(n.left) + size(n.right);
      return n;
   }
   
   /*
   *
   *
   *     Levels
   *
   */
   
   public int levels() {
      return levels(root);
   }
   
   private int levels(Node n) {
      if(n==null) {
         return 0;
      }
      int leftLevels = levels(n.left);
      int rightLevels = levels(n.right);
      if(leftLevels<rightLevels) {
         return rightLevels + 1;
      }
      return leftLevels+1;
   }
   
   /*
   *
   *
   *     Print Levels
   *
   */
   
   public void printLevel(int level) {
      System.out.println("Level: " + level);
      printLevel(root,level);
   }
   
   private void printLevel(Node n, int level) {
      if(n != null) {
         if(level == 0) {
            System.out.print("(." + n.key + "," + n.val + ".)");
         }
         printLevel(n.left, level-1);
         printLevel(n.right, level-1);
      }
   }
   
   public void printAllLevels(){
      int height = 0;
      int numOfLevels = levels();
      int lev = 0;
      while(height < numOfLevels) {
         System.out.println("Level: " + lev);
         printLevel(root,height);
         System.out.println("");
         height++;
         lev++;
      }
   }
}