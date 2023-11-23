package practical_1;
import java.util.*;

public class Application {
	
	public static void main(String args[]) {
		StackADT<Integer> arr = new ArrayStack<>();
		
		Scanner scn = new Scanner(System.in);
		
		String task = "";
		
		while(task != "off") {
			
			System.out.println("Would you like to 'push' to the stack, 'pop' from stack, 'examine' top element of stack, check if stack is 'empty', or check stack 'size'? To shut down, type 'off'");
			task = scn.nextLine();
		
		switch(task) {
		
		case "push":
			try {
				System.out.println("Enter integer to push to stack");
				String numb = scn.nextLine();
				int num = Integer.parseInt(numb);
				arr.push(num);
				System.out.println(num + " pushed to stack.");
				task = "";
				break;
			} catch(Exception FullStackException) {
				System.out.println("Full stack!");
				break;
			}
				
		case "pop":
			//arr.pop();
			try {	
				System.out.println(arr.pop() + " popped from stack");
				task = "";
				break;
			} catch(Exception EmptyStackException) {
				System.out.println("Stack is empty!");
				break;
			}
		
		case "examine":
			try {
				System.out.println(arr.top());
				task = "";
				break;
		} catch(Exception EmptyStackException) {
			System.out.println("Stack is empty!");
			break;
		}
		
		case "size":
			task = "";
			System.out.println(arr.size());
			break;
			
		case "empty":
			System.out.println(arr.isEmpty());
			break;
			
		case "off":
			System.out.println("Powering off.");
			task = "off";
			break;
			
		}
		}
	}

}
