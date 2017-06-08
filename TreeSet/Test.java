//NAME: AARON HABANA
//DATE: 02/07/2017
//ASSIGNMENT: Test.java
//PURPOSE: to implement set data structures using generic java types

import java.util.Iterator;

public class Test implements Comparable<Test> {
  
   private int key;
   private int val;
   /*
   * private default constructor
   *
   * @params - none
   * @throws - n/a
   * @returns - n/a
   ************************************************/
   private Test(){}
   
   
   /*
   *  Constructor
   *
   * @params - input is the keys 
   * @throws - n/a
   * @returns - n/a
   ************************************************/
   public Test (int key){
   
      this.key = key;
      val = ((int)(Math.random()*500)+0);
   }
   
   /*
   * @Override method to compare this.key with that.key
   * returns if the key is equal 
   *
   * @params - none
   * @throws - n/a
   * @returns - 0 if it is equal, 1 or -1 if not 
   ************************************************/
   @Override
   public int compareTo(Test that) {
      
      if(this.key > that.key) {
         return 1;
      }
      else if(this.key < that.key) {
         return -1;
      }
      return 0;
   }
   
   /*
   * getter for key
   * 
   * @params - none
   * @throws - n/a
   * @returns - returns key
   ************************************************/
   public int getKey() {
      return this.key;
   }
   
   /*
   * public getter for val
   *
   * @params - none
   * @throws - n/a
   * @returns - returns val;
   ************************************************/
   public int getVal() {
      return val;
   }
   
}//end of class (Test)