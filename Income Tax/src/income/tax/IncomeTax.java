/* Lee Li
 * Income Tax 
 * 10/15/2018
 */
package income.tax;

import java.util.Scanner;

/**
 *
 * @author The Qi xiao Li
 */
public class IncomeTax {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
       Scanner KeyedInput = new Scanner(System.in);
       
       
       final double Tax = 0.13;
       
       int salary;
       
       System.out.println("Please enter the salary:");
       salary =  KeyedInput.nextInt();
       
       double IncomeTax;
       
       IncomeTax = salary * Tax;
       
       System.out.println("Your Income Tax is" + IncomeTax);
       
       
    }
    
}
