//NAME:AARON HABANA
//DATE: 02/28/2017
//ASSIGNMENT: LinkedList LinkedList.java
//PURPOSE: to implement single linked list

public class Node<T> {
  
   private T data;
   private Node<T> next;// next node

   //Constructor #1
   public Node(T data) {
      this.data = data;
      next = null;
   }
   //Constructor #2
   public Node(T data, Node<T> next) {
      this.data = data;
      this.next = next;
   }
   
   //get data
   public T getData() {
      return data;
   }
   
   //get next
   public Node<T> getNext() {
      return next;
   }
   //set data
   public void setData(T input) {
      data = input;
   }
   //set next
   public void setNext(Node<T> n) {
      next = n;
   }
   
}//end of class Node
