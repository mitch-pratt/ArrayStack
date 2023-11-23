package practical_1;

public class ArrayStack<E> implements StackADT<E>
{
    int top;
    E[] S;
    /**
     * Constructor for objects of class ArrayStack
     */
    public ArrayStack(int capacity)
    {
        top = -1;
        S = (E[]) new Object[capacity]; 
        // Casting is used in the above as generic arrays cannot be created using new E[]
    }
    
    public ArrayStack() {
    	top = -1;
    	S = (E[]) new Object[4];
    }

   /** 
     @throws FullStackException
   */
   public void push(E element){
     if (top == S.length-1)
        throw new FullStackException("Stack is full, so cannot push on to stack");
     top++;
     S[top] = element;
   }

   /**
     @throws EmptyStackException
   */
   public E pop(){
     E element;
     if (isEmpty())
        throw new EmptyStackException("Stack is empty, so cannot pop from stack");
     element = S[top];
     top--;
     return element;
   }
    
   /**
     @throws EmptyStackException
   */
   public E top(){
     if (isEmpty()) {
    	 throw new EmptyStackException("Stack is empty");
     }
     return S[top];
   }

   public int size(){
      return top+1;
   }

   public boolean isEmpty(){
      return top == -1;
   }  
}
