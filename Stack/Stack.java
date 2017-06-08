//NAME: AARON HABANA
//DATE: 02/14/2017
//ASSIGNMENT: Stack.java
//PURPOSE: To implement stack

import java.util.NoSuchElementException;

class Stack<Item> {
   
   /*
   * Node class
   *
   * @params: none
   * @throws: n/a
   * @returns: n/a
   */
   
   private class Node {
       
      private Item item;
      private Node next; 
   }
   
   //member variables
   private int size;//size
   private Node node;//top
   
   /*
   * Constructor(default)
   *
   * @params - none
   * @throws - n/a
   * @returns - n/a
   **/
   public Stack(){
      size = 0;
      node = null;
   }
   
   /*
   * Check if this stack size is 0
   *
   * @param - none
   * @throws - n/a
   * @returns - true if stack is 0, false otherwise
   **/
   public boolean isEmpty(){
      return node==null;
   }
   
   /*
   * add(push) an item to this stack
   *
   * @param item to add to this stack
   * @throws - n/a
   * @returns - n/a
   **/
   public void push(Item item) {
      Node oldNode = node; 
      node = new Node();
      node.item = item;
      node.next = oldNode;
      size++;
   
   }
   
   /*
   * Removes and returns the last item that was added
   *
   * 
   * @throws - NoSuchElementException
   * @return - last item added (removes item from stack)
   **/
   public Item pop() {
      
      if(isEmpty()) {
         throw new NoSuchElementException("Stack is empty");
      }
      
      Item item = node.item;
      node = node.next;
      size--;
      
      return item;
   }
   
   /*
   * Returns (but does not remove) the item on top
   *
   * @throws - NoSuchElementException
   * @returns - the item on top 
   **/
   public Item peek() {
      if (isEmpty()) {
         throw new NoSuchElementException("Stack is empty");
      }
      return node.item;
   }
   
   /*
   * Returns the number of elements in this stack
   * 
   * @return - the number of items in this stack
   *
   **/
   public int getSize() {
      return size;
   }
   
   /*
   * Check if item exsists in the stack
   *
   * @params - item is the element to check
   * @throws - IllegalArgumentException
   * @return - true of the stack contains this item, false otherwise
   **/
   /*
   public boolean contains(Item item) {
      if(isEmpty()) {
         throw new IllegalArgumentException("Queue is Empty");
      }
      int s = 0;     
      while(s<size) {
         if(){
            return true;
         }
         s++;  
      }
      return false;
   }
   */
}//end of class Stack