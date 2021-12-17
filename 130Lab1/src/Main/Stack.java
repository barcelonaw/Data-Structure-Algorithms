package Main;

public class Stack {

	LinkedList stack = new LinkedList();

		public String About() {

			return "Mico Barcelona CSC130";

	}

		public void push(double value) {

			stack.AddHead(value);

	}

		public double pop() {

			return (double) stack.RemoveHead();

	}

		public double peek() {
			
			return (double) stack.PeekHead();

	}

		public boolean isEmpty() {

			return stack.head == null;

	}

}
