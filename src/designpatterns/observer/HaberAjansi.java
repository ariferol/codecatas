/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package designpatterns.observer;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author aerol
 */
public class HaberAjansi {

    private List<IKanal> kanalList = new ArrayList<>();

    public void uyeOl(IKanal kanal) {
        this.kanalList.add(kanal);
    }

    public void uyeliktenCik(IKanal kanal) {
        this.kanalList.remove(kanal);
    }

    public void haberiYayinla(String haber) {
        for (IKanal tempKanal : kanalList) {
            tempKanal.haberiDuyur(haber);
        }
    }
}
