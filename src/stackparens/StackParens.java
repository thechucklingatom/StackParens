/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package stackparens;
import java.util.Scanner;
/**
 *
 * @author atom
 */
public class StackParens {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Vars declaration
        boolean willBreak = false;
        String input;
        Scanner reader = new Scanner(System.in);
        ArrayStack myStack = new ArrayStack();
        //ask for input
        System.out.print("Please enter a string. > ");
        //get input
        input = reader.next();
        //print input back
        System.out.println(input);
        
        //logic stack work
        for(int i=0; i<input.length(); i++){
            char ch = input.charAt(i);
            
            if(ch == '('){
                try{
                    myStack.push(true);
                }catch(EmptyStackException | FullStackException e){
                    System.out.println(e.toString());
                    willBreak = true;
                }
            }else if(ch == ')'){
                try{
                    myStack.pop();
                }catch(EmptyStackException | FullStackException e){
                    System.out.println(e.toString());
                    willBreak = true;
                }
            }
            //just to gaaruntee the break works correctly
            if(willBreak){
                break;
            }
            
        };
        
        //check and out put results
        if(!myStack.isEmpty()){
                System.out.println("Unbalanced parens (");
        }else if(!willBreak && myStack.isEmpty()){
                System.out.println("Balanced parens");
        }
    }
    
}
