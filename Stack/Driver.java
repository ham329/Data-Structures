//NAME: AARON HABANA
//DATE: 02/14/2017
//ASSIGNMENT: Driver.java
//PURPOSE: To unit test stack

class Driver {

   public static void main(String[] args) {
      
      
      Stack<String> stack = new Stack<String>();
      
      int size = 0;
      
      //size
      System.out.println("The size of the stack is: " + stack.getSize());
      
      //isEmpty
      System.out.println("Is the stack empty? " + stack.isEmpty());
      
      //push 1 item to stack
      stack.push("Apples");
      
      //peek (added 2/21/2017)
      System.out.println("The item at the top of the stack is: " + stack.peek());
      
      //size
      System.out.println("The size of the stack is: " + stack.getSize());
      
      //isEmpty
      System.out.println("Is the stack empty? " + stack.isEmpty());
      
      //pop item out of stack
      System.out.println(stack.pop() + " has been popped out of stack");
      
      //size
      System.out.println("The size of the stack is: " + stack.getSize());
      
      //isEmpty
      System.out.println("Is the stack empty? " + stack.isEmpty());
      
      //push 5 times
      stack.push("Toyota");
      stack.push("Honda");
      stack.push("Nissan");
      stack.push("Ford");
      stack.push("Dodge");
      
      //size
      System.out.println("The size of the stack is: " + stack.getSize());
      
      //pop 5 times
      System.out.println(stack.pop() + " has been popped out of stack");
      System.out.println(stack.pop() + " has been popped out of stack");
      System.out.println(stack.pop() + " has been popped out of stack");
      System.out.println(stack.pop() + " has been popped out of stack");
      System.out.println(stack.pop() + " has been popped out of stack");
      
      //size
      System.out.println("The size of the stack is: " + stack.getSize());
      
      //contains demo
      stack.push("apples");
      //contains false
      System.out.println("Is 'bananas' in stack? " + stack.contains("bananas"));
      //contains true
      System.out.println("Is 'apples' in stack? " + stack.contains("apples"));
      
      
      
      //clear contains demo push
      stack.pop();
      
      //pop to throw exception
      System.out.println(stack.pop() + " has been popped out of stack");
      
      
      
   
   
   }//end of main

}//end of class Driver