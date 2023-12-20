# Koko Eating Bananas
Koko loves to eat bananas. There are `n` piles of bananas, the `i`th pile has `piles[i]` bananas. The guards have gone and
will come back in `h` hours.

Koko can decide her bananas-per-hour eating speed of `k`. Each hour, she chooses some pile of bananas and eats `k` 
bananas from that pile. If the pile has less than `k` bananas, she eats all of them instead and will not eat any more
bananas during this hour.

Koko likes to eat slowly but still wants to finish eating all the bananas before the guards return.

Return the minimum integer `k` such that she can eat all the bananas within `h` hours.


## Approach
- As Koko can only eat one pile at a time that means `h` will always be at least the length of the piles.
- The maximum value of `k` has to be the maximum value in the list. As we can only eat one pile per hour, there is no 
  need to check greater values of `k` than the maximum.

This means our search space is essentially from 1 to the maximum value. We do a binary search on this range, each time
checking if we can eat the pile of bananas in the allocated time.
