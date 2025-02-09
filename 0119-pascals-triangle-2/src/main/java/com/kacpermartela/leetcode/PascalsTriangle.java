package com.kacpermartela.leetcode;

import java.util.ArrayList;
import java.util.List;

public class PascalsTriangle {

    public static List<Integer> getRow(int rowIndex) {
        List<Integer> prevRow = new ArrayList<Integer>();
        for (int i = 0; i < rowIndex + 1; i++) {
            if (i == 0) {
                prevRow = List.of(1);
            } else if (i == 1) {
                prevRow = List.of(1, 1);
            } else {
                List<Integer> row = new ArrayList<>();
                row.add(1);
                for (int j = 1; j < i; j++) {
                    final var upAndLeft = prevRow.get(j - 1);
                    final var upAndRight = prevRow.get(j);
                    row.add(upAndLeft + upAndRight);
                }
                row.add(1);
                prevRow = row;
            }
        }

        return prevRow;
    }
}
