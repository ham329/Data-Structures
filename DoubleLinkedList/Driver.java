//NAME:AARON HABANA
//DATE: 03/12/2017
//ASSIGNMENT: DoubleLinkedList - Driver.java
//PURPOSE: to implement double linked list
import java.util.ListIterator;

class Driver {

   public static void main(String[] args) {
      
      //Declare & init a Double Linked List(String)
      DoubleLinkedList<String> dll = new DoubleLinkedList<String>();
      
      //print
      dll.print();
      
      //Call insertStart and add 5 strings
      dll.insertStart("E");
      dll.insertStart("D");
      dll.insertStart("C");
      dll.insertStart("B");
      dll.insertStart("Hello, World!");     
      
      //print
      dll.print();
      
      //isEmpty
      System.out.println("\nIs the list empty? " + dll.isEmpty());
      
      //getSize
      System.out.println("Size of list is: " + dll.getSize() + "\n");
      
      //insert at some position
      dll.insertAtPos("This is now position 3",3);
      
      //print
      dll.print();
      
      //insert at some position
      dll.insertAtPos("This is now position 5",5);
      
      //print
      dll.print();
      
      //insert at end of DLL
      dll.insertEnd("F");
      
      //print
      dll.print();
      
      //getSize
      System.out.println("\nSize of list is: " + dll.getSize() + "\n");
      
      //remove at some position x3
      dll.removeAtPos(3);
      dll.removeAtPos(4);
      dll.removeAtPos(3);
      
      //print
      dll.print();
      
      //getSize
      System.out.println("\nSize of list is: " + dll.getSize());
   
      ListIterator<String> itr = dll.iterator();
      
      //call next 4x
      System.out.println("next: " + itr.next());
      System.out.println("next: " + itr.next());


      
     
      //call prev 4x
      System.out.println("previous: " + itr.previous());
      System.out.println("previous: " + itr.previous());

      
      
      
      
       
       
   }//end of main
}//end of driver