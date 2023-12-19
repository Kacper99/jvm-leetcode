# 74 Search a 2D Matrix

## Solution
With this solution I initially do a binary search on the rows of the matrix to find which row to search for the target
value in. I then perform a binary search within that row to find the target value. Therefore, giving this solution
a runtime of `O(log(m*n))` where `m` is the matrix width and `n` is the matrix height. 