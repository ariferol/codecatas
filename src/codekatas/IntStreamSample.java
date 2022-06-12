/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codekatas;

import java.util.stream.IntStream;

/**
 *
 * @author aerol
 */
public class IntStreamSample {

    public static void main(String[] args) {

        IntStream.rangeClosed(1, 10).forEach(t -> System.out.println(Thread.currentThread().getName() + " : " + t));
        
        //paralel stream test;
        IntStream.rangeClosed(1, 10).parallel().forEach(t -> System.out.println(Thread.currentThread().getName() + " : " + t));
    }
}
