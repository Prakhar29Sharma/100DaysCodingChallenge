import java.util.Scanner;

class Stack {
	private int[] stack;
	private int top;
	private int capacity;
	
	Stack(int size){
		stack = new int[size];
		top = -1;
		capacity = size;
	}
	
	void push(int value) {
		if(top == capacity-1) {
			System.out.println("Stack is Full");
		} else {
			top++;
			stack[top] = value;
		}
	}
	
	void pop() {
		if(top == -1) {
			System.out.println("Stack is Empty!");
		} else {
			System.out.println("Popped " + stack[top--] + "!");
		}
	}
	
	void show() {
		int i;
		for(i = top; i >= 0; i--) {
			if(i == top) {
				System.out.println(stack[i] + " <- top ");
			} else {
				System.out.println(stack[i]);
			}
		}
	}
	
	
}

public class StackArray {
	public static void main(String[] args) {
		int ch, s, value;
		try (Scanner in = new Scanner(System.in)) {
			System.out.println("Enter Size of the stack : ");
			s = in.nextInt();
			
			Stack stack = new Stack(s);
			
			while(true) {
				System.out.println("1. Push\n2. Pop\n3. Show\n4. Exit");
				ch = in.nextInt();
				
				switch(ch) {
				case 1:
					System.out.println("Enter a value you want to add : ");
					value = in.nextInt();
					stack.push(value);break;
				case 2:
					stack.pop();break;
				case 3:
					stack.show();break;
				case 4:
					return;
				default:
					System.out.println("Invalid Choice! Try Again!");
				}
			}
		}
		
		
	}
}
