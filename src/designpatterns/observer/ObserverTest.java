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
public class ObserverTest {

    public static void main(String[] args) {
        /**
         * Ornek senaryo : Haber ajansina kayit olan tum haber kanallari haber
         * ajansini dinlerler. Haber ajansi bir haber yayinladiginde kayitli
         * olan tum haber kanallarinda bu haber yayinlanir.
         */

        IKanal k1 = new Kanal1();
        IKanal k2 = new Kanal2();
        IKanal k3 = new Kanal3();

        HaberAjansi ajans = new HaberAjansi();
        ajans.uyeOl(k1);
        ajans.uyeOl(k2);
        ajans.uyeOl(k3);

        ajans.haberiYayinla("Deneme haberi");
    }
}
