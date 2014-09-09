package stackparens;

//Stolen erm "borrowed" from the book
/**
* Implementation of the stack ADT using a fixed-length array. An
* exception is thrown if a push operation is attempted when the size 

* of the stack is equal to the length of the array. This class 

* includes the main methods of the built-in class java.utiI.Stack. 

*/ 

public class ArrayStack<E> implements Stack<E> {
    protected int capacity;
    // The actual capacity of the stack array
    public static final int CAPACITY = 1000; // default array capacity
    protected E S[];
    // Generic array used to irnplement the stack
    protected int top = -1;
    // index for the top of the stack
    public ArrayStack() {
        this(CAPACITY); // default capacity
    }
    
    public ArrayStack(int cap) {
        capacity = cap;
        S = (E[]) new Object[capacity]; // compiler may give warning, but this is ok
    }
    
    public int size() { 

        return (top + 1); 

    }
    
    public boolean isEmpty() { 

        return (top < 0); 

    }
    public void push(E element) throws FullStackException { 

        if (size() == capacity){

            throw new FullStackException("Stack is full. II"); 
        }
        S[++top] = element;
        

    } 

    public E top() throws EmptyStackException { 

        if (isEmpty()){ 

            throw new EmptyStackException("Stack is empty. "); 
        }
    return S[top]; 

    }
    public E pop() throws EmptyStackException { 

    E element; 

    if (isEmpty()){ 

        throw new EmptyStackException("Stack is empty. "); 
    }
    element = S[top]; 

    S[top--] = null; // dereference S[top] for garbage collection. 

    return element; 

    }
}