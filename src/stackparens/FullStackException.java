package stackparens;

//Stolen erm "borrowed" from the book
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
    
    //in case they enter more than 1000 parens
    public String toString(){
        return("Too many Parens)");
    }

}