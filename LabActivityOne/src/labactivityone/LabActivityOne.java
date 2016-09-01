/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labactivityone;

import java.util.Scanner;

/**
 *
 * @author mamulla
 */
public class LabActivityOne {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner musa = new Scanner(System.in);
    System.out.println("\t\t\t ##### Enter The String here ##### : ");
    String m= musa.nextLine();
    String f;
   
    
    for(int j =0; j<m.length(); j++)
    {
        f= Character.toString(m.charAt(j));
        switch(f){
            
            case "+":
                System.out.println("\t\t\t Identifier : +, Symbolic Name: PLUS :)");
                break;
                
            case "-":
                System.out.println("\t\t\t Identifier : -, Symbolic Name: MINUS :)");
                break;
                
            case "*":
                System.out.println("\t\t\t Identifier : *, Symbolic Name: TIMES :)");
                break;
                
            case "/":
                System.out.println("\t\t\t Identifier : /, Symbolic Name: DIVIDE :)");
                break;  
            case "(":
                System.out.println("\t\t\t Identifier : (, Symbolic Name: LPAREN :)");
                break;
             case ")":
                System.out.println("\t\t\t Identifier : ), Symbolic Name: RPAREN :)");
                break;
              case "\"":
                System.out.println("\t\t\t Identifier : \', Symbolic Name: Double quote :)");
                break;
             case "=":
                System.out.println("\t\t\t Identifier : =, Symbolic Name: ASSIGN :)");
                break;
                
             case ";":
                System.out.println("\t\t\t Identifier : ;, Symbolic Name: SEMI :)");
                break;
             default:
                 if (f.matches("[a-z]") || f.matches("[A-Z]")) {
                     System.out.println("\t\t\t Identifier: " + f + ", Symbolic Name: LETTER :)");
                 }
                 else if (f.matches("[0-9]")) {
                     System.out.println("\t\t\t Identifier: " + f + ", Symbolic Name: DIGIT :)");
                 }
                
        } 

    }
    
}
}
