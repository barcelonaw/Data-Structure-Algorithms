package Main;

//Mico Barcelona CSC130

public class BinarySearchTree{
    // Root of Binary Tree
    public Node root;

   
    public String about(){
        return "I am Mico Barcelona and I am making a lab about binary search trees";
    }

  
    public BinarySearchTree(){
        this.root = null;
    }

 
    public BinarySearchTree(Node root){
        this.root = root;
    }
//---------------------------------------------------------------------------------    
    //public void add(int key, String value) {
    
    
    public void add(int key, String value){
        if (getRoot() == null){
            setRoot(new Node(key, value));
        } else{
            getRoot().add(key, value);
           }
       }
 //----------------------------------------------------------------------------------
        	

   

   
    public void Print(){
     
        if (getRoot() != null){
            getRoot().Print(0); 
        }
    }

    
    public Node getRoot(){
        return root;
    }
    

    public void setRoot(Node root){
        this.root = root;
    }
} 