

//Orlando Winters

/*Error: Could not find or load main class Main
I do not know how to fix this error

*/

class ArrayStack{ 
	public static void main(String[] args) {
		
	}
			private final String[] ArrayStack = null;
			private int[] s;
			private int top;
	
			public ArrayStack(int capacity) {
				s = new int[capacity];
				top = 0;
			}

			public void push(String item) {

				if (top < ArrayStack.length - 1) {

					top++;

					ArrayStack[top] = item;

					System.out.println("push(" + item + ")");

				} else {

					System.out.println("Stack Overflow !");

				}

			}

			public void pop() {

				if (top >= 0) {

					System.out.println("Pop: " + ArrayStack[top]);

					top--;

				} else {

					System.out.println("Stack Underflow !");

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

			public String top() {

				if (isEmpty()) {

					return null;

				}

				return ArrayStack[top];

			}

			{

				ArrayStack stack = new ArrayStack(5);

				System.out.println("Pushing elements: ");

				stack.push("RedShirt");

				stack.push("GreenShirt");

				stack.push("YellowPants");

				stack.push("PurpleSock");

				stack.push("PinkSocks");

				System.out.println("Stack Size: " + stack.size());

				stack.print();

				stack.push("BlueShirt");

				System.out.println("Stack Size: " + stack.size());

				stack.pop();

				stack.pop();

				System.out.println("Stack Size: " + stack.size());

				stack.pop();

				System.out.println("Stack Top: " + stack.top());

				stack.pop();

				stack.pop();

				System.out.println("Stack Size: " + stack.size());

				System.out.println("Stack isEmpty: " + stack.isEmpty());
			}
		}


