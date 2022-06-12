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
public class VariableExchange {

    public static void main(String[] args) {
        int a = 5;
        int b = 3;
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("a nin yeni degeri = " + a);
        System.out.println("b nin yeni degeri = " + b);
    }
}
