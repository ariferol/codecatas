/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package designpatterns.observer;

/**
 *
 * @author aerol
 */
public class Kanal2 implements IKanal {

    @Override
    public void haberiDuyur(String haber) {
        System.out.println("Kanal 2 haber : " + haber);
    }

}
