package calculator;

/*package calculator;*/

import java.util.Scanner;

/**
 *
 * @author saint
 */
public class Calculator {

    /**
     * @param args the command line arguments
     */
public static void main(String[] args) {
    int result=0;
    System.out.println("1) add");
    System.out.println("2) subtract");
    System.out.println("3) multiply");
    System.out.println("4) divide");
    System.out.println("5) modulo");
    Scanner scan = new Scanner(System.in);
    System.out.println("\n Please enter operator :");
    int Operator = scan.nextInt();
    
    Scanner sc = new Scanner(System.in);
if (Operator>5) {
        if (Operator<1) {
            System.out.println("ERREUR!!!!!!!!!!");
        }
        
        
    }    
    System.out.println("\n Please enter the first number:");
    int operande1 = sc.nextInt();
    Scanner sca = new Scanner(System.in);
    System.out.println("\n Please enter the second number:");
    int operande2 = sca.nextInt();
    if(Operator == 1) {
        result= operande1+operande2;
    }
    if(Operator==2) {
        result= operande1-operande2;
    }
    if(Operator==3) {
        result= operande1*operande2;
    }
    if(Operator==4) {
        result=operande1/operande2;
    }
    if(Operator==5) {
        result=operande1%operande2;
    }
    System.out.println("\n the result is" + result);
}}
