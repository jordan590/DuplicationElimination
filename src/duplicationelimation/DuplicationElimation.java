/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package duplicationelimation;
import java.util.Scanner;
/**
 *
 * @author joklu7045
 */
public class DuplicationElimation {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please input 5 numbers between 10 and 100.");
        int[] inputArray = new int[5];
        int a = scan.nextInt();
        inputArray[0] = a;
        int b = scan.nextInt();
        inputArray[1] = b;
        int c = scan.nextInt();
        inputArray[2] = c;
        int d = scan.nextInt();
        inputArray[3] = d;
        int e = scan.nextInt();
        inputArray[4] = e;
        for (int i = 0; i < inputArray.length; i++) {
            System.out.println(inputArray[i]);
        }
        
    }
    
    /*public static int numberCheck(int check) {
        if (10 > check || check > 100){
            return 
        }
    }*/
    
}
