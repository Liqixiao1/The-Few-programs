/*Lee li 
 *Shopping program
  Oct/10/2018
 */ 

package shopping;

import java.util.Scanner;

public class Shopping {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner keyedInput = new Scanner(System.in);
        
        int num1;
        //num1 =  number of USB storage devices
        int num2;
        //num2 = number of keyboards they would like to purchase
        int num3;
        //num3 = number of computer mice they would like to purchase
        
        double price1 = 19.99;
        //price1 = price of one USB storage devices
        double price2 = 49.99;
        //price2 = price of one keyboard
        double price3 = 25.99;
        //price3 = price of one computer mouse
        
        double together; 
        
        
         
         System.out.println("Please enter the num1");
         num1 = keyedInput.nextInt();
         System.out.println("Please enter the num2");
         num2 = keyedInput.nextInt();
         System.out.println("Please enter the num3");
         num3 = keyedInput.nextInt();
        
         together = num1 * price1 + num2 * price2 + num3 * price3;
        
        
         
         System.out.println("the sum" + together);
         
         
         
         final double Taxrate = 0.13;
         
         double AmountofTax ;
         
        AmountofTax = num1 * price1 * Taxrate + num2 * price2 * Taxrate + num3 * price3 * Taxrate; 
        
        System.out.println("AmountofTax" + AmountofTax);
        // It is the amount of Taxes
        
         
         
         
         
         
         
         
         
         
         
       
       
         
         
        
       
        
            
        
         
         
         
         
         
         
         
         
         
         
         
        
    }
    
}
