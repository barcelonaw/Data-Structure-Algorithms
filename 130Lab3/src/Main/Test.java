package Main;
//Mico Barcelona CSC130

public class Test {
    public static void main(String args[]) {

        BinarySearchTree tree = new BinarySearchTree();
        System.out.println("Binary Tree no order: ");
        
        tree.add(10, "Blastoise");
        tree.add(40, "Pidgeot");
        tree.add(30, "Slowbro");
        tree.add(5, "Dragonite");
        tree.add(74,"Kadabra");
        tree.add(7, "Gengar");
        tree.add(17, "Psyduck");
        tree.add(35, "Starmie");
        tree.add(3, "Snorlax");
       
        
        tree.Print();
        
        System.out.println();
      
    
      

    }
}