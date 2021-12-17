//Mico Barcelona CSC130


package Main;



public class LinkedList {

	public class Node {

		public Object value;
		public Node next;
	
	}

	public Node head = null;
	public Node tail = null;
	public Node pool = null;

	// ABOUT ME TEXT 

	public String About() {

		return "Mico BARCELONA CCS130";
	}

	//ADD AN OBJECT TO THE HEAD OF THE LIST
	
	void AddHead(Object value){
		
		Node add = new Node();
		
		add.value = value;
		
		add.next = head;
		
		if (head == null)
			
			tail = add;
		
		head = add;
		
	}

	// ADD AN OBJECT TO THE TAIL OF THE LIST
	
	void AddTail(Object value){
		
		Node add = new Node();
		
		add.value = value;
		
		if (head == null){
			
			tail = add;
			
			head = add;
			
		}else{
			
			tail.next = add;
			
			tail = add;
		}
	}

	// REMOVE THE HEAD FROM THE LIST
	
	public Object RemoveHead(){
		
		Object value = head.value;
		
		head = head.next;

		if (head == null)
			
			tail = null;
		
		return value;
	}

	// VALUE OF THE HEAD
	
	
	public Object PeekHead(){
		
		try{
			
			return head.value;
		}
		
		catch(Exception e){
			
		return null;
		
		}
	}
	
	///MY ATTEMPS AT THE POOL 


	
	// TEST FOR LENGTH OF THE LL
	
	public int llLength(){
		
		Node add = head;
		
		int count = 0;
		
			while(add != null){
				
				add = add.next;
				
				count++;
			}
			
			return count;
	}

	
	

	
	
	//SUPPOSED TO ADD TO A POOL
	

	}


