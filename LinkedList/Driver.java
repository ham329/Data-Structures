//NAME:AARON HABANA
//DATE: 02/28/2017
//ASSIGNMENT: LinkedList LinkedList.java
//PURPOSE: to implement single linked list

class Driver {
   public static void main(String[] args) {
      
      //Declare Initialize a Linked List of user defined type
      LinkedList<T> list = new LinkedList<T>();
      
      //print linked list
      list.print();
      
      //add 5 new heads
      list.newHead(new T("Arnold",15));
      list.newHead(new T("Becky",19));  
      list.newHead(new T("Carlos",37));
      list.newHead(new T("Dimitri",32));
      list.newHead(new T("Erica",59));
      
      //add 1 new tail
      list.newTail(new T("Francis",24));
      
      //print linked list
      System.out.println("");
      list.print();
      
      //isEmpty
      System.out.println("\nIs the list empty? " + list.isEmpty());
      
      //size
      System.out.println("\nSize of list: " + list.getSize());
      
      //delete an existing item
      System.out.println("Deleting 'Francis, 24'\n"); 
      list.delete(new T("Francis",24));
      
      
      //delete tail
      list.deleteTail();
      
      //delete head
      list.deleteHead();
      
      //print linked list
      list.print();
      
      //search for item that matches the data of the head node
      System.out.println("\nIs Dimitri,32 in the list? " + list.search(new T("Dimitri",32)));
      //search for item that matches the data of the tail node
      System.out.println("Is Becky,19 in the list? " + list.search(new T("Becky",19)));
      //search for item that doesn't exist
      System.out.println("Is Zach,37 in the list? " + list.search(new T("Zach",17)));
      
      //clear the linked list
      list.clear();
      
      //size
      System.out.println("\nSize of list: " + list.getSize());
      
      //isEmpty
      System.out.println("\nIs the list empty? " + list.isEmpty() + "\n");


      //search something that existed in the past
      System.out.println("Does \"||Name: Becky, Age: 19||\" exist in the list? " + list.search(new T("Becky",19)) + "\n");
      
      //print linked list
      System.out.println("--------------------------");
      list.print();
      System.out.println("--------------------------");

      //delete something that existed in the past 
      //list.delete(new T("Francis",24));
      
      
      
      

      
      
   }
   
}