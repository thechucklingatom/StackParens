/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package stackparens;

/**
* Implementation of the stack ADT using a fixed-length array. An
* exception is thrown if a push operation is attempted when the size 

* of the stack is equal to the length of the array. This class 

* includes the main methods of the built-in class java.utiI.Stack. 

*/ 

public class Node<E> { 
// Instance variables: 
    private E element;
    private Node<E> next;

    /** Creates a node with null references to its element and next node. */ 
    public Node(){
        this(null, null);
    }
    /** Creates a node with the given element and next node. */
    public Node(E e, Node<E> n){
        element = e;
        next = n;
    }
    // Accessor methods:
    public E getElement(){
        return element;
    }
    public Node<E> getNext(){
        return next;
    }
    // Modifier methods:
    public void setElement(E newElem){
        element = newElem;
    }
    public void setNext(Node<E> newNext) {
        next = newNext;
    }
}
