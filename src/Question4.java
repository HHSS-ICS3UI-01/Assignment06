
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author stahc1596
 */
public class Question4 {
public static double compoundInterest(double p, double r, int n){
    double base = p*(1 + r);
    base = Math.pow(base, r);
    return base;
}
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.println("Input a initial amount.");
        double initial = input.nextDouble();
        System.out.println("Input a interest rate.");
        double interest = input.nextDouble();
        System.out.println("Input a year.");
        int year = input.nextInt();
        double answer = compoundInterest(initial, interest, year);
        System.out.println("Your balance is " + answer);
    }
}