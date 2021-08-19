## java_stack 구현

```java

package structure;

interface StackMenu{
	boolean isEmpty();
	boolean isFull();
	void push(char item);
	char pop();
	char peek();
	void clear();
}


public class Stack implements StackMenu{

	private int top;
	private int stackSize;
	private char[] stackArr;
	
	// 스택을 생성하는 생성자
	public Stack(int stackSize) {
		top = -1;							    // 스택 포인터 초기화
		this.stackSize = stackSize;			    // 스택 사이즈 설정
		stackArr = new char[this.stackSize];    // 스택 배열 생성
	}
	
	// 스택이 비어있는 상태인지 확인
	public boolean isEmpty() {
		return (top == -1);
	}
	
	// 스택이 가득찬 상태인지 확인
	public boolean isFull() {
		return (top == this.stackSize-1);
	}
	
	// 스택에 데이터를 추가
	public void push(char item) {
		if(isFull()) {
			System.out.println("Stack is Full");
		} else {
			stackArr[++top] = item;
			System.out.println("Inserted Item : " + item);
		}
	}
	
	// 스택의 최상위(마지막) 데이터 추출 후 삭제
	public char pop() {
		if(isEmpty()) {
			System.out.println("Deleting fail! Stack is Empty");
			return 0;
		}else {
			System.out.println("Deleted Item : " + stackArr[top]);
			return stackArr[top--];
		}
	}
	
	// 스택의 최상위(마지막) 데이터 추출
	public char peek() {
		if(isEmpty()) {
			System.out.println("Peeking fail! Stack is empty!");
			return 0;
		} else {
			System.out.println("Peeked Item : "+stackArr[top]);
			return stackArr[top];
		}
	}
	
	// 스택 초기화
	public void clear() {
		if(isEmpty()) {
			System.out.println("Stack is already empty!");
		} else {
			top = -1;
			stackArr = new char[this.stackSize];
			System.out.println("Stack is clear!");
		}
	}
	
	// 스택에 저장된 모든 데이터를 출력
	public void printStack() {
		if(isEmpty()) {
			System.out.println("stack is Emtpy!");
		}else {
			System.out.println("Stack elements : ");
			for(int i=0; i<=top; i++) {
				System.out.println(stackArr[i] + " ");
			}
		}
	}
	
	public static void main(String[] args) {
		int stackSize = 5;
		Stack arrStack = new Stack(stackSize);
        
        arrStack.push('A');
        arrStack.printStack();
        
        arrStack.push('B');
        arrStack.printStack();
        
        arrStack.push('C');
        arrStack.printStack();
        
        arrStack.pop();
        arrStack.printStack();
        
        arrStack.pop();
        arrStack.printStack();
        
        arrStack.peek();
        arrStack.printStack();
        
        arrStack.clear();
        arrStack.printStack();

		
	}
}


```