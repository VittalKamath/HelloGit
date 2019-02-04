/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cumulative1;
import java.util.Scanner;

/**
 *
 * @author vitta
 */
public class Cumulative1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        double weight, cost = 0;
        int count = 1;
        
        System.out.println("Enter the weight of package, 1");
        weight = input.nextDouble();
        while(weight>0) {
           if(weight<=10) {
               cost = 3;
           } else if(weight>10) {
               cost = 3 + (weight-10)*0.25;
           }
           count++;
           System.out.println("The total shipping price is: " + cost);
           System.out.println("Enter the weight of package, " + count);
           weight = input.nextDouble();
          
        }
        
        
    }
    
}
