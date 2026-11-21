# Searching, sorting and array patterns

## Binary search

On sorted `[1, 3, 5, 7, 9]`, target 7: check index 2 (5), discard the left side including 5, then check the remaining interval. A closed interval `[low, high]` is nonempty while `low <= high`; update to `mid + 1` or `mid - 1` after excluding mid. Time O(log n), iterative auxiliary space O(1). For lower bound, define the predicate and return the insertion position, which can be n. Empty input, duplicates and absent targets test the invariant.

## Sorting and selection

Insertion sort is O(n²) worst case and is useful for small/nearly sorted examples; merge sort is O(n log n) and commonly uses O(n) auxiliary space for arrays. Quicksort is O(n log n) average but O(n²) worst case; recursion space depends on implementation. Heapsort is O(n log n) with O(1) auxiliary array space in an in-place implementation. Verify stability and mutation for the specific implementation. For top k, a heap gives O(n log k) and O(k) space; quickselect is average O(n), worst O(n²).

## Kadane: maximum nonempty subarray sum

For `[-2, 3, -1, 4, -5]`, initialize `ending = best = -2`. At each next x, `ending = max(x, ending + x)` and `best = max(best, ending)`. Values of `ending` become 3, 2, 6, 1; the answer is 6 from `[3, -1, 4]`. The invariant is that `ending` is the best nonempty subarray ending at the current index. O(n) time, O(1) space. Initializing to zero incorrectly permits an empty subarray when all numbers are negative. Define empty input and use `long` if sums can overflow.

## Boyer–Moore majority vote

A majority occurs more than n/2 times. On `[2, 1, 2, 2, 3]`, a candidate and counter cancel pairs of different values; the remaining candidate is 2. O(n) time and O(1) space. The counter is not the actual frequency. If existence is not guaranteed, count the candidate in a second pass; return no majority if its frequency is not greater than n/2. Empty input needs explicit handling. This does not find the mode in general.

## Dutch national flag

For values 0, 1 and 2, maintain `[0, low)` as zeros, `[low, scan)` as ones, `[scan, high]` unknown and `(high, n)` twos. Swap a zero with `low` and advance both; advance over a one; swap a two with `high` and decrement `high` without advancing `scan`, because the swapped-in value is unknown. For `[2, 0, 1]`, the two swaps yield `[0, 1, 2]`. O(n) time, O(1) space; validate the domain if it is not guaranteed.

## Other useful patterns

Two pointers and sliding windows exploit an invariant over a moving range; prefix sums accelerate static range queries. Sort intervals and define whether touching endpoints overlap before merging. A monotonic stack finds next-greater elements; a monotonic deque tracks window extrema. Each element is pushed and popped at most once in the standard solutions, so O(n) total operations. Practice all-negative Kadane inputs, no-majority inputs, repeated flag values, empty intervals and duplicate search keys.
