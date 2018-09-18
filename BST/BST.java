//NAME:AARON HABANA
//DATE: 09/15/2017
//ASSIGNMENT: BST.java
//PURPOSE: Program a binary search tree (“BST”) in Java by implementing the interface given 



public class BST<E extends Comparable<E>> implements BinaryTree<E> {

   //BST root
   private Node<E> root;

   //CONSTRUCT TREE

   public BST(){
      root = null;
   }

   
   /*
   * INSERTION
   *
   * @params: item to insert
   *
   */ 
   public void insert(E item){
      root = insert(item, root);
   }
   
   public Node<E> insert(E item, Node<E> n) {
      //checks if root is null, if it is, create new node
      if(n == null){   
         return new Node<E>(item, null,null);   
      }
      int cmp = item.compareTo(n.value);
      //recursively check if item is less than, insert to left if true
      if(cmp<0){
         n.left = insert(item,n.left);
      }
      else if(cmp>0){
      //recursively check if item trying to insert is greater than root, if it is, insert to right
         n.right = insert(item,n.right);
      }
      return n;
   }
   
   /*
   *
   *  FIND/SEARCH - returns the E item, else return null
   *  
   *  @params: item to find
   *  @returns: item found
   */
   public E find (E item) {
      Node<E> node = root;
      //traverses down the tree until it finds a match
      while((node.value != item) &&(node != null) && (node.value !=null)){
         if(item.compareTo(node.value)<0){
            node = node.left;
         }
         else{
            node = node.right;
         }
      }
      
      return node.value;
   }
   
   public Node<E> search(E item){
      //node pointing to root. then compares the value to item, returns Node<E> if in tree
      Node<E> node = root;
      while((node.value != item) &&(node != null) && (node.value !=null)){
         if(item.compareTo(node.value)<0){
            node = node.left;
         }
         else{
            node = node.right;
         }
      }
      return node;
   }
  
   
   //FIND MAX
   public E findMax(){
      if(root == null) {
         return root.value;
      }
      return findMax(root).value;
   }
   //FIND MAX given node as param
   public Node<E> findMax(Node<E> n){
      if(n==null){
         return n; 
      }
      while(n.right != null) {
         n = n.right;
      }
      return n;
   }
   //FIND MIN
   public E findMin() {
      if(root == null) {
         return root.value;
      }
      return findMin(root).value;
   }
   //FIND MIN given node as param
   public Node<E> findMin(Node<E> n) {
      if(n==null){
         return n;
      }
      while(n.left != null) {
         n = n.left;
      }
      return n;
   }
   
   
   /*
   *
   *  REMOVE/DELETE
   *
   *  @params: item to delete
   *  @returns: n/a
   */
   public void delete(E item){
      root = delete(item, root);
   }
   
   
   public Node<E> delete(E item, Node<E> n){
      if(n == null) {
         return n;
      }
      
      if((item.compareTo(n.value))<0) {
         n.left = delete(item, n.left);
      }
      else if((item.compareTo(n.value))>0){
         n.right = delete(item, n.right);
      }
      else if((n.left != null)&&(n.right !=null)) {
         n.value = findMin(n.right).value;
         n.right = delete(n.value, n.right);
      }
      /*
       * If left child of node is null, n takes left's place.
       * If not, n takes the place of right child 
       *
      */ 
      else{
       
         if(n.left != null){
            n = n.left;
         }
         else{
            n = n.right;
         }
      }
      return n;
   }
   
      
   
   /* 
    * HEIGHT/MAX HEIGHT
    *
    * @Params: Node to check
    * if not it's null, return -1;
    * otherwise, return its height
   */
   private int getNodeHeight(Node<E> n){
      int retVal;
      if(n==null){
         retVal = -1;
      }
      else{
         retVal = n.height;
      }
      return retVal;
      
      
   }
   public int maxHeight(){//returns max height
      return treeHeight(root)-1;
   }     
   
   
   public int height(E item){// height of the E item
      return treeHeight(search(item));
   } 
   public int height(Node<E> n) {//height of tree with Node params
      return treeHeight(n);
   }
  
  
   public int treeHeight(Node<E> n) {
      if (n==null) {
         return 0;
      }
      else{
         return 1+Math.max(treeHeight(n.left),treeHeight(n.right));
      }
      
   }
 
    //Left subtree - returns the size of the left subtree
   public int leftSubtree(E item) {
      return leftSubtree(root);
   }
   private int leftSubtree(Node<E> n) {
      if (n == null) { 
         return -1;
      }
      else {
         return 1 + Math.max(leftSubtree(n.left), leftSubtree(n.right));
      }
   }
    //Right Subtree - /returns the size of the right subtree
   public int rightSubtree(E item) {
      return rightSubtree(root);
   }
   private int rightSubtree(Node<E> n) {
      if (n == null){
         return -1;
      }
      else{
         return 1+ Math.max(rightSubtree(n.left), leftSubtree(n.right));
      } 
   }

   /*
   *
   *  STATUS: return 0 if root, 1 if left child, 2 if right child
   *  @Params: item to check status of
   *  @returns: size
   */
   
   public int status(E item){
      
      Node<E> temp = search(item);  
      int retVal = 0;
      if(root == temp) {
         retVal = 0;
      }
      
      else if(item.compareTo(root.value)<0){
         retVal = 1;
      }
         
      else if(item.compareTo(root.value)>0){
      
         retVal = 2;
      }
      return retVal;
   }
   
   /*
   *
   *  PRINT - IN ORDER TRAVERSAL
   *
   */
   public void printInOrderTraversal(){
      printInOrder(root);
   }
  
   public void printInOrder(Node<E> n) {
      
      if( n == null) {
         return;
      }
      else{
         printInOrder(n.left);
         System.out.print(n.value+" ");
         printInOrder(n.right);
      
      }
      
   }   
 
}

/*SOURCE: www.mta.ca/~rrosebru/oldcourse/263114/Dsa.pdf*/