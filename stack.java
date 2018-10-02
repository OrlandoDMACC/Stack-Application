package stack;

public class ArrayStack {
	private char[] ArrayStack = null;
	private int top;

	public ArrayStack(int capacity) {
		ArrayStack = new char[capacity];
		top = -1;
	}

	public int getArrayLength() {
		return ArrayStack.length;
	}

	public void push(char item) {

		if (top < ArrayStack.length) {

			top++;

			ArrayStack[top] = item;

		} else {

			System.out.println("Stack Overflow !");

		}

	}

	public char pop() {

		if (top >= 0) {

			return ArrayStack[top--];

		} else {

			System.out.println("Stack underflow !");
			return Character.MIN_VALUE;

		}

	}

	public void print() {

		if (top >= 0) {

			System.out.println("Elements in stack :");

			for (int i = 0; i <= top; i++) {

				System.out.print(ArrayStack[i] + " -> ");

			}

		}

		System.out.println();

	}

	public int size() {

		return (top + 1);

	}

	public boolean isEmpty() {

		return (top == -1);

	}

	public boolean isFull() {
		return top == ArrayStack.length;
	}

	public char top() {

		if (isEmpty()) {

			return Character.MIN_VALUE;

		}

		return ArrayStack[top];

	}
}
