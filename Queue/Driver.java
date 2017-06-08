
class Driver {

   public static void main(String[] args) {
   
      //create obj
      Queue<String> q = new Queue<String>();
      
      //Add 13 items
      q.add("Samantha");
      q.add("Smith");   
      q.add("Matthew");
      q.add("Albert");
      q.add("Elizabeth");
      q.add("Sophia");
      q.add("Carlos");
      q.add("Mark");
      q.add("Jennifer");
      q.add("Joshua");
      q.add("Mary");
      q.add("Lily");
      q.add("Trish");
      
      //contains
      System.out.println("is 'Lily' in the Queue? " + q.contains("Lily"));
      System.out.println("is 'lily' in the Queue? " + q.contains("lily")); 
      System.out.println("is 'Edward' in the Queue? " + q.contains("Edward")); 
      System.out.println("is 'Trish' i the Queue? " + q.contains("Trish"));
      
      
      //isEmpty
      System.out.println("Is the queue empty? " + q.isEmpty());
      
      //getSize
      System.out.println("The size of the queue is: " + q.getSize());    
      
      //peek
      System.out.println("Last item added to the queue: " + q.peek());
      
      //poll
      System.out.println("Polled:" + q.poll());
      
      //peek and return last item added
      System.out.println("Last item added to the queue: " + q.peek());
      
      //getSize
      System.out.println("The size of the queue is: " + q.getSize());    

      //Poll 13 times (last one polls a null)
      System.out.println("Polled: " + q.poll());
      System.out.println("Polled: " + q.poll());
      System.out.println("Polled: " + q.poll());
      System.out.println("Polled: " + q.poll());
      System.out.println("Polled: " + q.poll());
      System.out.println("Polled: " + q.poll());
      System.out.println("Polled: " + q.poll());
      System.out.println("Polled: " + q.poll());
      System.out.println("Polled: " + q.poll());
      System.out.println("Polled: " + q.poll());
      System.out.println("Polled: " + q.poll());
      System.out.println("Polled: " + q.poll());
      System.out.println("Polled: " + q.poll());
      
      
   }//end of main
}//end of Driver