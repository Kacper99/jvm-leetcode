package com.kacpermartela.leetcode;

import java.util.ArrayList;
import java.util.List;

public class PascalsTriangle {

    public static List<List<Integer>> generate(int numRows) {
        final var rows = new ArrayList<List<Integer>>();
        for (int i = 0; i < numRows; i++) {
            if (i == 0) {
                rows.add(List.of(1));
            } else if (i == 1) {
                rows.add(List.of(1, 1));
            } else {
                List<Integer> row = new ArrayList<>();
                row.add(1);
                for (int j = 1; j < i; j++) {
                    final var prevRow = rows.get(i - 1);
                    final var upAndLeft = prevRow.get(j - 1);
                    final var upAndRight = prevRow.get(j);
                    row.add(upAndLeft + upAndRight);
                }
                row.add(1);
                rows.add(row);
            }
        }
        return rows;
    }
}
