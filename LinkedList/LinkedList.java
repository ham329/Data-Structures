//NAME:AARON HABANA
//DATE: 02/28/2017
//ASSIGNMENT: LinkedList LinkedList.java
//PURPOSE: to implement single linked list


public class LinkedList<T> implements List<T> {
   
   private int size;
   private Node<T> head;
  
   /*
   *init.member variables to null or 0
   *
   *@params - none
   *@throws - n/a
   *@return - n/a
   */ 
   public LinkedList() {
      size = 0;
      head = null;
   }
   
   
   /*
   *returns if list is empty
   *
   *@params - none
   *@throws - n/a
   *@return - boolean value of head == null
   */
   public boolean isEmpty() {
      return head == null;
   }
   
   
   /*
   *insert new object as new head
   *
   *@params - user type - input
   *@throws - n/a
   *@return - n/a
   */
   public void newHead(T input) {
      
      head = new Node<T>(input, head);
      size++;
   }
   
   /*
   * delete the head
   *
   *@params - none
   *@throws - n/a
   *@return - n/a
   */
   public void deleteHead() {
      if(!isEmpty()) {
         head = head.getNext(); 
         size--; 
      }
   }
   
   /*
   *insert at the end
   *
   *@params - user type - input
   *@throws - n/a
   *@return - n/a
   */
   public void newTail(T input) {
      Node<T> temp = head;
      while(temp.getNext() != null) {
         temp = temp.getNext();
      } 
  
      Node<T> theNext = new Node<T>(input);
      temp.setNext(theNext);
      size++;
  
   } 
   
   
   
   /*
   *delete last input
   *
   *@params - none
   *@throws - n/a
   *@return - n/a
   */
   public void deleteTail() {
      Node<T> temp = head;
      while(temp.getNext().getNext() != null) {
         temp = temp.getNext();
      }
      temp.setNext(null);
      size--; 
   }
   
   /*
   *search and return true if item exsist
   *
   *@params - user type - input
   *@throws - n/a
   *@return - boolean value if exsists
   */
   public boolean search(T input) {
      Node<T> temp = head;
      boolean retVal = false;
      while(temp != null) {
         if(temp.getData().equals(input)) {
            retVal = true;
         }
         temp = temp.getNext();
      }
      return retVal;
   }   
   
   /*
   * delete a given input
   *
   *@params - user type - input
   *@throws - n/a
   *@return - n/a
   */
   
   public void delete(T input) {
      if (head == null) {
         throw new NullPointerException("list is null");
      }
      if(head.getData().equals(input)){
         head = head.getNext();
         size--;
      }
      Node<T> temp = head;
      while(temp != null) {
         if(temp.getNext().getData().equals(input)){
            temp.setNext(temp.getNext().getNext());
            size--;
         }
         temp = temp.getNext();  
      }
      
   }
   
   /*
   *clear the list
   *
   *@params - none
   *@throws - n/a
   *@return - n/a
   */
   public void clear() {
      head = null;
      size=0;   
   }
   
   /*
   * get size
   *
   *@params - none
   *@throws - n/a
   *@return - size
   */
   public int getSize() {
      return size;
   }
    
   /*
   *print all the elements in the list
   *
   *@params - none
   *@throws - n/a
   *@return - n/a
   */
   public void print() {
      if(head == null) {
         System.out.println("null");     
      }
      else {
         Node<T> temp = head;
         while(temp != null) {
            System.out.print(temp.getData());
            System.out.print("-->");
            temp = temp.getNext();
         }
              
      } 
   }
   
}// end of LinkedList