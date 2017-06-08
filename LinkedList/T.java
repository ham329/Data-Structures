//NAME:AARON HABANA
//DATE: 02/28/2017
//ASSIGNMENT: LinkedList - User Type - T.java
//PURPOSE: to implement single linked list


class T {
   private String name;
   private int age;
   
   
   /*
   *Constructor
   *init variables
   *
   *@params - name and age
   *@throws - n/a
   *@return - n/a
   */
   public T(String name, int age) {
      this.name = name;
      this.age = age;
   
   }
   
   /*
   *override the toString method
   *
   *@params - none
   *@throws - n/a
   *@return - name and age
   */
   @Override
   public String toString() {
      return "||Name: " + name + ", Age: " + age + "||";
   }
   
   
   /*
   *Override the equals metod. return true if equals
   *
   *@params - user type - input
   *@throws - n/a
   *@return - boolean value of compared objects
   */
   @Override
   public boolean equals(Object input) {
      boolean retVal = false;
      if(input == null) {
         retVal = false;
         
      }
      T userType = (T) input;
      if(!(input instanceof T)) {
         retVal = false;
         
      }
      if((userType.name.equals(this.name)) && (userType.age == this.age)) {
         retVal = true;
      } 
      else {
         retVal = false;
      }
      
      return retVal;
   }
   
}