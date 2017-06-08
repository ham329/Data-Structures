//NAME: AARON HABANA
//DATE: 02/21/2017
//ASSIGNMENT: Queue.java
//PURPOSE: To implement queue data structure

import java.util.NoSuchElementException;
public class Queue<Item> {

   //helper class
   private class Node {
   
      private Item item;
      private Node next;
      
   }
   //member variables
   private int size;
   private Node first;
   private Node last; 
   
   
   /*   
   * CONSTRUCTOR
   * init. member variables
   *
   * @param  - none
   * @throws - n/a
   * @return - n/a         
   *
   */
   public Queue() {
      size = 0;
      first = null;
      last = null;
   }
   
   /*
   * isEmpty - check if queue is empty
   *
   * @param  - n/a
   * @throws - n/a
   * @return - true/false         
   *
   */
   public boolean isEmpty(){
      return first == null;
   
   }
   
   
   /*
   * Add an item to the queue
   *
   * @param  - Item item
   * @throws - n/a
   * @return - n/a         
   *
   */
   public void add(Item item) {
      
      Node oldNode = last;
      last = new Node();
      last.item = item;
      last.next = null;
      
      if(isEmpty()) {
         first = last;
      }
      else {
         oldNode.next = last;
      }
      size++;
      
   }
   
   /*
   * Removes and returns the last item that was added to the queue
   *
   * @return - last item added (this removes the item from the queue)
   * @throws - NoSuchElementException if this queue is empty
   *
   */
   public Item poll() {
   
      if(isEmpty()) {
         last = null;
         throw new NoSuchElementException("Stack is Empty");
      }
      
      Item item = first.item;
      first = first.next;    
      
      size--;
      
      return item;
      
   }
   
   /*
   * Returns (but does not remove) the item most recently added item
   *
   * @return - The item most recently added item to this queue
   * @throws - NoSuchElementException if this queue is empty
   *
   */
   public Item peek() {
      if(isEmpty()){
         throw new NoSuchElementException("Stack is Empty");
      }
      
      return last.item;
   }
   
   /*
   * Returns the number of elements in this queue.
   *
   * @return - the number of items in this queue
   *
   */
   public int getSize() {
      return size;
   }
   
   
   /*
   * Returns true/false if element is already in queue
   *
   * @return - the number of items in this queue
   *
   */
   public boolean contains(Item i) {  
      
      Queue<Item> temp = new Queue<Item>();
      boolean result = false;
 
      while(!this.isEmpty()) {
         Item j = this.poll();
         temp.add(j);
         if(i.equals(j)) {
            result = true;
         }
      }
      while(!temp.isEmpty()) {
         this.add(temp.poll());
      }
      
      return result;
      
   }//end of contains
   
   
}//end of Queue