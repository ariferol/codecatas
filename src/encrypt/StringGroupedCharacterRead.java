/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package encrypt;

/**
 *
 * @author aerol
 */
public class StringGroupedCharacterRead {

    /**
     * Problem : Belirli bir metnin encryt edilmis formatta, satir satir
     * yazdirilmek isteniyor. Bunun icin; L = metnin uzunlugu, K = karakok(L),
     * karekok sayisi en yakin bir alt tam sayiya yuvarlanacak, C = enyakin sayi
     * nin bir fazlasi. Bulunan rakam kadar metin karakter sayisi her bir
     * satirda olacak sekilde console a yazdirilacak.
     */
    public static void main(String[] args) {
        enrcrptMessage("denememesaji1");
    }

    private static void enrcrptMessage(String txtMessage) {
        double txtLength = txtMessage.length();
        double karekokLength = Math.sqrt(txtLength);
        int enYakinSayi = (int) Math.floor(karekokLength);
        int bolunecekKarakterSayisi = enYakinSayi + 1;
        for (int i = 0; i < txtMessage.length(); i++) {
            if (i > 0 && i % bolunecekKarakterSayisi == 0) {
                System.out.println(txtMessage.substring(i - bolunecekKarakterSayisi, i));
            }
        }
        if (txtMessage.length() % bolunecekKarakterSayisi > 0) {
            System.out.println(txtMessage.substring(txtMessage.length() - txtMessage.length() % bolunecekKarakterSayisi, txtMessage.length()));
        }
    }

}
