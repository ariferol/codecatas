/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codekatas;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author aerol
 */
public class CodeKatas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Soru linki : https://www.hackerrank.com/challenges/non-divisible-subset/problem
        Scanner input = new Scanner(System.in);
        List<Integer> tempList = new ArrayList<>();
        System.out.println("Dizi boyutunu giriniz: ");
        int n = input.nextInt();
        System.out.println("Bolunecek sayiyi giriniz: ");
        int k = input.nextInt();
        int[] S = new int[n];

        for (int i = 0; i < S.length; i++) {
            System.out.println("Dizinin "+i+" inci eleman degerini giriniz : ");
            S[i] = input.nextInt();
        }
        System.out.println("Dizi : " + Arrays.toString(S));
        int count = 0;
        for (int i = 0; i < S.length; i++) {
            for (int j = i + 1; j < S.length; j++) {
                int sum = S[i] + S[j];
                count = sum % k == 0 ? count : ++count;
            }
        }
        System.out.println("Toplam bolunemeyen alt kume nin eleman sayisi : " + count);

    }
}
