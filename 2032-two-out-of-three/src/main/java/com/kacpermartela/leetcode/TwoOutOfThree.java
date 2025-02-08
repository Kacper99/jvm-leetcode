package com.kacpermartela.leetcode;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class TwoOutOfThree {

    public static List<Integer> twoOutOfThree(int[] nums1, int[] nums2, int[] nums3) {
        final var set1 = toSet(nums1);
        final var set2 = toSet(nums2);
        final var set3 = toSet(nums3);

        final var intersection1_2 = intersection(set1, set2);
        final var intersection1_3 = intersection(set1, set3);
        final var intersection2_3 = intersection(set2, set3);

        intersection1_2.addAll(intersection1_3);
        intersection1_2.addAll(intersection2_3);

        return new ArrayList<>(intersection1_2);
    }

    private static Set<Integer> toSet(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int num : nums) {
            set.add(num);
        }
        return set;
    }

    private static Set<Integer> intersection(Set<Integer> set1, Set<Integer> set2) {
        final var intersection = new HashSet<>(set1);
        intersection.retainAll(set2);
        return intersection;
    }
}
