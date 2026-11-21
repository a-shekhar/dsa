# Array problems

## Two Sum

- **Difficulty:** Easy ([LeetCode](https://leetcode.com/problems/two-sum/description/))
- **Sources:** [Master the Coding Interview: Data Structures + Algorithms](https://www.udemy.com/course/master-the-coding-interview-data-structures-algorithms/) by Andrei Neagoie; [LeetCode: Two Sum](https://leetcode.com/problems/two-sum/description/)
- **Topics:** Arrays, hash maps
- **Solution:** [TwoSum.java](TwoSum.java)

Find the indices of two distinct elements whose values add up to a target. For example, `[2, 7, 11, 15]` with target `9` returns `[0, 1]`.

### Approach

Visit each element once. Look for its complement (`target - current value`) in a map of values to previously seen indices. If found, return both indices; otherwise, store the current value and index. Looking before inserting ensures that an element is not paired with itself, while allowing duplicate values at different indices.

The method follows LeetCode's integer constraints and returns `[-1, -1]` if no pair exists. LeetCode guarantees exactly one solution.

- **Time:** O(n) on average, assuming average O(1) hash map operations.
- **Extra space:** O(n) for the map.

Run the example from this directory with Java 25:

```sh
java TwoSum.java
```

## Average temperature and days above average

- **Difficulty:** Easy (self-assessed)
- **Source:** Course exercises as described in the study session
- **Topic:** Arrays
- **Solution:** [TemperatureAnalysis.java](TemperatureAnalysis.java)

Given one integer temperature per day, calculate the average and count days strictly warmer than that average. For `[20, 25, 30, 25]`, the average is `25.0` and one day is above it. A day equal to the average does not count.

Sum the temperatures using `long` and divide as a `double` to preserve fractions. Then make a second pass to count values above the average. Both operations take O(n) time and O(1) auxiliary space. At least one temperature is required; an empty array is rejected because its average is undefined. Negative temperatures are valid.

Run with `java TemperatureAnalysis.java` from this directory.

## Array without first and last elements

- **Difficulty:** Easy (self-assessed)
- **Source:** Course exercise as described in the study session
- **Topic:** Arrays
- **Solution:** [WithoutFirstAndLast.java](WithoutFirstAndLast.java)

Copy the elements between the first and last positions into a new array. For `[1, 2, 3, 4, 5]`, the result is `[2, 3, 4]`. Arrays of length two or less produce an empty array; the original array is unchanged.

Copying takes O(n) time and O(n) space for the returned array. Run with `java WithoutFirstAndLast.java` from this directory.
