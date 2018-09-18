//NAME:AARON HABANA
//DATE: 09/15/2017
//ASSIGNMENT: Node.java
//PURPOSE: Program a binary search tree (“BST”) in Java by implementing the interface given 


public class Node<E>{
   public E value;
   public Node<E> root, left, right;
   public int height;
   
   public Node(E value) {
      this(value,null,null);
   }
   //create new Node
   public Node(E value, Node<E> left, Node<E> right){
      this.value = value;
      this.left = left;
      this.right = right;
      this.height = 0;  
   }
}