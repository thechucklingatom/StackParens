package stackparens;
/**
* Runtime
*
exception thrown when one tries to· perform operation top or
pop on an empty stack.
*/
public class FullStackException extends RuntimeException { 

    public FullStackException(String err) { 

        super( err); 
    } 
    
    public String toString(){
        return("Stack Empty, Mismatched Parens )");
    }

}