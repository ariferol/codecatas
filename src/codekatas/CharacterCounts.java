/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codekatas;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;
import static java.util.stream.Collectors.counting;
import static java.util.stream.Collectors.groupingBy;

/**
 *
 * @author aerol
 */
public class CharacterCounts {

    public static void main(String[] args) {

        String text = "Deneme metni";
        //Metnin icinde gecen bosluk karakterlerini siliyoruz;
        text = text.replace(" ", "");
        //Sonra karakterleri stream apisi yardimiyla bir map icine saydirip atiyoruz
        Map<String, Long> countMap = Arrays
                .stream(text.split(""))
                .collect(
                        groupingBy(Function.identity(), counting())
                );

        System.out.println("Stream, gorup by count gosterimi : " + countMap);

        Map<String, Integer> characterCounts = new HashMap<>();
        char[] toCharArray = text.toCharArray();
        for (char searchedChar : toCharArray) {
            int sumCharCount = 0;
            for (char foundChar : toCharArray) {
                if (searchedChar == foundChar) {
                    ++sumCharCount;
                }
            }
            characterCounts.put(Character.toString(searchedChar), sumCharCount);
        }
        System.out.println("Procedural gosterim :              " + characterCounts);

    }
}
