package Main;

public class Main {
	public static void main(String[] args) {

		// test for the stack

		Stack st = new Stack();

			System.out.println(st.About());

			System.out.println("Empty Stack? " + st.isEmpty());
			
			
				
				st.push(1);
				st.push(2);
				st.push(3);
				st.push(4);
				st.push(5);
		
			System.out.println("Stack: " + st.peek());

				st.pop();

			System.out.println(st.peek());

				st.pop();
				st.pop();

			System.out.println("Empty Stack? " + st.isEmpty());

			System.out.println("\n\n");

		// test for the q

		Queue qu = new Queue();

			System.out.println(qu.About());

			System.out.println("Queue Empty? " + qu.isEmpty());

				qu.enqueue("A");
				qu.enqueue("B");
				qu.enqueue("C");
				qu.enqueue("D");
				qu.enqueue("E");

			System.out.println("Queue: " + qu.dequeue());
			System.out.println("Peek queue: " + qu.peek());
			System.out.println(qu.peek());

				qu.dequeue();

			System.out.println(qu.peek());

			System.out.println("Queue Empty? " + qu.isEmpty());

				qu.dequeue();
				qu.dequeue();

			System.out.println("dequeue twice: " + qu.peek());

			System.out.println("\n\n");

		// pool experiemnt testing/displaying nodes
	
			//fix pool size (have to make sure head is being used for pool)/ node size/ nodes displaying correct numbers. 
		
			
			
		LinkedList a = new LinkedList();

			
		
			System.out.println(a.About());
		
			System.out.println("\n\n");
			
			System.out.println("Peeking head at no input: " + a.PeekHead());
			
			a.AddHead(1); 
			
			a.AddHead(2);
			
			
			a.AddHead(93);
			
			a.AddHead(4);
			
			a.AddHead(5);
			
			a.AddHead(36);
			
			System.out.println("Peeking head at 6th input: " + a.PeekHead());
			
			a.AddHead(8);
			
			a.AddHead(7);
			
			a.AddHead(27);
			
			a.AddHead(149);
			
			System.out.println("Nodes in the linked list: " + a.head.value + "-->" + a.head.next.value + "-->" + a.head.next.next.value + "-->" + a.head.next.next.next.value+ "-->" +
							a.head.next.next.next.next.value+ "-->" + a.head.next.next.next.next.next.value+ "-->" +
							a.head.next.next.next.next.next.next.value + "-->" + a.head.next.next.next.next.next.next.next.value+ "-->"  +
							a.head.next.next.next.next.next.next.next.next.value +"-->" + a.head.next.next.next.next.next.next.next.next.next.value + "-->" + null);
			
			
			
		
			
			System.out.println("Peeking head at 10th input: " +a.PeekHead());

		
			
			System.out.println("Size of the linked list is: " + a.llLength());

	}
}
