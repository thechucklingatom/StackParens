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
        String input;
        Scanner reader = new Scanner(System.in);
        ArrayStack myStack = new ArrayStack();
        System.out.print("Please enter a string. > ");
        input = reader.next();
        System.out.println(input);
        
        for(int i=0; i<input.length(); i++){
            char ch = input.charAt(i);
            System.out.println(ch);
            try{
                
            }catch(EmptyStackException | FullStackException e){
                
            }
            
        };
    }
    
}
