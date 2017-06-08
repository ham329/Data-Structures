//NAME: AARON HABANA
//DATE: 03/12/2017
//ASSIGNMENT: DoubleLinkedList - Node.java
//PURPOSE: to implement double linked list

public class Node<T> {
   
   private T data;       
   private Node<T> previous; //prev node 
   private Node<T> next; //next node
   
   public Node() {
      
      data = null;
      previous = null;
      next = null;
   }
   
   public Node(Node<T> previous, T data, Node<T> next) {
      
      this.data = data;
      this.previous = previous;
      this.next = next;   
   }
   
   public T getData() {
      return data;
   }
   
   public void setData(T input) {
      this.data = input;
   }
   
   
   public Node<T> getPrevious(){
      return previous;
   }
   
   public void setPrevious(Node<T> p) {
      previous = p;
   }
   
   public Node<T> getNext(){
      return next;
   }
   
   public void setNext(Node<T> n) {
      next = n;
   }
  
}//end of class Node