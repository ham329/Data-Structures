//NAME:AARON HABANA
//DATE: 03/12/2017
//ASSIGNMENT: DoubleLinkedList - DoubleLinkedList.java
//PURPOSE: to implement double linked list


import java.util.ListIterator;
import java.util.NoSuchElementException;

public class DoubleLinkedList<T> implements Iterable<T> {

   private int size;
   private Node<T> start;
   private Node<T> end;
   
   /* Default Constructor
   *
   *initialize member var to null/0 
   *
   *@params - none
   *@throws - n/a
   *@return - n/a
   */
   public DoubleLinkedList() {
      size = 0;
      start = null;
      end = null;
      
   }
   
   /* isEmpty()
   *
   *check if size is 0 
   *
   *@param - n/a
   *@throws - n/a
   *@return - boolean value of size == 0//start==null
   */
   public boolean isEmpty() {
      return start == null;
   }
   
   /* getSize()
   *
   *return the size
   *
   *@params - none
   *@throws - n/a
   *@return - size
   */
   public int getSize() {
      return size;
   }
   
   /* insertStart
   *
   *insert a new node at the start of the list
   *
   *@params - T input
   *@throws - n/a
   *@return - n/a
   */
   public void insertStart(T input) {
      if(start==null) {
         start = new Node<T>(null,input, null);
         end = start;
         size++;
      }
      else{
         Node<T> newStart = new Node<T>(null,input,start);
         
         start.setPrevious(newStart);
         start = newStart;
         size++;
      }  
   }
   
   /* insertEnd
   *
   *insert a new node at the end of the list
   *
   *@params - T input
   *@throws - n/a
   *@return - n/a
   */
   public void insertEnd(T input) {
      
      Node<T> newNode = new Node<T>(null,input,null);
      
      if(start == null ) {
         start = newNode;
         end = start;
         size++;
      }
      else{
         
         Node<T> oldEnd = end;
         end.setNext(newNode);
         newNode.setPrevious(end);
         end = newNode;
         size++;
      }
   }
   
   /* insertAtPos
   *
   *insert a new node at some position
   *
   *@params - T input, position
   *@throws - n/a
   *@return - n/a
   */
   public void insertAtPos(T input, int index) {
      if(isEmpty()) {
         return;
      }
      if(index<1||index>size) {
         return;
      }
      Node<T> temp = start;
      int i = 1;
      while(i<index) {
         temp = temp.getNext();
         i++;
      }
      if(temp.getPrevious() == null) {
         Node<T> newNode = new Node<T>(null, input, temp);
         temp.setPrevious(newNode);
         start = newNode;
         size++;
      }
      else {
         Node<T> newNode = new Node<T>(temp.getPrevious(), input, temp);
         temp.getPrevious().setNext(newNode);
         temp.setPrevious(newNode);
         size++;
      }
      
   }
    
   /* removeAtPos
   *
   *remove a node at some position in the list
   *
   *@params - position/index
   *@throws - n/a
   *@return - n/a
   */
   public void removeAtPos(int index) {
      
      if(isEmpty()) {
         return;
      }
      if(index<1||index>size) {
         return;
      }
      Node<T> temp = start;
      int i = 1;
      while(i<index) {
         temp = temp.getNext();
         i++;
      }
      if(temp.getNext() == null) {
         temp.getPrevious().setNext(null);
         size--;
      }
      else if(temp.getPrevious() == null) {
         temp = temp.getNext();
         temp.setPrevious(null);
         size--;
      }
      else{
         temp.getPrevious().setNext(temp.getNext());
         temp.getNext().setPrevious(temp.getPrevious());
         size--;
      } 
   }
   
   /* iterator
   *
   *@Override: returns a new DLL-iterator
   *
   *@params - T input
   *@throws - n/a
   *@return - ListIterator<T>
   */
   @Override
   public ListIterator<T> iterator() {
      
      return new DoublyLinkedListIterator();
   }
   
   /* print
   *
   *  prints dll
   *
   *@params - n/a
   *@throws - n/a
   *@return - n/a
   */
   public void print() {
      
      Node<T> temp = start;
      
      if(isEmpty()) {
         
         System.out.println("List is empty\n");
         return;
      }
      System.out.print("null");
      
      while(temp != null){
        
         System.out.print("<-- ["+temp.getData() + "] --> ");
         temp = temp.getNext();
      }
      
      System.out.println("null");
   }

  
   //DLL - ListIterator
   private class DoublyLinkedListIterator implements ListIterator<T> {
      
      private Node<T> current = start;
      private Node<T> lastAccessed = null;
      private int index;
      
      public DoublyLinkedListIterator() {
        
         if(current == null) {
            index = 0;
         }
         else{
            index = 1;
         }
      }
      
      public boolean hasNext() {
         return index < size;
      }
      
      public boolean hasPrevious() { 
         return index > 1; 
      }
      
      public int previousIndex() {
         return index-1;
      }
      public int nextIndex() {
         return index;
      }
      public void add(T input) {
       
         if(isEmpty()) {
            return;
         }
         if(index<1||index>size) {
            return;
         }
      
         
         if(!hasPrevious()) {
            insertStart(input);
            return;
         }
         if(!hasNext()){
            insertEnd(input);
            return;
         }
      }
      
      public void set(T input) {
         if(lastAccessed==null) {
            throw new IllegalStateException();
         }
         else{
            lastAccessed.setData(input);
         }
      }
      
      public void remove() {
         
         Node<T> temp = lastAccessed.getPrevious();
         Node<T> temp2 = lastAccessed.getNext();
      }
      
      public T previous() {
         if(!hasPrevious()) {
            throw new NoSuchElementException("no previous");
         }
         lastAccessed = current;
         current = current.getPrevious();
      
         index--;
         return current.getData();
      }
      
      public T next() {
         if(!hasNext()) {
            throw new NoSuchElementException("no next");
         }
         lastAccessed = current;
         current = current.getNext();
         index++;
         
         return current.getData();
      }      
      
   }//end of ListIterator

}//end of class

