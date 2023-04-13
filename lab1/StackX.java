package lab1;

public class StackX {
	private int top;
	private int maxSize;
	private char [] stackArray;
	
	//constructor
	public StackX(int s){
		maxSize = s;
		stackArray = new char[maxSize];
		top = -1;
	}
	
	//push
	public void push(char j) {
		if(top == maxSize -1) {
			System.out.println("Stack is full");
		}
		else {
			stackArray[++top]=j;
		}
	}
	
	//pop
	public char pop(){
		if(top ==  -1) {
			System.out.println("Stack is empty");
			return 0;
		}
		else {
			return stackArray[--top];

		}
		
	}
	
	//peek
	public char peek() {
		if(top ==  -1) {
			System.out.println("Stack is empty");
			return 0;
		}
		else {
			return stackArray[top];
		}
	}
	
	//isEmpty
	public boolean isEmpty(){
		if(top == -1)
			return true;
		else
			return false;
	}
	
	//isFull
	public boolean isFull(){
		if(top == maxSize-1)
			return true;
		else
			return false;
	}

}
	
	
	
	
	
	


