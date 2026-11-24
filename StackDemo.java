class Stack {
private int[]stack=new int[10];
private int top=-1;
//push operation 
void push (int value){
if (top==9)
System.out.println("Stack Overflow");
else 
Stack[++top] = value;
}
//pop operation 
int pop(){
if (top==-1){
System.out.println("Stack Underflow");
return -1;
}
return stack[top--];
}
//Peek operation 
int peek(){
if (top==-1)
return -1;
return stack[top];
}
//Display operation
void display(){
for(int i =top;i>=0;i--)
System.out.print(stack[i] +" ");
System.out.println();
} 
}
public class StackDemo {
public static void main(String[]args){
Stack s=new Stack();
s.push(10);
s.push(20);
s.push(30);
s.push(40);
System.out.print("Stack:");
s.display();
System.out.println("Top element:"+s.peek());
System.out.println("popped:"+s.pop());
System.out.println("popped:"+s.pop());
System.out.println("Stack after pop: ");
s.display();
}
}