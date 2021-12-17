package Main;

public class Queue {

	LinkedList queue = new LinkedList();

		public String About() {
		
			return "MICO Barcelona CSC130";

	}

		public void enqueue(String value) {
		
			queue.AddHead(value);

	}

		public String dequeue() {

			return (String) queue.RemoveHead();

	}

		public String peek() {

			return (String) queue.PeekHead();

	}

		public boolean isEmpty() {

			return queue.head == null;

	}

}
