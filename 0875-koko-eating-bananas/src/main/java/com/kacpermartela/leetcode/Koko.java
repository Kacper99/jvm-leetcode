package com.kacpermartela.leetcode;

import java.util.stream.IntStream;

public class Koko {

    public static int minEatingSpeed(int[] piles, int h) {
        int largestPile = 0;
        for (int pile : piles) {
            largestPile = Math.max(largestPile, pile);
        }

        int left = 1;
        int right = largestPile;
        int k = largestPile;

        while (left <= right) {
            int middle = left + (right - left) / 2;

            long totalTimeToEat = 0;
            for (int pile: piles) {
                int hoursRequiredToEatPile = Math.ceilDiv(pile, middle);
                totalTimeToEat += hoursRequiredToEatPile;
            }

            if (totalTimeToEat <= h) {
                k = Integer.min(k, middle);
                right = middle - 1;
            } else {
                left = middle + 1;
            }
        }

        return k;
    }
}
