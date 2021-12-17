//Mico Barcelona CSC130
package Main;

public class Node{
    public int key;		 // The value that the node contains.
    public Node left;	 // Assign pointers to left and right node.
    public Node right;
    public String value;

 
    public Node(int key, String value){
        this(key, value, null, null);
    }

  
    public Node(int theData, String theValue, Node left, Node right){
        this.key = theData;
        this.value = theValue;
        this.left = left;
        this.right = right;
    }





	//  public void add(int newKey, String value)
    //
    //
    //
    
  //--------------------------------------------------------------------------------- 
    public void add(int key, String value){	//newKey, newValue
        if (key < newKey()) {
            if (getLeft() == null){
                setLeft(new Node(key, value));
            } else {
                getLeft().add(key, value);		//newKey, newValue
            }
        } else if (key > newKey()){
            if (getRight() == null){
                setRight(new Node(key, value));
            } else {
                getRight().add(key, value);	//newKey, newValue
            }
        }
    }
  //--------------------------------------------------------------------------------- 
   
 
    public void Print(int indent){
        for (int newSpace = 0; newSpace < indent; newSpace++){
            System.out.print("  ");
        }
        System.out.println("+--" + newKey() + ": " + newValue()); // Node
        if (getLeft() != null) {
            getLeft().Print(indent + 1);
        } // Left
        if (getRight() != null) {
            getRight().Print(indent + 1);
        } // Right
    }

   //    public String find(int key){
  //	 return get(key, value);
 //       }
//

    
    public int newKey(){
        return key;
    }
    


    public String newValue(){
        return value;
    }

    public Node getLeft() {
        return left;
    }

    public void setLeft(Node left){
        this.left = left;
    }


    public Node getRight(){
        return right;
    }


    public void setRight(Node right){
        this.right = right;
    }


} 