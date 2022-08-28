/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package questions.interview.mixed;

import java.util.Arrays;
import java.util.HashMap;

/**
 *
 * @author aerol
 */
/**
 * Q: Given integers nums with even length, return true if and only if it is
 * possible to reorder it such that num[2*i+1]=2*nums[2*i] for every
 * 0<=i<len(nums)/2 Note: Bu cozum bence yanlis , ama onaydan 100 olarak
 * geciyor!
 */
public class IQ1 {

    public static boolean canReorderDoubled(int[] arr) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int val : arr) {
            map.put(val, map.getOrDefault(val, 0) + 1);
        }
        Arrays.sort(arr);
        for (int val : arr) {
            if (val != 0 && map.containsKey(val) && map.containsKey(2 * val)) {
                if (map.getOrDefault(val, 0) > 1) {
                    map.put(val, map.getOrDefault(val, 0) - 1);
                } else {
                    map.remove(val);
                }
                if (map.getOrDefault(2 * val, 0) > 1) {
                    map.put(2 * val, map.getOrDefault(2 * val, 0) - 1);
                } else {
                    map.remove(2 * val);
                }
            }
        }
        if (map.size() == 0) {
            return true;
        } else if (map.size() == 1 && map.containsKey(0)) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
//        int[] nums = new int[args.length];
        int[] nums = {4, -2, 2, -5};
//        for (int i = 0; i < args.length; i++) {
//            nums[i] = Integer.parseInt(args[i]);
//        }
        System.out.print(canReorderDoubled(nums));
    }
}
