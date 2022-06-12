/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codekatas;

/**
 *
 * @author aerol
 */
public class Factorial {

    public static void main(String[] args) {
        int n = 5;
        int result =0; 
//        result = factorialImperative(n);
        result = factorialRecursive(n); 
        System.out.println(n + " faktoriyel = " + result);
    }

    private static int factorialImperative(int n) {
        int multiplication = 1;
        for (int i = 1; i <= n; i++) {
            multiplication = multiplication * i;
//            System.out.println(multiplication);
        }
        return multiplication;
    }

    private static int factorialRecursive(int n) {
        int result=1;
        if(n>1)
            result = n*factorialRecursive(n-1);
        return result;
    }
}
