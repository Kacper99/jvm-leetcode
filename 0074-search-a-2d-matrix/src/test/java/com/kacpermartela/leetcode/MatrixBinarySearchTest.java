package com.kacpermartela.leetcode;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MatrixBinarySearchTest {

    @Test
    void example1() {
        int[][] matrix = new int[][] {
            new int[] {1, 3, 5, 7},
            new int[] {10, 11, 16, 20},
            new int[] {23, 30, 34, 60}
        };
        int target = 3;
        assertThat(MatrixBinarySearch.searchMatrix(matrix, target)).isTrue();
    }

    @Test
    void example2() {
        int[][] matrix = new int[][] {
            new int[] {1, 3, 5, 7},
            new int[] {10, 11, 16, 20},
            new int[] {23, 30, 34, 60}
        };
        int target = 13;
        assertThat(MatrixBinarySearch.searchMatrix(matrix, target)).isFalse();
    }

    @Test
    void singleElement() {
        int[][] matrix = new int[][] {new int[] {1}};
        int target = 1;
        assertThat(MatrixBinarySearch.searchMatrix(matrix, target)).isTrue();
    }

    @Test
    void singleLineMatrix() {
        int[][] matrix = new int[][] {new int[] {1, 3, 5, 7}};
        int target = 3;
        assertThat(MatrixBinarySearch.searchMatrix(matrix, target)).isTrue();
    }

    @Test
    void singleRowMatrix() {
        int[][] matrix = new int[][] {new int[] {1}, new int[] {3}, new int[] {5}, new int[] {7}};
        int target = 3;
        assertThat(MatrixBinarySearch.searchMatrix(matrix, target)).isTrue();
    }

    @Test
    void emptyMatrix() {
        int[][] matrix = new int[][] {};
        int target = 3;
        assertThat(MatrixBinarySearch.searchMatrix(matrix, target)).isFalse();
    }

    @Test
    void singleRowAllSame() {
        int[][] matrix = new int[][] {new int[] {1, 1, 1, 1}};
        int target = 1;
        assertThat(MatrixBinarySearch.searchMatrix(matrix, target)).isTrue();
    }
}
