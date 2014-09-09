package stackparens;

//Stolen erm "borrowed" from the book
/**
* Runtime
*
exception thrown when one tries to· perform operation top or
pop on an empty stack.
*/
public class EmptyStackException extends RuntimeException { 

    public EmptyStackException(String err) { 
        
        super( err); 
        
        
    } 
    //this is for the extra end paren
    public String toString(){
        return("Stack Empty, Mismatched Parens )");
    }

}